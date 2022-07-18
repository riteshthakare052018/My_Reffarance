package stringArrayclass;

import Methd_Accessmodifier.Pub;

public class ArreysInJava {
	
	public static void main(String[] args) {
		
//		Arrays in java
		
		
	     int [] a = new int[10];
  		
  		a[0] = 1;
  		a[1] = 60;
  		a[2] = 70;
  		a[3] = 98;
  		a[4] = 12;
  		a[5] = 45;
  		a[6] = 80;
  		a[7] = 82;

		System.out.println(a[5]);
		
		for(int i=0; i<=7; i++)
		{
		
		System.out.println(i+":"+a[i]);	
		}
		
		System.out.println("*********************************************");
		
		int aw [] = new int[12];
		      int count = aw.length; // total no of int value
		       System.out.println(count);
		       
//		       For each loop or advance for loop:
		    	 //for(Variable which is the type of each value:to whom we wants to iterate)
//		    	 	{
//		    	 			
		    	 // }
    
		 for (int i : a) {
			 
			 System.out.println(i);
			 if(i==45) {
				 break;
			 }
			
		}      
		       
	System.out.println("********************************************");	       
		       
		       		       
//		       SPLIT  by for each and for loop
		   	
		   	String s25 = "my name is genious";
		   	String[] sa = s25.split("i");
		       System.out.println(sa.length);  //3
		   	
		   	for (String s26 : sa) 
		   	{
		   		
		   		System.out.println(s26);
		   		
		   	}
		     System.out.println("************************************************");  
		       
		   	String[] sa1 = s25.split("m");
		       System.out.println(sa1.length); 
		   	
		       for (int i=0; i<sa1.length; i++)
		   	{
		   		System.out.println(sa1[i]);
		   	}
// toCharArray(): This method is used to convert the string into character array.
		   	
		       String s30 = "welcome";
		               char[] RT  =  s30.toCharArray();
		               System.out.println(RT);
		               for (char c : RT)
		            {
		   				System.out.println(c);
		   			}
		       System.out.println("****************************************");
		               
//		               Alternative way to define the array:
		         	      
		               String[] o = {"abc","def","ghi"};
		                       int h  =  o.length;
		
		                       System.out.println(h);
		                       
		        String s = "my name is ritesh";
		        int l = s.length();
		        System.out.println(l);
		    
		        
		        for(int i=l-1;i>=0;i--) 
		        {
		        	System.out.print(s.charAt(i));
		        }
		              
		
}

}
