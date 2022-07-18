package practicesetsolution;

public class SwapTwoString {
	
	public static void main(String[] args) {
		
		String s1 = "Ritesh";
		String s2 = " Thakare";
		
//		String merge = s1.concat(s2);
//		System.out.println(merge);
//		String[] partition = merge.split(" ");
//		int sz = partition.length-1;
//		
//		for(int i=sz; i>=0; i--) 
//		{
//			System.out.println(partition[i]);
//		}
		
		String s = s1+s2;
		System.out.println(s);
		s2= s.substring(0, s.length()-s2.length());
		s1=s.substring(s2.length());
		System.out.println(s1+" "+s2);
	}

}
