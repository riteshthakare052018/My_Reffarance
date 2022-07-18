package practicesetsolution;

public class AdditionOfValueInString {
	
	public static void main(String[] args) {
		
		String s = "ab5ds51s2";
		int digit = 0;
		String numstring = "";
		
		for (int i=0; i<s.length();i++) 
		{
			if(Character.isDigit(s.charAt(i))) 
			{
				numstring= s.substring(i,i+1);
				digit = digit+ Integer.parseInt(numstring);
			}
			
		}
		
		System.out.println("numeric string is "+digit);
	}

}