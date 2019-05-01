import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ECOORegional2019P1Email2 {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		/*
		 * 6/10
		 * Even though the logic is correct, it is very inefficient and would not run
		 * in the 30 seconds that are allowed. 
		 */
		 
		Scanner s = new Scanner(new File("DATA11.txt"));
		
		for (int set = 0; set < 10; set = set + 1) {
			
		
			/*GOOD TAKE AWAYS
			 *  - Using replace all to replace all . requires the use of an escape code
			 *  - The last step in this where you had to identify the number of unique 
			 *    elements is a nice general algorithm to develop. See 
			 *    	- UniqueElementsInArray1D.java
			 *    	- UniqueElementsInArray2D.java
			 *    	- UniqueElementsInArrayList.java
			 *  - Using substring to access part of a string. 
			 *  - Looping through 1D Array Structure. 
			 *    	
			*/
			int len = Integer.parseInt(s.nextLine());
		
			String[] data = new String[len];
			String[] front = new String[len];
			int count = 0;
		
			ArrayList<String> results = new ArrayList<String>();

			
			
			for (int i = 0; i < len; i = i + 1) {
				
				data[i] = s.nextLine();
				data[i] = data[i].toLowerCase();
				
				if (data[i].indexOf("+") != -1) {
					front[i] = data[i].substring(0,data[i].indexOf("+")) + data[i].substring(data[i].indexOf("@")+1);; 
				}
				else {
					front[i] = data[i].substring(0,data[i].indexOf("@")) + data[i].substring(data[i].indexOf("@")+1);; 
								
				}
				
				
				String temp = front[i];
				temp = temp.replaceAll("\\.","");
				front[i] = temp;
			
			//IF THIS FAILS THEN SETS .
			
				boolean addlist = true;
				int slist = results.size();
				for (int k = 0; k < slist; k = k + 1) {
					if (results.get(k).equals(front[i])) {
						addlist = false;
						break;
					}
					
				}
				
				if (addlist == true) {
					results.add(front[i]);
					count = count + 1;
				}
			
			
		
			}
			System.out.println(count);
		}
				
		
		
		
	}

}
