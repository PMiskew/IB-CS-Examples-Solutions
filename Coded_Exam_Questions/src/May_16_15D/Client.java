package May_16_15D;

public class Client {

	private int customerID;
	private String name;
	private Dates arrive;
	private Dates leave;
	private Room bedroom;
	
	public Client(int id, String c, Dates dateIn, Dates dateOut, Room r) {
		
		setCustomerId(id);
		setName(c);
		setArrive(dateIn);
		setLeave(dateOut);
		setBedroom(r);
		
		
	}
	
	public void setCustomerId(int id) { customerID = id; }
	public void setName(String c) { name = c; }
	public void setArrive(Dates dateIn) { arrive = dateIn; }
	public void setLeave(Dates dateOut) { leave = dateOut; }
	public void setBedroom (Room r) { bedroom = r; }
	
	public int getCustomerID() { return customerID; }
	public String getName() { return name; }
	public Dates getArrive() { return arrive; }
	public Dates getLeave() { return leave; }
	public Room getBedroom() { return bedroom; }
	
	public void bill() {
		
		bedroom.get
	
	}
}