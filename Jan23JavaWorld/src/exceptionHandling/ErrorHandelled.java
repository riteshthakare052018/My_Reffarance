package exceptionHandling;

public class ErrorHandelled {
	
	public void m1() 
	{
		
		System.out.println("m1 method from error discussion");
		m2();
		
	}
	public void m2() {
		System.out.println("m2 method from error discussion");
		m1();
		
	}
	
	public static void main(String[] args) {
		
		ErrorHandelled eh = new ErrorHandelled();
				       eh.m2();
		
	}

}
