package typeofvariable;

public class ThisVeriable {
	
	        int    A =  55;
	 static String B = "BEST";
	
	 public void m1() {
		 
		 
		 int A = 65;
	 System.out.println(A);// we will access the veriable inside the local veriable
	 System.out.println(this.A);//we will access the global veriable inside (local veriable) non static method.
	 System.out.println(this.B);//when we will access the global veriable inside (local veriable) non static method then use "this" keyword
	 
	 
	 }public static void m2() {
		 
		 int z = 30;
		 System.out.println(z);
		 System.out.println(B);
		
	}
	 
	 public static void main(String[] args) {
		 ThisVeriable abc = new ThisVeriable();
		  
		 abc.m1();// we will call the non static method in main method by ref var.method name
		 m2();    // we will call the static method in in main method by direct method name        		
	}
}