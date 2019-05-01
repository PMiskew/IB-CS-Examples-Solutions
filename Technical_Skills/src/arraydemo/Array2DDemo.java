package arraydemo;

import java.util.Arrays;

public class Array2DDemo {

	public static void main(String[] args) {
		
		
		//Context will drive how you visualize an array. However, generally speaking 
		//thinking of it as [rows][columns] is helpful in that it is usually visualized this 
		//way and conceptually translates well to mathematics. 
		
		//The below 2D array has 5 rows and 4 columns and can be visualized as
		//
		//	[0,0 , 0,1 , 0,2 , 0,3]
		//	[1,0 , 1,1 , 1,2 , 1,3]
		//	[2,0 , 2,1 , 2,2 , 2,3]
		//	[3,0 , 3,1 , 3,2 , 3,3]
		//	[4,0 , 4,1 , 4,2 , 4,3]
		//	[5,0 , 5,1 , 5,2 , 5,3]
		//
		//
		//
		int[][] matrix = new int[5][4];
		
		//To print out number of rows -- matrix.length 
		System.out.println(matrix.length);
		//To print out the length of row r --> matrix[r].length
		System.out.println(matrix[0].length);
		
		//To access elements
		matrix[3][2] = 99;
		matrix[2][3] = 33;
		
		//advice from a former student.
		//Visualize 2D arrays as an array of Arrays.  This means by accessing a 2D array with a single index
		//you get the row returned. This is very useful when trying to pass values into other functions. 
		System.out.println(Arrays.toString(matrix[0]));
		
		//Standard loop to go through all elements
		//Suggestions: Use r and c 
		for (int r = 0; r < matrix.length; r = r + 1) {
			for (int c =0; c < matrix[r].length; c = c + 1) {
				System.out.print(matrix[r][c]+", ");
			}
			System.out.println();
		}
		
		
		
	}

}
