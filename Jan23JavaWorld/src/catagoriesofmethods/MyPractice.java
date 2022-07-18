package catagoriesofmethods;

public class MyPractice {
	
	public boolean a5() {
		System.out.println("a5 is non static");
		System.out.println("print the value of method a5");
		return true;
		
	}
	public static String a8(){
		String s = "Ritesh";
		System.out.println("print the value o ritesh");
		
		return s;
		
		
	}public static void main(String[] args) {
		MyPractice abc = new MyPractice();
		
//		        execution of method a5
		             boolean return_value = abc. a5();
		             System.out.println("value of boolean="+return_value);
		             
//		             execution of method a8
		          String value = a8(); 
		          System.out.println( value );
		
	}

}
