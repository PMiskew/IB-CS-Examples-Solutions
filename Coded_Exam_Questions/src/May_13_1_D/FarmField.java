package May_13_1_D;

/*
 * Note on exam:
 * 	The exam for some reason does not encapsulate this, which,
 * 	is extremely bad design.  I have coded this and encapsulated 
 * 	this example as it is best practice.  
 * 
 *
 * IB:
 * Exam Strategy:	If get something like this, be confident in applying 
 * 					the knowledge.  Remember because it isn't encapsulated
 * 					coders can directly access fields. So do that.  If for
 * 					some reason someone decided to use an accessor method,
 * 					which isn't shown, I would be inclined to give them
 * 					credit as it shows their understanding.
 * 
 * AP:
 * Exam Strategy:	This is an IB questions, but hte AP would always encapsulate
 * 					and if you are every writing a question a mark is always
 *					allocated for this. 
 *
 * 
 *  Real Life: 		Always encapsulate.
 *  
 *  Terminology: 
 *  
 *  Modifiers:
 *   
 *  	Know the term modifiers. A modifier is something that changes
 *  	the visibility/access of a method or variable. 
 *  
 *  	IB: public, private, protected, final, static 
 *  	AP: public, private, final, static, abstract
 *  
 *  Note: Everyone forgets static. 
 *  				
 */
public class FarmField {

	
	private String fieldName; //Unique name for the field
	private int fieldSize; //Size of the field in a square meter
	private int soilType; //A value indiciating soil acidity
	private int fertilizerType; //A value indicating the type of ferilizer
	private int cropType; //Crop Type: 1 = Corn, 2= Soybeans, 3 = Alfalfa, etc.
	
	/*
	 * Theory:  Constructors
	 * 
	 * 	-	Constructors are special methods that are called only once when 
	 * 		we "construct"/instantiate an object. 
	 * 
	 * 	-	There is no constructor written so there is a single constructor
	 * 		that takes no parameters. All values are defaulted. 
	 * 
	 * 	- 	If you write a single constructor the defaul constructor disappears
	 * 
	 * 	- 	Common Misunderstanding:  Constructors can use methods from class. 
	 * 
	 */
	
	public void setName(String n) { fieldName = n; }
	public String getName() { return fieldName; }
	
	public int getFieldSize() { return fieldSize;}
	
	public void setSize(int s) { fieldSize = s; }
	

	
	
}
