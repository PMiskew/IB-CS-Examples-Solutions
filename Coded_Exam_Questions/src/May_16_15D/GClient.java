package May_16_15D;

/*
 * when one class extends another the "is a" relationship takes hold
 * 	GClient is a Client
 * GClient is the SUB-CLASS
 * Client is the SUPER-CLASS
 * 
 * Theory: 	Sub-class and super-class
 * 		-	A subclass inherits all attributes and behaviours, but NOT 
 * 			constructors.
 * 
 * Theory:	Constructors (super)
 * 		- 	Objects are constructed from general to specific. 
 * 		- 	By default every class gets a constructor that takes 
 * 			no parameters. 
 * 		-	If class defines a constructor the default constructor is 
 * 			removed. 
 * 		-	If the super class requires parameters use super short hand.  
 * 		- 	The super call MUST BE THE FIRST THING IN THE CONSTRUCTOR
 * 
 * For detailed explanation, see the videos at the below links:
 * 		Hierarchies - Two Parts
 * 			https://www.youtube.com/watch?v=233axWf2MDA
 * 			https://www.youtube.com/watch?v=qtsaLmbQD7M&t=82s
 * 
 * 		Super Class - Two Parts
 * 			https://www.youtube.com/watch?v=qtsaLmbQD7M&t=82s
 * 			https://www.youtube.com/watch?v=eBaeqRNUvc8
 * 
 * 
 * 
 * What Does this mean here?
 *	When constructing a client we must take a parameter for every field
 * 	However, the most of the fields are necessary in the super class.  
 * 	We use the super call to pass it up. 
 * 
 * 
 * 
 * 
 */
public class GClient extends Client{

	private String groupName;
	public GClient(int id, String c, Dates dateIn, Dates dateOut, Room r, String gn) {
		//Write super is short hand in constructors for calling the constructor of the super class. 
		//IT MUST BE THE FIRST THING IN THE CONSTRUCTOR.  By default all constructors have 
		//super(), which is a call to the default constructor. Since the super class does not have a 
		//default constructor we must explicitly write the super call. 
		//
		super(id,c,dateIn,dateOut,r);
		groupName = gn;

	}
	
	public void setGroupName(String gn) { groupName = gn; }
	public String getGroupName() { return groupName; }
	
}
