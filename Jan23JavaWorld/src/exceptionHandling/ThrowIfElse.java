package exceptionHandling;

public class ThrowIfElse {
	
	public static void main(String[] args) {
	
	int a = 50;
	
	int b = 30;
	System.out.println("first line before the exception");
	
	if(b>a)
	{
	throw new ArithmeticException();
	}
	
	else if(b<a)
	{
		throw new NullPointerException("Please try after sometime");
		
	}
	System.out.println("last line after exception");
	}

}




