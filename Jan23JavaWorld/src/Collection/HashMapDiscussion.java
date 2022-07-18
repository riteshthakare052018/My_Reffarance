package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDiscussion {
	
public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "Delhi");
		hm.put(506, "Pune");
		hm.put(404, "Mumbai");
		hm.put(900, "Bengaluru");
		
		hm.put(404, "Srinagar");
		hm.put(800, "Pune");
		
		System.out.println(hm);
		
		Collection<String> v = hm.values();
		System.out.println(v);
		String value = hm.get(404);
		System.out.println(value);
		
boolean ispresent = hm.containsValue("Pune");
		
		System.out.println(ispresent);
		
		boolean iskeypresent = hm.containsKey(800);
		
		System.out.println(iskeypresent);
		
		LinkedHashMap<Integer, String> is = new LinkedHashMap<Integer,String>();
		is.put(101, "mumbai");
		is.put(400, "pune");
		is.put(230, "aurangabad");
		is.put(300, "nagpur");
		is.put(105, "delhi");
		
		System.out.println(is);
		Set<Entry<Integer, String>> values = is.entrySet();
		for(Entry<Integer, String> individual:values) 
		{
			System.out.println(individual.getKey()+" "+individual.getValue());
		}
		
		

}}
