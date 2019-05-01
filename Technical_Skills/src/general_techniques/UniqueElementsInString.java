package general_techniques;

public class UniqueElementsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input = "aaaab";
		int ucount = 0;
		
		for (int i = 0; i < input.length(); i = i + 1) {
			
			boolean unique = true;
			for (int j = i + 1; j < input.length(); j = j + 1) {
				
				if (input.charAt(i) == input.charAt(j)) {
					unique = false;
					break;
				}
			}
			if (unique == true) {
				ucount = ucount + 1;
			}
		}
		
		System.out.println(ucount);
	}

}
