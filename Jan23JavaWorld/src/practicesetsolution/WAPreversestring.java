package practicesetsolution;

public class WAPreversestring {
	
	public static void main(String[] args) {
		
		String s = "Banglore";
//		String rev = "";
		int size = s.length();
		System.out.println(size);
		
		for(int i = size-1;i>=0;i--) 
		{
			 char va = s.charAt(i);
			 System.out.print(" "+va);
		}
	
		
	}

}
