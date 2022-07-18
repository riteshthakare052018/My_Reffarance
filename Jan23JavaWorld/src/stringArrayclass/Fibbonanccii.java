package stringArrayclass;

public class Fibbonanccii {
	
	public static void main(String[] args) {
		
		
//		1 1 2 3 5 8 13 21
//		1+1 1+2 3+2 5+3 8+5 13+8
		
		
		int first = 0;
		int last = 1;
		int add =0;
		
		System.out.println(first+" "+last);
		
		for (int i=2; i<=10; i++)
		{
			 add = first+last;
			 System.out.println(add);
			 first = last;
//			 System.out.println( first);
			      last =add;
//			      System.out.println(last);
		
			
		}
	}

}
