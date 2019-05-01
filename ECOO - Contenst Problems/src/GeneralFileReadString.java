import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class GeneralFileReadString {

	public static void main(String[] args) throws Exception {
	
		Scanner s = new Scanner(new File("DATA1.txt"));
		
		//While Approach
		//Using s.hasNext() is a nice approach when you 
		//don't know in advance how many lines are in the
		//file.  In this case copying into a dynamic data structre
		//is useful. 
		ArrayList<String> data = new ArrayList<String>();
		while (s.hasNext()) {
			data.add(s.nextLine());
			
		}
		
		System.out.println(data);
		
		
		
		
		
		
	}

}
