package Nov_17_P1_14;

import java.util.Arrays;

public class QuestionSolution {

	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		/*
		 * 
		 * Test Code for Nov_17_P1_14
		 * 
		 */
		int[][] mat = { 
						
						{7, 0, 0, 0, 0, 0},
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
		//With approach 1 I placed all the code in a single method and had it return a 2D array 
		//with each of the rows.  Note, that the resulting array is a jagged array. A jagged array
		//is one where the rows are not all the same length.  This is NOT part of the IB exam. In order
		//to return the results to print it had to be put into a 2D array since three 1D arrays cannot
		//be sent back. 
		
		int[][] results = partCApproach1(mat);
		
		//Using single loop we can quickly print out each row of the 2D array
		for (int r = 0; r < results.length; r = r + 1) {
			System.out.println(Arrays.toString(results[r]));
		}
		
		
		//Approach 2:	I just did it as a method and returned a 2D array with each 1D array. 
		//				This is nice because it re-enforces the idea that a 2D array is a 
		//				collection of 1D arrays. 
		partCApproach2(mat);

		
		
		//TEST genArray 
		genArray(results[0],results[1],results[2],6);
		
		
	} // end main
	
	

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
	} //end countNotInstance
	
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
	} //end countInstance
	
	//********************************************************
	//					PART C
	//********************************************************
	
	
	public static void partCApproach2(int[][] mat) {
		
		//Because the question stated that the arrays calues, rowC and col are already
		//initialized this first section is not part of the marking scheme.

		int count = countNotInstance(mat,0);
		int[] values = new int[count];
		int[] col = new int [count];
		int[] rowC = new int[mat.length];
		
		//************MARKED COMPONENT START*****************
		
		int ctr = 0;
		count = 0; //reset count to count non-zeros to populate rowC
		
		for (int r = 0; r < mat.length; r = r + 1)  {
			for (int c = 0; c < mat[r].length; c = c + 1) {
				
				if (mat[r][c] != 0) {
					
					values[ctr] = mat[r][c];
					col[ctr] = c;
					count = count + 1;
					ctr = ctr + 1;
					
				}
				rowC[r] = count;
			}
		}

		//************MARKED COMPONENT END*****************
		
		//This output section below is not necessary for the sake of the question
		//it has been included to show the output. 
		
		System.out.println(Arrays.toString(values));
		System.out.println(Arrays.toString(rowC));
		System.out.println(Arrays.toString(col));
	
	
	
	}
	
	
	
	/**
	 * 
	 * @param mat
	 * @return
	 */
	public static int[][] partCApproach1(int[][] mat) {
		
		int[] values = genValues(mat);
		int[] rowC = genRowC(mat);
		int[] cols = genCol(mat);
		
		int[][] results = {values,rowC,cols};
		return results;
		
	} //end partC
	
	
	/**
	 * 
	 * @param a
	 * @return
	 */
	public static int[] genValues(int[][] a) {
		
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
		
		//System.out.println(Arrays.toString(values));
		return values;
		
	
	
	}//end genValuesArray
	
	public static int[] genRowC(int[][] a) {
		
		int[] rowC = new int[a.length];
		
		int ctr = 0; 
		int count = 0; //reinitialize count;'
		for (int r = 0; r < a.length; r = r + 1) {
			for (int c = 0; c < a[r].length; c = c + 1) {
				if (a[r][c] != 0) {
					count = count + 1;
				}
				rowC[r] = count;
				
			}
		}
		
		//System.out.println(Arrays.toString(rowC));
		return rowC;
		
	} //end genRowC
	
	public static int[] genCol(int[][] a) {
		
		int count = countNotInstance(a,0);
		int[] col = new int[count];
		
		int ctr = 0; 
		for (int r = 0; r < a.length; r = r + 1) {
			for (int c = 0; c < a[r].length; c = c + 1) {
				if (a[r][c] != 0) {
					col[ctr] = c;
					ctr = ctr + 1;
				}
			}
		}
		
		//System.out.println(Arrays.toString(col));
		return col;
		
	} //end genCol
	
	
	//********************************************************
	//					REVERSE PROCESS - GOOD FOR LEARNING - STILL WORKING
	//********************************************************
	//IN THE BELOW SECTION I REVERSE THE PROCESS - THAT IS GIVEN THE THREE 
	//ARRAYS I GENERATE THE RESULTING 2D ARRAY
	
	/*
	public static void genArray(int[] values, int[] rowC, int[] col, int numCol) {
		
		//The number of rows can be calculated from length of rowC
		//The number of columns cannot be determined, it must be passed
		int[][] results = new int[rowC.length][numCol];
		//THEORY:  THE 2D ARRAY GETS INITALIZED TO ZEROS
		
		int ctr = 0;
		
		for (int i = 0; i < rowC.length; i = i + 1) {
			
			if (i > 0) {
				for (int j = 1; j < rowC[i] - rowC[i - 1]; j = j + 1) {
					
					results[i][col[j]] = values[ctr];
					ctr = ctr + 1;
					col
					
				}
			}
			else {
				for (int j = 0; j < rowC[i]; j = j + 1) {
					
					results[i][col[j]] = values[ctr];
					ctr = ctr + 1;
					
				}
			}
		}
		
		for (int r = 0; r < results.length; r = r + 1) {
			System.out.println(Arrays.toString(results[r]));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	*/

	
} //end class
