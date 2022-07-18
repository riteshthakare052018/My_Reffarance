package Polymorphism;

public class OverloadingP {
	
	public void s1(int i, char k) {
		System.out.println(" s1 method from parent class");
		
	}
	public static void main(String[] args) {
		
		OverloadingC lk = new OverloadingC();
		            lk.s1(false);
		
	}

}
