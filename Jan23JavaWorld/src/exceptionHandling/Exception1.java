package exceptionHandling;

public class Exception1 {
	
	public static void main(String[] args) {
		

	int i = 10;
	
	int j = 0;
	
	int k;
	

	try {
		
		 k = i/j;
		
		
	}
	catch(ArithmeticException ie)
	{
		
//		System.out.println("cath block of arithmetic exception is executing");
		k=10;
	}
	System.out.println("the value of k is " + k);
	
	
	}

}
