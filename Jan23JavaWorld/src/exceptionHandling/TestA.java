package exceptionHandling;

public class TestA extends NullPointerExample1 {
	
	public static void main(String[] args) {
		

	
	try {
		
//		TestA lol = null;
//		      lol.m();
		
	}
	
	catch(ArithmeticException ar) {
		
		System.out.println("ArithmeticException is arrieved");
		
		
	}
	catch(NullPointerException npe) {
		
		TestA lol = new  TestA();
		      lol.m();
		
		System.out.println("finall catch will math the class null point is arrieved");
		
	}
	catch (Exception e) {
		
		System.out.println("exception will handelled");
		
	}
	finally {
		
		System.out.println("finally block is executing");
	}
	
	

}
}

