package recursion_demos;

public class Recursion_Demo {

	
	/*
	 * Notes:
	 * 		- A recursive function is a function that calls itself
	 * 		- A recursive function must contain a base case the base case could be
	 * 				- A return statement
	 * 				- Completion of method. 
	 * 		- A recursive function must contain a recursive call that is moving
	 * 		  towards the base case
	 * 		- Any iterative algorithm (loop based) can be written recursively. 
	 * 		- Any recursive algorithm can be written iteratively, but it is not 
	 * 		  realistic.
	 * 		- Only use recursive approaches when it significantly simplifies process. 
	 * 		- When a recursive call is made the location of the code is stored in a
	 * 		  stack. A stack is a data structure with a fixed size that follows the 
	 * 		  the LIFO motto (Last In First Out). If too many recursive called are made
	 * 		  the computer will run out of memory and a stack overflow will occur, a 
	 * 		  runtime error.  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("\n************************");
		System.out.println("TEST: factorial(int n)");
		System.out.println("************************");
		System.out.println("factorial(1) = "+factorial(1));
		System.out.println("factorial(4) = "+factorial(4));
		System.out.println("factorial(13) = "+factorial(13));
		
		
		System.out.println("\n************************");
		System.out.println("TEST: recur(int n)");
		System.out.println("************************");
		System.out.println("recur(27) = "+(27));
		System.out.println("recur(4) = "+recur(4));
		System.out.println("recur(100) = "+recur(100));
		
		
		
		System.out.println("\n************************");
		System.out.println("TEST: whatsItDo(String str)");
		System.out.println("************************");
		//No need to put this in a System.out.println since 
		//the function whatsItDo actually prints out values. 
		//It does not return anything. 
		System.out.print("whatsItDo(\"WATCH\")");
		whatsItDo("WATCH");
		
		
		System.out.println("\n************************");
		System.out.println("TEST: mystery(int n)");
		System.out.println("************************");
		System.out.println("mystery(3) = "+mystery(3));
		System.out.println("mystery(4) = "+mystery(4));
		System.out.println("mystery(20) = "+mystery(20));
	}
	

	//********************************EXAMPLE***********************************
	
	/**
	 * This method is a great starting place for recursion.  It calculates the 
	 * factorial.  
	 * @param n
	 * @return
	 * 
	 * pre-condition: n < 13.  If n is larger than 13 we get overflow errors since
	 * the resulting value is larger than a 32-bit integer can store. 
	 */
	public static int factorial(int n) {
		
		if (n == 1) {
			return 1; //base case
		}
		return n * factorial(n - 1); //recursive call
	}
	
	//********************************EXAMPLE***********************************
	/**
	 *	AP Type Problem: 
	 * 		What value is returned as a result of the call recur(27)?
	 * 
	 * 	For those preparing for IB ensure you trace the output of the call.
	 * 	In the AP this is a multiple choice type problem, on the IB this type
	 * 	of question would require a trace.  
	 *
	 * Technical Point:		Composite Recursive Call. 
	 * @param n
	 * @return
	 * 
	 */
	public static int recur(int n) {
		if (n <= 10) { 
			return n * 2; //base case 
		}
		else {
			return recur(recur(n/3)); //Note composite recursive call. 
		}
	} //end recur
	

	//********************************EXAMPLE***********************************
	/**
	 * AP Type Problem: 
	 * 		What value is returned as a result of the call whatsItDo(27)?
	 *
	 *	For those preparing for IB ensure you trance the output of the call.
	 *	In the AP this is a multiple choice type problem, on teh IB this type 
	 *	of question would require a trace. 
	 *
	 *	Void Recursive Call: This is a void recursive call, which often causes
	 *						 problems since students don't know where the recursive 
	 *						 function ends.  The function ends not on a return, but
	 *				   		 on a completion of the method. 
	 *
	 * 	Technical Point:	You can use a return in a void return method.  Simply type
	 * 					 	type return with no added values and the method will end.
	 *
	 * @param str
	 */
	public static void whatsItDo(String str) {
		
		int len = str.length();
		if (len > 1) {
			
			String temp = str.substring(0,len - 1);
			whatsItDo(temp); //recursive call. 
			System.out.println(temp);
		
		}
		
		//Base Case: Completion of method
	} //end whatsItDo
	
	/**
	 * 
	 * AP Type Problem: 
	 * 		What value is returned as a result of the call mystery(3)?
	 *	
	 *	For those preparing for IB ensure you trance the output of the call.
	 *	In the AP this is a multiple choice type problem, on teh IB this type 
	 *	of question would require a trace. 
	 *
	 *	Technical Point: 	Double recursive call here. 
	 *
	 */
	//********************************EXAMPLE***********************************
	public static int mystery(int n) {
		
		if (n < 0) {
			return 2; //Base Case
		}
		else {
			return mystery(n - 1) + mystery(n - 3); //Double recursive call
		}
	}//end mystery

}
