package typeofvariable;

public class StaticVariable {
	
	static int  a = 10;
	
	static int b =  25;
	        
	  

	        
	        

	public static void main(String[] args) {
//		access the static veriable in same class
		
		System.out.println(a);
		
		System.out.println(b);
		
//		access the static veriable in differant class
		
		System.out.println(StaticVeriable2.n);
		System.out.println(StaticVeriable2.h);
		
		int v = a+20;
		
	     int d = 12+b; 
	     
	     int f =  a+b;
	      
		
		
		
		
		System.out.println(v); 
		
		System.out.println(d);
		
		System.out.println(f);
		
		
		
		
	}
}
     