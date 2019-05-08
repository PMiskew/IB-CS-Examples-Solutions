package arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class PresentationActivities {

	/*
	 * This file holds solutions to the general Slides activities that can be found in our class
	 * site 03-Support Materials/Topic Specific Presentations/Array Structures 
	 */
	
	public static void main(String[] args) {
		
		int[] arr = gen1DArray(5,10);
		System.out.println(Arrays.toString(arr));
		
		
		//create 5 elements to hold scanner objects
		Scanner[] s = new Scanner[5]; 
		
		//Construct each object
		for (int i = 0; i < s.length; i = i + 1) {
			s[i] = new Scanner(System.in);
		}
		
		String word = s[0].nextLine();
		
		
	}
	
	public static int[] gen1DArray(int l, int n) {
		
		int[] array = new int[l];
	
		for (int count = 0; count < l; count = count + 1) {
			
			array[count] = (int) (Math.random()*(n+1));
		}
		
		return array;
	}

	public static int[][] gen2DArray(int r, int c, int n) {
		
		int[][] arr = new int[r][c];
		
		for (int row = 0; row < arr.length; r = r + 1) {
			
			for (int col = 0; col < arr[row].length; col = col + 1) {
				
				arr[row][col] = (int)(Math.random()*(n + 1));
			}
			
		}
		
		return arr;
		
	}
}


