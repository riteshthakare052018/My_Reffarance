package arrayDiscussion;

import Methd_Accessmodifier.Pub;

//Array can be used as an argument to the method

public class WithArgument {
	
	public void m1(int[]A) {
		A[0]=15;
		A[1]=101;
		
		for(int i:A) 
		{
			
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		
		
      int []a = new int [5];
      
      a[0] = 11;
      a[1] = 12;
      a[2] = 13;
      a[3] = 14;
      a[4] = 15;
      
      WithArgument arg = new WithArgument ();
      
		
		arg.m1(a);
	
	   
}

}


