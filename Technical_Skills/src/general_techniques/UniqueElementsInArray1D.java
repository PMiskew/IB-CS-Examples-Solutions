package general_techniques;

public class UniqueElementsInArray1D {

	public static void main(String[] args) {

		
		int[] array = {1,4,4,5,4,5,6,4,4};
		int ucount = 0;
		for (int i = 0; i < array.length; i = i + 1) {
			boolean flag = true; //assume unique
			
			for (int j = i + 1; j < array.length; j = j + 1) {
				if (array[i] == array[j]) {
					flag = false;
					break;
				}
			}
			
			if (flag == true) {
				ucount = ucount + 1;
			}
			
			
		}
		
		System.out.println(ucount);
	}

}
