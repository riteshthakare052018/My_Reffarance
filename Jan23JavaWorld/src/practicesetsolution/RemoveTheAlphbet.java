package practicesetsolution;

public class RemoveTheAlphbet {
	
	public static void main(String[] args) {
		
		String s = "d5de5dd56d5dd";
		String numstring = "";
		
		for(int i=0; i<=s.length()-1;i++) 
		{
			if(Character.isDigit(s.charAt(i))) //if(!Character.isDigit(s.charAt(i))) // ddeddddd
			{
				numstring=numstring + s.charAt(i);
			}
		}
		System.out.println("given string digit are "+numstring);
	}

}
