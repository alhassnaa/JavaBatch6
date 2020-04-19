package repl;

import java.util.HashMap;
import java.util.Map;

public class Task {

	public static void main(String[] args) {

		Map<Integer,String>build=new HashMap<>();
		
		build.put(1, "Google");
		build.put(2, "Amazon");
		build.put(3, "Syntax");
		build.put(4, "Syntax");
		build.put(5, "Aetna");
		build.put(6, "Gieco");
		build.put(7, "Aetna");
		
		int size=build.size();
		System.out.println(size);
		
		build.replace(4, "Microsoft");
		
		build.remove(7);
		
		System.out.println(build);
	}

}
