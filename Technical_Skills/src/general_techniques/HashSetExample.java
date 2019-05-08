package general_techniques;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hash sets are an extremely fast way to store values
		//when duplicates are not needed.  This is particularly
		//useful with very large data sets, which often appear in 
		//contests.

		Set<String> words = new HashSet<String>();
		
		words.add("cat");
		words.add("dog");
		words.add("cat");
		words.add("fish");
		System.out.println(words);
		
		//Notice that we only get one cat eventhough we add it twice. 
		
	}

}
