package Nov_14_14;

public class Train {

	private Engine[] mEngines;
	private Wagon[] mWagons;
	private int mEngineCount;
	private int mWagonCount;
	private int mTrainNumber;
	private double mWeight;
	
	public Train(int number) {
		mTrainNumber = number;
		mEngines = new Engine[6];
		mEngineCount = 0;
		mWagons = new Wagon[100];
		mWagonCount = 0;
		mWeight = 0;
	}
	
	public void addEngine(Engine newEngine) {
		mEngines[mEngineCount] = newEngine;
		mEngineCount++;
	}
	
	public Engine removeEngine() {
		mEngineCount--;
		return mEngines[mEngineCount];
		
	}
	
	public void addWagon(Wagon newWagon) {
		mWagons[mWagonCount] = newWagon;
		mWagonCount++;
	}
	
	public Wagon removeWagon() {
		//Code to be written 
		//assume null return
		if (mWagonCount > 0) {
			mWagonCount--;
			return mWagons[mWagonCount + 1];
		}
		return null
	
		
	}
	
	public int getNumberOfWagons() {
		return mWagonCount;
	}
	
}
