package stringArrayclass;

public class RemoveDigit {
	
	public static void main(String[] args) {
		
		int [] a = new int [10];
		
		
		a[0] = 1;
		a[1]= 20;
		a[2]= 25;
		a[3]= 30;
		
     System.out.println(a[3]);
     System.out.println(a.length);
     
     for(int i = 0; i<a.length; i++)
     {
    	 System.out.println(a[i]);
    	 
     }
    
     System.out.println("******************************************");
     
//     REMOVE DIGIT FROM STRING by using to charArray
     
     
        String s = "abc@123def234ghi964";
   
           char[]  m  = s.toCharArray();
               System.out.println(m);
               System.out.println(m.length);
               
               for(int i=0; i<m.length; i++)
               {
            	 boolean num =Character.isDigit(m[i]);// 
            	 
//           	 System.out.println(num);
//            	 System.out.println(m[i]);
            	 
            	 if(!num) // (!num)= abc@defghi or (num) = 123234964
            	 {

            		 System.out.print(m[i]);  
            		 System.out.println();  
            	 }
            	 
            
              }            
  System.out.println("*********************************************");
  
//REMOVE DIGIT FROM STRING by using to replaceall
              
           String s3 = s.replaceAll("[0-9]", ""); 
           System.out.println(s3);//abc@defghi
          
           String s4 = s.replaceAll("[^0-9]", ""); 
           System.out.println(s4);//123234964
           
           
           
           System.out.println("*****************************************************");
           
//           wrong
//		String i = "i am a indian";
//		char c = i.charAt(5);
//           for(int j=i.length(); j>=0; j--)
//   		{
//   			System.out.println(j);
//   				
//   		}
          
	}
	}
