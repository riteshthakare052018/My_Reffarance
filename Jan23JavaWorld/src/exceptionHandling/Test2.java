package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 extends NullPointerExample1 {
	
	public static void main(String[] args) {
		
		try {
			
			Test2 lol = null;
			      lol.m();
			      
		}
		
		catch(ArithmeticException ar) {
			
			System.out.println("ArithmeticException is arrieved");
					
		}
		catch(ClassCastException fnfe) {
			
			Test2 lol = new  Test2();
		          lol.m();
			  
			
			System.out.println("finall catch will math the class null point is arrieved");	
		}
		catch (Exception e) {
			
			System.out.println("exception will handelled");		
		}
//		finally {
//			
//			System.out.println("finally block is executing");
//		}
	
		
	}

}
//No exception of type Exception can be thrown; an exception type must be a subclass of Throwable