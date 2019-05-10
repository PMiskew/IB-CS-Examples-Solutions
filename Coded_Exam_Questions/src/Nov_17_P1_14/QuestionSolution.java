package Nov_17_P1_14;

import java.util.Arrays;

public class QuestionSolution {

	
	public static void main(String[] args) {
		
	
		int[][] mat = { {7, 0, 0, 0, 0, 0},
					    {0, 0, 0, 0, 0, 0},
					    {0, 0,-3, 0, 9, 0},
					    {0, 0, 0, 0, 0, 0},
					    {0, 0,-1, 0, 0, 0},
					    {0,-6, 0, 0, 5, 1}
					   };
		
		//(A) - We can count the number of elements and get 36 - RULE: 2D Array multiply the 
		//		rows by the columns to get total elements. 
		
		//(B) - We can simply count them.  For added fun I have written a function that counts 
		//		the instance of a specific value.  This is a good function to look at and feel
		//		confident that you can write. 
		
		//(C) - I have written this section as a number of functions that can be accessed.  One
		//		the exam I suppose you could do this.  I have included another version that does
		//		everything in one go.  I have separate comments for each situation.
		
		//Approach 1
		int count = countInstance(mat, 0);
		int notCount = countNotInstance(mat, 0);
		System.out.println(count);
		
		int[] values1 = genValuesArray(mat);
		System.out.println(Arrays.toString(values));
		
		
		//Approach 2:	I just did it as a method and returned a 2D array with each 1D array. 
		//				This is nice because it re-enforces the idea that a 2D array is a 
		//				collection of 1D arrays. 
		
		int[][] results = partC(mat);
		
		
		
	}
	
	
	public static int[][] partC(int[][] mat) {
		
		for
	}
	/**
	 * This function takes a 2D Array of integers and returns the number of elements
	 * that are not val. 
	 * @param a
	 * @param val
	 * @return
	 */
	public static int countNotInstance(int[][] a, int val) {
		
		int count = 0;
		
		for (int r = 0; r < a.length; r = r + 1) {
			for (int c = 0; c < a[r].length; c = c + 1) {
				if (a[r][c] != val) {
					count = count + 1;
				}
			}
		}
		return count;
	}
	
	/**
	 * This function takes a 2D Array of integers and returns the number of elements
	 * that are equalto val.
	 * @param a
	 * @param val
	 * @return
	 */
	public static int countInstance(int[][] a, int val) {
		
		int count = 0;
		
		for (int r = 0; r < a.length; r = r + 1) {
			for (int c = 0; c < a[r].length; c = c + 1) {
				if (a[r][c] == val) {
					count = count + 1;
				}
			}
		}
		return count;
	}
	
	public static int[] genValuesArray(int[][] a) {
		/*
		 * Because arrays are static data structures and we must know the 
		 * size in advance we must run through the array twice.  The first time
		 * to count the number of instances and then to populate.  The question 
		 * STATES THAT THE SIZE OF VALUE, ROWC, COL ARE INITALIED!  When writing 
		 * the pseudo code, don't need to look through and set the size
		 * Step 1: Loop through 2D Array and count instances
		 * Step 2: Create 1D Array using count from step 1
		 * Step 3: Populate 1D array with actual values. 
		 * 
		 */
		
		int count = countNotInstance(a,0);
		int[] values = new int[count];
		
		int ctr = 0; 
		
		for (int r = 0; r < a.length; r = r + 1) {
			for (int c = 0; c < a[r].length; c = c + 1) {
				if (a[r][c] != 0) {
				values[ctr] = a[r][c];
				ctr = ctr + 1;
				}
			}
		}
		return values;
		
	
	
	}
	
}
