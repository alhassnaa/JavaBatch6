package repl;

import java.util.ArrayList;
import java.util.Iterator;

public class Repl184 {

	public static void main(String[] args) {

		ArrayList<Boolean> listA=new ArrayList<>();
		
		listA.add(true);
		listA.add(false);
		listA.add(false);
		
		ArrayList<Boolean> listB=new ArrayList<>();
		listB.addAll(listA);
		
		Iterator it=listB.iterator();
		while(it.hasNext()) {
			
		System.out.println(it.next());
	}
	}
}
