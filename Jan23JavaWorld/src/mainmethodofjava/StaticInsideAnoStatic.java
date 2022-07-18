package mainmethodofjava;

public class StaticInsideAnoStatic {
	
//	calling of static method inside another static method
	
	public static void M1() {
		
		System.out.println("M1 IS STATIC METHOD");
		
	
		
		
	}

	public static void M2() {
	
	System.out.println("M2 IS STATIC METHOD");
	
}
	
	public static void main(String[] args) {
		
		M1();
		 
		 M2();
		
		CallingOfNonStaticInsideStatic2.M3();
		
		
		 
	}

		
	}

	



