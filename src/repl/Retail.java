package repl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Retail {

	public static void main(String[] args) {

		Map<Integer,String> BestBuy=new HashMap();
		
		BestBuy.put(111,"Printer");
		BestBuy.put(222,"Camera");
		BestBuy.put(333,"Lasptop");
		BestBuy.put(444,"TV");
		
		Set<Entry<Integer,String>> ent=BestBuy.entrySet();
		
		for(Entry<Integer,String> x:ent) {
			int a=x.getKey();
			String b=x.getValue();
			System.out.println(x);
		}
		System.out.println("****Iterator*****");
		Iterator<Entry<Integer,String>> it=ent.iterator();
		while(it.hasNext()) {
			Entry<Integer, String> e=it.next();
			String keyValue=e.getKey()+" && "+e.getValue();
			System.out.println(keyValue);
			
		}
	}

}
