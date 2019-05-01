import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ECOORegional2019P2Pizza {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner s = new Scanner(new File("DATA21T.txt"));

		for (int set = 0; set < 2; set = set + 1) {
			int len = s.nextInt();
			int[] x = new int[len];
			int[] y = new int[len];
			
			for (int i = 0; i < len; i++) {
				x[i] = s.nextInt();
				y[i] = s.nextInt();
			
			}
		
			System.out.println(Arrays.toString(x));
	
			System.out.println(Arrays.toString(y));
			System.out.println("");
		
		
		
		
		
		
		
		
		
		}
		
	}
}
