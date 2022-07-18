package Polymorphism;

public class OverloadingC extends OverloadingP {
	
	public static void s1() {
		
		System.out.println("m1 method with no argument");
		
	}
	public static void s1(int i) {
		
		System.out.println("m1 method with single argument");
		
	}
	public  void s1(boolean b) {
		
		System.out.println("s1 method with boolean");
		
	}
	
	public static void changename(int adharno, String updatename) {
		
		System.out.println("name changed");
		
	}
	public static  void changename1(int adharno, String updatename) {
		
		System.out.println("name changed1");
		
	}
	
	public void s1 (boolean b, int i) {
		
		System.out.println("m1 method with boolean and then int");
		
	}
	
	public  void s1(int i, boolean b) {
		
		System.out.println("m1 method with int and then boolean");
		
	}
	
	
	public static void main(String[] args) {
		s1();
		
		s1(50);
//		main(20);
		
		   changename(25,"ritesh");
		   changename1(28,"Ritesh");
		
		OverloadingC abc = new OverloadingC();
		            abc. s1(true);
				    abc. s1 (true,45);
				    abc. s1 (45,true);
				    abc. s1(50,'h');//   PARENT CLASS
				    
		    

		

		
	}
//	public static void main(int i) {
//		
//		System.out.println("calling main method in main method");
//		
//	}
//	

	}


