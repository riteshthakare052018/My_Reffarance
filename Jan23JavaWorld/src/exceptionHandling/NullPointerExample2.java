package exceptionHandling;

public class NullPointerExample2 {
	
	NullPointerExample1 kl;
	
	public void calcii() {
		
		try {
			
			System.out.println(kl.i);
			
		}
		catch(NullPointerException np) {
			
			System.out.println("NullPointer Exception is arrieved ");
		}
		catch(ArithmeticException ie){
			
			System.out.println("ArithmeticException");
			
		
			
		}
	}
	
	
	public static void main(String[] args) {
		
		NullPointerExample2 mn = new NullPointerExample2();
		                    mn.calcii();
		
		
		
	}

}
