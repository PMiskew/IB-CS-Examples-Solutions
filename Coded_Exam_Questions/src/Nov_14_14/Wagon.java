package Nov_14_14;

public class Wagon extends RollingStock{

	private Parcel[] mParcels;
	private int mParcelCount;
	
	public Wagon(int ID) {
		
		super (ID, 32000);
		mParcels = new Parcel[100];
		mParcelCount = 0;
	}
	
	//Accessor Methods
	public int getWagonID() { return this.getID(); }
	
	public double getWeight() {
		
		return super.getWeight();
		
	}
}
