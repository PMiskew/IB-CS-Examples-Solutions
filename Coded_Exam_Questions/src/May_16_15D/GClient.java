package May_16_15D;

/*
 * when one class extends another the "is a" relationship takes hold
 * 	GClient is a Client
 * GClient is the SUB-CLASS
 * Client is the SUPER-CLASS
 * 
 * Theory: 	A subclass inherits all attributes and behaviours, but NOT 
 * 			constructors.
 * 
 * Theory:	
 * 		- 	Objects are constructed from general to specific. 
 * 		- 	By default every class gets a constructor that takes 
 * 			no parameters. 
 * 		-	If class defines a constructor the default constructor is 
 * 			removed. 
 * 		-	If the super class requires parameters use super short hand.  
 * 		- 	The super call MUST BE THE FIRST THING IN THE CONSTRUCTOR
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
		super(id,c,dateIn,dateOut,r);
		groupName = gn;

	}
	
	public void setGroupName(String gn) { groupName = gn; }
	public String getGroupName() { return groupName; }
	
}
