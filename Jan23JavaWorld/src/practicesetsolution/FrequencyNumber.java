package practicesetsolution;

import java.util.HashMap;

public class FrequencyNumber {
	
	public static void main(String[] args) {
		
		String s = "indiaismycountry";
		char[] ch = s.toCharArray();
		
		HashMap<Character,Integer> hs = new  HashMap<Character, Integer>();
		
		for(int i=0; i<ch.length; i++) 
		{
			if (hs.get(ch[i])==null) 
			{
				hs.put(ch[i], 1);
			}else 
			{
				Integer num = hs.get(ch[i]);
				hs.put(ch[i], ++num);
			}

		}System.out.println(hs);
	}

}
