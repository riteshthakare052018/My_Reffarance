package practicesetsolution;

public class RevrseTheSentense {
	public static void main(String[] args) {
		
		
		String s = "This is String";
		String rev="";
		
		String[] Splitvalue = s.split(" ");
		int size = Splitvalue.length-1;
		System.out.println(size);
		
		for(int i =size; i>=0; i--)
		{
			System.out.print(Splitvalue[i]+" ");
		}
		
	

	}

}
