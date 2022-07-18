package practicesetsolution;

import java.util.HashMap;

public class HashMapClass {
	
	public static void main(String[] args) {
		HashMap hp = new HashMap();
//		HashMap<Integer, String> m= new HashMap<Integer, String>();
		
		hp.put(101,"man");
		hp.put(102,"den");
		hp.put(103,"san");
		hp.put(104,"han");
		hp.put(105,"ban");
		hp.put(103,"jan");
		hp.put(106,"jan");
		
		System.out.println(hp.get(104));
		hp.remove(106);
		System.out.println(hp.containsKey(101));
		System.out.println(hp.containsKey(106));
		System.out.println(hp.keySet());
		System.out.println(hp.values());
		System.out.println(hp.entrySet());
//		System.out.println(hp);
		
		for(Object i:hp.keySet()) 
		{
			System.out.println(i+"    "+hp.get(i));
		}
		
	}

}
