package arrayDiscussion;

public class ReveseString {
	
	public static void main(String[] args) {
		
		String s = "MY NAME IS RITESH";
		String[] seprate = s.split(" ");
//		
//		for(int i=seprate.length-1; i>=0;i--)
//		{
//			System.out.println(seprate[i]);
//		}
		
	for(int i=0; i<=seprate.length; i++) 
	{
		for(int j=seprate[i].length()-1; j>=0; j--) 
		{
			System.out.println(seprate[i].charAt(j));
		}
		System.out.println(" ");
	}

}
}
