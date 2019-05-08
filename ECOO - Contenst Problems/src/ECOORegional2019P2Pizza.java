import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ECOORegional2019P2Pizza {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner s = new Scanner(new File("DATA21T.txt"));

		for (int set = 0; set < 1; set = set + 1) {
			int len = s.nextInt();
			int[] x = new int[len];
			int[] y = new int[len];
			
			ArrayList<String> data = new ArrayList<String>();
			Set<String> dataS = new HashSet<String>();
			
			
			for (int i = 0; i < len; i++) {
				
				x[i] = s.nextInt();
				y[i] = s.nextInt();
				data.add(x[i]+","+y[i]);
				dataS.add(x[i]+","+y[i]);
				System.out.println(Arrays.toString(x));
				System.out.println(Arrays.toString(y));
				System.out.println(dataS);
				System.out.println("");
				
				
			}
		
			for (int i = 0; i < len; i++) {
				
				dataS.add(y[i]+","+x[i]);
			
			}
			
			//System.out.println(data);
			//System.out.println(dataS);
			System.out.println("");
			
			
			
		
		
		
		
		
		
		}
		
		
		
	}
	



}
