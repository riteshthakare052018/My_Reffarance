package practicesetsolution;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
	
//	public static void main(String[] args) {
//		
//		String s = "abcdefabcdef";
//		char[] ch = s.toCharArray();
//	
//		Character [] a = new Character[s.length()];
//		
//		int i = 0;
//		for(char cc:ch) 
//		{
//			a[i]=cc;
//			i++;
//		}
//		HashSet<Character> hs = new HashSet<Character>(Arrays.asList(a));
//
//
//		System.out.println(hs);

//	}
	
//	public static void main (String[]arg) 
//	{
//		String s = "extraordinaryperson";
//		char[] con = s.toCharArray();
//		
//		Character[] ch = new Character[s.length()];
//		
//		int i = 0;
//		for(char cc:con) 
//		{
//			ch[i]=cc;
//			i++;
//			
//		}
//		HashSet<Character> hs = new HashSet<Character>(Arrays.asList(ch));
//		
//		System.out.println("After removing the duplicate charactor:"+hs);
		
//	}
	
	
	public static void main(String[] args) {
		String s = "abcdefabcdef";
        String s2 = "";
//        System.out.println(s2.length());
        for (int i = 0; i < s.length(); i++) {
            Boolean found = false;
            
            for (int j = 0; j < s2.length(); j++) {
            	
                if (s.charAt(i) == s2.charAt(j)) {
                    found = true;
                    break; 
                }
            }
            if (found == false) {
              s2 = s2+ s.charAt(i);
            }
        }
        System.out.println(s2);
	}

}
