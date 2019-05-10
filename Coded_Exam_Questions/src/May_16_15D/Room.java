package May_16_15D;

public class Room {

		private int roomNumber;
		private int beds;
		private double price;
		private boolean empty;
		
		public Room(int rn, int b, double p, boolean e) {
			
			roomNumber = rn;
			beds = b;
			price = p;
			empty = e;
			
		}
		
		public int getRoomNumber() { return roomNumber; }
		public int getBeds() { return beds; }
		public double getPrice() { return price; }
		public boolean isEmpty() { return empty; }
		
}
