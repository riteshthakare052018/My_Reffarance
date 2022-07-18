package practicesetsolution;

public class CountOfSingleCharInString {
	
	public static void main(String[] args) {
		
		String s = "abcdefabcdef";
		int count = 0;
		char ch='a';
		
		
		for(int i=0; i<s.length()-1;i++) 
		{
//			if((s.charAt(i)=='a')||(s.charAt(i)=='b')) 
			char ch1 = s.charAt(i);
			if(ch1==ch)
			{
				count = count+1;
			}
			
			
		}System.out.println("charector is present in string is:"+count+" times");
	}
     
}
