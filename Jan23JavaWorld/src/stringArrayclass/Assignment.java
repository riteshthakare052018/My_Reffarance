package stringArrayclass;

public class Assignment {
	
	public static void main(String[] args) {
		String v = "velocity";
		
		System.out.print(v.charAt(0));
		System.out.print(" ");
		System.out.println(v.indexOf("v"));
		
		System.out.print(v.charAt(1));
		System.out.print(" ");
		System.out.println(v.indexOf("e"));
		
		System.out.print(v.charAt(2));
		System.out.print(" ");
		System.out.println(v.indexOf("l"));
		
		System.out.print(v.charAt(3));
		System.out.print(" ");
		System.out.println(v.indexOf("o"));
		
		System.out.print(v.charAt(4));
		System.out.print(" ");
		System.out.println(v.indexOf("c"));
		
		System.out.print(v.charAt(5));
		System.out.print(" ");
		System.out.println(v.indexOf("i"));
		
		System.out.print(v.charAt(6));
		System.out.print(" ");
		System.out.println(v.indexOf("t"));
		
		System.out.print(v.charAt(7));
		System.out.print(" ");
		System.out.println(v.indexOf("y"));
		
		
		System.out.println("*******************************************");
		
//		  DESCENDING ORDER
		  
/*		String s = "excellant";
		  System.out.println(s);
		    int length =   s.length();
		    
		          int i   =  length-1;
		            
		  do 
		  {
			  System.out.print(s.charAt(i));  //removing ln
			  i--;
		  }
		  while (i>=0);  */ 
		  
		    
	String c = "corporate";

  
 for (int i=0; i<(c.length()); i++)

  {
	          char word = c.charAt(i);  // know the word print
//	          int index =  c.indexOf(word); // know the word index number print
	        
	          System.out.println(word+":"+i);
  }
		  

}

}
