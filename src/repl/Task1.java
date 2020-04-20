package repl;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;



public class Task1 {

	public static void main(String[] args) {
		
		Map<String, String> countries = new TreeMap<>();
		countries.put("Morocco","Rabat");
		countries.put("Tunisia","Tunisia");
		countries.put("Turkey","Ankara");
		countries.put("France","Paris");
		countries.put("Spain", "Madrid");
		countries.put("Russia","Mosco");
				
		Set<Entry<String,String>> allEntries=countries.entrySet();
		System.out.println(allEntries);
		
		System.out.println("*******Loop********");
		for(Entry<String,String> enter:allEntries) {
			//System.out.println(enter); duable too
			
			System.out.println(enter.getKey());
			System.out.println(enter.getValue());
			
			System.out.println("*****another way*****");
			
			String key=enter.getKey();
			String value= enter.getValue();
			System.out.println(key+" "+value);
			
		}
		
		System.out.println("**********Iterator************");
				
		Iterator<Entry<String,String>> et=allEntries.iterator();
		while(et.hasNext()) {
			Entry<String,String> e=et.next();
			String keyValue=(e.getKey()+" :::"+e.getValue());
			System.out.println(keyValue);
		}
		
		}
	}
