package Nov_14_14;

public class Engine extends RollingStock{

	private double mPullingWeight;	//maximum weight engine can pull
	
	public Engine(int number) {
	
		super(number, 120000); //ERROR IN EXAM CODE - FIXED
		mPullingWeight = 1400000;	
			
	}
	
	//Accessor Methods
	public double getWeight() { 
		return super.getWeight(); 
	}
	
	//Other methods


}
