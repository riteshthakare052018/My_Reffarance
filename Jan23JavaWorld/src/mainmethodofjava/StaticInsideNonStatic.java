package mainmethodofjava;

public class StaticInsideNonStatic {
	
	public static void E1() {
		
		System.out.println("E1 IS STATIC METHOD");
		
		
	}
	public void E2() {
		
//		CALLING OF STATIC FROM SAME CLASS 
		E1();
		
//		CALLING OF STATIC FROM DIFFERANT CLASS
		
	CallingStaticInToNonStatic.E3();	
		
	}
	
	public static void main(String[] args) {
		
		E1();
		
		CallingStaticInToNonStatic.E3();
	}
}
	
	
