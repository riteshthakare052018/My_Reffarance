package exceptionHandling;

public class TryCatchFinally extends NullPointerExample1 {
	
	public static void main(String[] args) {
		
		try {
			
		
		
		TryCatchFinally tcf = null;
		tcf.m();
		
		
		}
		catch( ArithmeticException ae) {
			
			System.out.println("NullPointerException is handelling");
			
			
		}
		
		catch(NullPointerException npe) {
			
			System.out.println("NullPointerException");
			
			TryCatchFinally tcf = new TryCatchFinally();
			                tcf.m();
			
			
		}
		
		finally {
			
			System.out.println("finally it is execute");
			
		} 
		
		
		
	}
	

}
