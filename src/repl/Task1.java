package repl;

import java.util.HashSet;
import java.util.Set;

public class Task1 {

	public static void main(String[] args) {
		
		Set<String> str = new HashSet<>();
		str.add("third");
		str.add("first");
		str.add("second");
				
		System.out.println(str);
		
		str.removeAll(str);
		System.out.println(str);
		}
	}
