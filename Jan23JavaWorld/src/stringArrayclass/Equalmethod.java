package stringArrayclass;



public class Equalmethod {
	
	public static void main(String[] args) {
		
		String a1 = "MY DEAR";
		String a2 = "my";
		
		  boolean eql  =  a1. equals (a2);
		  System.out.println(eql );
		  
		  
			String a3 = "MY DEAR";
			String a4 = "my dear";
			
	Boolean b	=	a3.equalsIgnoreCase(a4);
	
	System.out.println(b);
	
	
	
	
//	4. concat(String s) This method joins two string values
	
	String s = "velocity";
			
		String s1	 =  s.concat(" corporate");
		System.out.println(s1);
		
//	5. contains(String s): This method will check the given sequence as an argument is present inside the string or not.
		
		    boolean prsnt   = s.contains("city");
		    System.out.println(prsnt);
	

	
	String s7 = "perpendicular";//	6. substring(int beginindex): This method will form a string which starts with the index value that we are providing as an argument.
    System.out.println(s7.substring(3));//substring(int beginindex)
    System.out.println(s7.substring(3, 6));// subString(int beginindex, int endindex):
    System.out.println(s7.length());//length(): 
    System.out.println(s7.indexOf("i"));//indexOf(string ch): 
    System.out.println(s7.replace('c', 'x'));// 10. replace(char 'oldchar', char 'newchar'):
	
    String s8 = "Perpendicular Line";
    System.out.println(s8.replaceAll("Line", "triangle"));   //replace(String old, String new): 
    System.out.println(s8.toUpperCase());        
	System.out.println(s8.toLowerCase());
	
	
	//TRIM
	
//	This method is used to remove the starting and trailing space associated with the  String value but it cannot remove the in between space.
	
	String s24 = "  ritesh  ";
	String as = s24.trim();
	System.out.println(as);
	
//	
 //. isAlphabetic(char c): this method returns true if the character is an alphabet
           char s32 = 'r';
           
                boolean sd  = Character.isDigit(s32);
                System.out.println(sd);
                 boolean dq  = Character.isAlphabetic(s32);
                 System.out.println(dq);
            
                 
  // to convert primitive to String
          int l = 20;
          System.out.println(l+2);// addition is done
          
               String convert =  String.valueOf(l);
               System.out.println(convert+1);// conversion in string hence the concat the value 20+1=201
                
               
               boolean n = true;
                     String jk = String.valueOf(n);
                     System.out.println(jk);
             
//     Conversion of String to primitive data type:
                     
           String a20 = "50";
           System.out.println(a20+2);//  before coversion = 502
                int convrint  =  Integer.parseInt(a20);
                System.out.println(convrint+2);// after conversion = 52
                
                
                String s38 = "56.25";

                double doublevalue = Double.parseDouble(s38);

                System.out.println(doublevalue);//56.25
                
                System.out.println("*********************************************");

                String s39 = "true";
                
              boolean convr  =  Boolean.parseBoolean(s39);
              System.out.println(convr);
              
//              Regular expression:

           
                
}
}
