package exceptionHandling;

import java.io.FileNotFoundException;

public class Testfinally extends NullPointerExample1 {
	
	public static void main(String[] args) {
		
		try {
			
		
		
		Testfinally tf = null;
		tf.m();
		
		
		}
		catch( ArithmeticException ae) {
			
			System.out.println("NullPointerException is handelling");
			
			
		}
		
		catch(StringIndexOutOfBoundsException fnfe) {
			
			System.out.println("NullPointerException");
			
			Testfinally tf = new Testfinally  ();
			                tf.m();
			
			
		}
		
		finally {
			
			System.out.println("finally it is execute");
			
	
			
			
		}
		
	}
}

