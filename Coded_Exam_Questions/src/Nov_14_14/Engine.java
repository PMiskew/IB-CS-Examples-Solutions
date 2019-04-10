package Nov_14_14;

public class Engine extends RollingStock{

	private double mPullingWeight;	//maximum weight engine can pull
	
	public Engine(int ID) { //ERROR IN EXAM CODE - FIXED
	
		super(ID, 120000); 
		mPullingWeight = 1400000;	
			
	}
	
	//Accessor Methods
	public double getWeight() { 
		return super.getWeight(); 
	}
	
	//Other methods


}
