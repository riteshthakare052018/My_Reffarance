package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Throwsleep {
	
	public static void main(String[] args) throws InterruptedException  {
		
				FileNotFoundException fise = new FileNotFoundException  ("sdsds");
		
		System.out.println("first line");
		
		Thread.sleep(3000);
		
		System.out.println("last line");
		
		
	}

	
//	public static void main(String[] args) {
//		
//		System.out.println("start");
//		
//		try {
//			
//			Thread.sleep(3000);
//			
//		}
//		catch (ArithmeticException ae) {
//			
//			System.out.println("ArithmeticException is executing");
//			
//			
//		}
//		catch (InterruptedException e) {
//			
//			System.out.println("executing...");
//	
//		}
//		
//		System.out.println("end");
		
//	}
}
