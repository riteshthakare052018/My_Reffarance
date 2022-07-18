package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class SetInterface {
	
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("delhi");
		hs.add("mumbai");
		hs.add("chennai");
		hs.add("kolkata");
		hs.add("pune");
		hs.add("delhi");
		
		System.out.println(hs);
		hs.add(null);
		System.out.println(hs);
		
		String [] s = {"aaa","aaa", "bbb", "ccc"};
		
	HashSet<String> hs1 = new HashSet<String>(Arrays.asList(s));
		
		System.out.println(hs1);
		
		TreeSet<String> ts = new TreeSet<String>();//ascending order
		
		ts.add("Delhi");
		ts.add("Mumbai");
		ts.add("Kolkata");
		ts.add("Chennai");
		ts.add("Pune");
		ts.add("Delhi");

		System.out.println(ts);
		
		TreeSet<Integer> value = new TreeSet<Integer>();
		
		value.add(5);
		value.add(42);
		value.add(10);
		value.add(8);
		value.add(20);
		value.add(25);
		
		System.out.println(value);


	}

}
