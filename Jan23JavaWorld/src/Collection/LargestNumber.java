package Collection;

import java.util.Collections;
import java.util.HashMap;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer> ();
		map.put(1, 100);
		map.put(2, 102);
		map.put(3, 103);
		map.put(4, 104);
		
		Integer maxx = (Collections.max(map.values()));
		System.out.println(maxx);
		
	}

}
