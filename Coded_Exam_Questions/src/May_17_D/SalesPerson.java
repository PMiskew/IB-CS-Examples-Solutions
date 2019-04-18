package May_17_D;

public class SalesPerson {

	
	private String id; 
	private Sales[] salesHistory; //details of the different sales
	private int count = 0; //number of sales made
	
	//constructor for new sales person
	public SalesPerson (String id) { //EXAM QUESTION 11a
		//WHAT ARE THEY GETTING AT HERE
		//BESIDES TESTING THAT YOU UNDRESTAND CONSTRUCTORS THEY HAVE PUT A LITTLE TWIST. 
		//NOTICE THE PARAMETER AND THE FIELD BOTH ARE CALLED id. 
		//WHAT THIS MEANS IS DUE TO SCOPE IF YOU WRITE ID YOU ARE ACCESSING THE PARAMETER ID
		//YOU NEED TO WRITE this.id TO ACCESS THE FIELD id.
		
		this.id = id; //you need to assign the id parameter to the id field. 
		salesHistory = new Sales[100]; //You need to initalize the array to something to use it. 
		
	} //end SalesPerson constructor
	
	//constructor for a salesperson transferred (together with 
	//their sales details) from another branch
	public SalesPerson (String id, Sales[] s, int c) {
		//code missing 
		this.id = id;
		
		salesHistory = new Sales[s.length];
		
		for (int i = 0; i < s.length; i = i + 1) {
			salesHistory[i] = new  Sales(s[i].getItemId(),s[i].getValue(),s[i].getQuantity());
		}
		
	}//end SalesPerson constructor
	
	public int getCount() { return count; }
	public String getId() { return id; }
	
	public void setSalesHistrory(Sales s) {
		
		salesHistory[count] = s;
		count = count + 1;
		
	}
	//Calculates the total sales for the sales person  EXAM QUESTION 11e
	public double calcTotalSales() {
		//WHAT IS THIS CHECKING: 
		//	Can you write a look and do a summation using an array of objects
		
		double sum = 0;
		
		for (int i = 0; i < salesHistory.length; i = i + 1) {
			sum = salesHistory[i].getValue(); 
		}
		
		return sum; 
		
	}
	
	//Calculates teh sale with the largest value
	public Sales largestSale() {
		
		//THEORY: When finding the largest value, always set the largest to an 
		//exisiting value in the list. 
		
		//A NICE TWIST:  The exam doesn't ask you to write this method, but it is a really great one!
		//It implements a standard algorithm, a linear search for highest, but there are two things
		//that are a nice add one. 
		//		1.  This is a list of objects so you have to use the accessor methods to access the fields. 
		//		2.  This method wants the user to return the Sales item, meaning the index value has to be
		//			stored as well as the max value.  This means you can't shortcut the loop logic with a
		//			simple maxSale = Math.max(maxSale, salesHistory[i].getValue());
		
		
		double maxSale = salesHistory[0].getValue();
		int maxSaleIndex = 0;
		
		for (int i = 0; i < salesHistory.length; i = i + 1) {
			
			if (maxSale < salesHistory[i].getValue()) {
				maxSale = salesHistory[i].getValue();
				maxSaleIndex = i;
			}
			
		}
		
		return salesHistory[maxSaleIndex];
	}
	
	
	
	
}
