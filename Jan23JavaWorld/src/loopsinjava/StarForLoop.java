package loopsinjava;

public class StarForLoop {
	
	public static void main(String[] args) {
//		*****
//		*****
//		*****
//		*****
//		*****
//		*****
//		*****
//		
//
//		for(int j=1; j<=10; j++)
//		{
//		
//		for(int i=1; i<=5; i++)
//		{		
//		System.out.print("*");
//		}
//		
//		System.out.println();
//		
//		
//		}
//		
//		
//	}
//}


//	i/j  1 2 3 4 5
//	1    *
//	2    * *  
//	3    * * *
//	4    * * * *
//	5    * * * * *


	for(int b= 1; b<=10;b++) {
		
		
	for (int a=1; a<=10;a++) {
		
		if(a<=(10-b)) {
		System.out.print("*");}
		else {
	
	System.out.print(" ");}
	}	
	System.out.println();
	}
	}
}