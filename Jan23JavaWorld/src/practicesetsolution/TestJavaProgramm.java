package practicesetsolution;

import java.util.HashMap;

public class TestJavaProgramm {
	public static void main (String[]arg) 
	{
		

	
//	String s = "abcdefabcdef";
//	int count = 0;
//	char ch = 'a';
//    int len = s.length();
//    System.out.println(len);
//	
//    for(int i=0; i<len-1;i++) 
//    {
//    	char ch1 = s.charAt(i);
//    	if(ch1==ch) 
//    	{
//    		count=count+1;
//    	}
//    	
//    }
//	System.out.println("charector is repeated "+count+" times");
		
		
	String s = "extraordinaryperson";
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
			
		for(int i=0; i<s.length()-1;i++) 
		{
			char charvalue = s.charAt(i);
			if(hm.containsKey(charvalue)) 
			{
				hm.put(charvalue, hm.get(charvalue)+1);
			}else 
			{
				hm.put(charvalue, 1);
			}
		}
		System.out.println("charector is repeated "+hm+" times");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
