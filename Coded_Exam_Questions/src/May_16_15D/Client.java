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
		//14D - It is important that you approach this question in the spirt of what they want. 
		//		don't stress about how the information gets outputted, just that it does. 
		System.out.println("Name: "+name);
		System.out.println("Room Number: "+bedroom.getRoomNumber());
		System.out.println("Arrival: "+arrive);
		System.out.println("Departure:"+leave);
		System.out.println("Rooms:"+Dates.stayDays(arrive, leave));
		double cost = Dates.stayDays(arrive,leave) * bedroom.getPrice();
		System.out.println("Total Cost: "+cost);
		
		
	}
}
