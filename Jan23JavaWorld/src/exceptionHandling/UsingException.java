package exceptionHandling;



public class UsingException {

//	public static void main(String[] args) {
//		
//		try {
//			
//			int i =100, j=0, k=i/j;
//			
//			System.out.println(k);
//			
//			
//		}
//		catch(NullPointerException nu){
//			
//			System.out.println("null pointer exception handelling");
//				
//		}
//		catch(StringIndexOutOfBoundsException siobe) {
//			
//			System.out.println("StringIndexOutOfBoundsException is handelling");
//			
//			
//			
//		}
//		catch(ArithmeticException ae) {
//			
//			System.out.println("ArithmeticException is handelled");
//			
//			
//		}
//		
//		catch(Exception e)
//		{
//			
//			System.out.println("Exception is ");
//			
//			System.out.println(e.getMessage());
//			
//			
//		}
//		
//		
//		
//		
//	}



		public static void main(String[] args) {
			
			try
			{
				int i=10,j=0,k;
				k=i/j;
				System.out.println(k);
			}
			catch (ArithmeticException a)
			{
				System.out.println("ArithmeticException");
				System.out.println(a.getMessage());
			}
			catch(NullPointerException n)
			{
				System.out.println("NullPointerException");
			}
			catch(Exception e)
			{
				System.out.println("Exception");
     	
			}
			
		System.out.println();
}
}
