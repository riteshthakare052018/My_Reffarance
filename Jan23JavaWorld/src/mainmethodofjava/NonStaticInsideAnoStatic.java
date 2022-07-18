package mainmethodofjava;

public class NonStaticInsideAnoStatic {
	


	
	public void R1() {
		
		System.out.println("R1 IS NON STATIC");
	}
	
//	calling of non static method inside the static method
	

	
	public static void R2() {
		
	

	}
	
	public static void main(String[] args) {
		
NonStaticInsideAnoStatic t = new NonStaticInsideAnoStatic();
		
		t.R1();
		
		
	CallingOfMethodInsideNonStatic2 T1 = new CallingOfMethodInsideNonStatic2();
		
		T1.S3();
		
		
		
	}
	
}
		
	


