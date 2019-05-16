package May_13_1_D;

public class Runner {

	public static void main(String[] args) {
		
		//1a)
		FarmField ff = new FarmField();
		//This line won't work due to 
		//ff.fieldName = "Paul"; 
		
		//Question: why is a method static?  
		//ERROR: 
		//Because getFieldSize() is an instance method meaning 
		//it must be called with an instance. Otherwise whos field size
		//are we accessing. 
		//int temp = FarmField.getFieldSize();
		//GOOD:
		//getFieldSize is a non-static or instnace method meaning
		//to call it we need to know which FarmField we are refering to. 
		int temp = ff.getFieldSize();
	
		
		//Some sample code to help test. 
		Farm f1 = new Farm("Farm 1",1,3);
		FarmField f1a = new FarmField();
		f1a.setSize(10);
		FarmField f1b = new FarmField();
		f1b.setSize(10);
		FarmField f1c = new FarmField();
		f1c.setSize(10);
		f1.addFarm(f1a, 0);
		f1.addFarm(f1b, 1);
		f1.addFarm(f1c, 2);
	
		Farm f2 = new Farm("Farm 2",2,2);
		FarmField f2a = new FarmField();
		f2a.setSize(20);
		FarmField f2b = new FarmField();
		f2b.setSize(20);
		f2.addFarm(f2a, 0);
		f2.addFarm(f2b, 1);
		
		
		Farm f3 = new Farm("Farm 3",3,4);
		FarmField f3a = new FarmField();
		f3a.setSize(20);
		FarmField f3b = new FarmField();
		f3b.setSize(20);
		FarmField f3c = new FarmField();
		f3c.setSize(20);
		FarmField f3d = new FarmField();
		f3d.setSize(20);
		f3.addFarm(f3a, 0);
		f3.addFarm(f3b, 1);
		f3.addFarm(f3c, 2);
		f3.addFarm(f3d, 3);
		
		
		//Set the stage for this question
		Farm[] farms = {f1,f2,f3,null,null};
		
		System.out.println(findLargest(farms));
	}
	
	
	//1D)
	//
	//I have writen a full solution to this. 
	//Note: I have changed the method header to be static.  In the exam question it is listed as a non-static method
	//		which means we need an implied object to use it.  This really doesn't make sense.
	//
	//
	//	The hard part here:
	//	
	//		The hard part here is understanding the relationship between FarmField and Farms.  
	//		Farm has an array of FarmField objects.  
	//		UML --> This is an example of AGGRIGATION - The Farm class includes a field that is a FarmField. 
	//
	//		The solution requires two loops. The outer loop goes throught eh farms and the inner loop access all 
	//		the fields the farm has. 
	//					
	//
	//
	//
	public static int findLargest(Farm[] allFarms) {
		
		int largest = 0; 
		int ctr = 0;
		
		//Outer loop - goes through all farm instances in array allFarm
		while (allFarms[ctr] != null) {
			int total = 0;
			
			//Inner Loop: Loop through all of the fields in each farm.
			for (int i = 0; i < allFarms[ctr].getNumFields(); i = i + 1) {
				
				//This is a tricky line to read. Go from left to right
				total = total + allFarms[ctr].getFarmFields()[i].getFieldSize();
				
			}
			
			largest = Math.max(total,largest);
			
			ctr = ctr + 1;
		}
		
		
		
		return largest;
	
	}
}
