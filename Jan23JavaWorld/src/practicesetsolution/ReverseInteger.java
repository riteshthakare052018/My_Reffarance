package practicesetsolution;

public class ReverseInteger {
	
	public static void main(String[] args) {
		
		  int s = 12345;
		  String te = Integer.toString(s);
		 
		 for(int i=te.length()-1; i>=0;i--) 
		 {
			 System.out.print(te.charAt(i));
		 }
	
		 
		
	}

}
