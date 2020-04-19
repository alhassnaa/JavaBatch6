package repl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Dragon {

	public static void main(String[] args) {

		HashSet<String> list= new HashSet<>();
		list.add("Morocco");
		list.add("Turky");
		list.add("Tunisia");
		list.add("Spain");
		
		System.out.println(list);
		
		System.out.println("****************************");
		
        Iterator<String> it=list.iterator();
        while (it.hasNext() )
            System.out.println(it.next());
}
}