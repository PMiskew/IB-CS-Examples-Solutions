package May_16_15D;

public class Group {

	private String name; //name of group
	private int number; //number of rooms allocated to the group
	
	public Group(String name, int number) {
		
		this.name = name;
		this.number = number; 
		
	}
	
	public String getName() { return name; }
	public int getNumber() { return number; }
	
	//I DON'T KNOW WHAT THE EXAM IS THINKING PUTTING THIS HERE!
	int[] gRooms = new int[number];

	//NOT COMPLETE
	public double bill(int[] gRooms) {
		return 0;
		
	}
}
