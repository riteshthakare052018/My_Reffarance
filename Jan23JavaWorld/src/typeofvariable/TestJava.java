package typeofvariable;

public class TestJava {
	
	static int A = 25;
	
	       int B = 30;
	       
	       
 public static void main(String[] args) {
	 System.out.println(A);
	 
	 TestJava R = new TestJava();
	 System.out.println(R.B);
	 
	 A = 12;
	 System.out.println(A);
	 
	R.A = 60;
	System.out.println(R.A);
	
	 TestJava R1 = new TestJava();
	 System.out.println(R1.B);
	 
	 R1.B = 40;
	 System.out.println( R1.B);
	 System.out.println(R.B);
	 System.out.println(R1.A);
	 
	 R.A = 85;
	 R1.A = 55;
	 R1.B = 95;
	 R.B =  100;
	 
	 System.out.println(A);
	 System.out.println( R.A);
	 System.out.println( R1.A);
	 System.out.println( R1.B);
	 System.out.println( R.B );
	 
	 
	
	
	 
			
}
	       
}

