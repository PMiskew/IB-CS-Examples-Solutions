package general_techniques;

public class UniqueElementsInArray2D {

	
	public static void main(String[] args) {
	
			
			int[][] array = { {1,1,1}, {4,5,6}, {7,8,9} };
		
			
			int ucount = 0;
			
			for (int r = 0; r < array.length; r = r + 1) {
				
				
				for (int c = 0; c < array[r].length; c = c + 1) {
					
					boolean unique = true;
						
					
					for (int r1 = r; r1 < array.length; r1 = r1 + 1) {
					
						for (int c1 = c + 1; c1 < array[r1].length; c1 = c1 + 1) {
					
							if (array[r][c] == array[r1][c1]) {
								unique = false;
								break;
							}
						
						}
						if (unique == false) {
							break; 
						}
					}
					
					if (unique == true) {
						ucount = ucount + 1;
					}	
					
				}
				
			}
			System.out.println(ucount);
			System.out.println("END");
					
					
					
					
					
					
					
					
					
					
					
					
				
			
			
			
	}

}
