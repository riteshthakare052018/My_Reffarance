package loopsinjava;

public class AssignmentLoop {
	
	
	/*
	  0 1 2 3 4 
	 0* * * * *
	 1* * * * *
	 2* * * * *
	 3* * * * *
	 4* * * * *
	 */
	
	public static void main(String[] args) {
//		
//		for (int i = 0; i<5;i++)//times 0,1,2,3,4
//		{
//			for(int j=0; j<5; j++)// values0,1,2,3,4
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//
//}
		
		
		
		
//		NEXT PROGRAMM
		
//		*****
//		**** 
//		***  
//		**   
//		*
//

//     for (int e = 1; e<=5; e++) {
//     for(int d = 1; d<=5;d++) {
//    	 
//    	 if(d<=(6-e)) {
//    		 System.out.print("*");
//    		 
//     }else
//		{
//    	 System.out.print(" ");
//     }
//    	
//    	 
//    	 
//     }
//     System.out.println();
//		
//	}
//}
//}
		
		
		
		
//		NEXT PROGRAMM
		
//		step1
//		i= row(outer)
//		j= column 
		
//		i/j  1 2 3 4 5
//		1    * * * * *
//		2      * * * *  
//		3        * * *
//		4          * *
//		5            *
		
//	* i=1 j=2    i=2 j=3  i=3 j=4
//			
//	* j>=i----> 1>=2  2>=2 1>=3 4>=3	

		
//		step no2 mapping
		
//		i/j  
//		1    1 2 3 4 5
//		2      2 3 4 5  
//		3        3 4 5
//		4          4 5
//		5            5
		
		
//		step no 3
//		j  null star
//		1. j>1 j<=5
//	    2. j>2 j<=5
//	    3. j>3 j<=5
//	  	4. j>4 j<=5
//	  	   j<=5
		
//		final
//		j>=i
//		
		for(int i=1; i<=5; i++)
		{
		
		for(int j=1; j<=5; j++)
		{
			if(j>=i)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		
		System.out.println();
		
		
		}
	}

}	

		
		
		