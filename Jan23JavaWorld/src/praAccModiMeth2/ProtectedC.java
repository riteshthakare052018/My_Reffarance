package praAccModiMeth2;

import praAccModiMeth.Protected;

public class ProtectedC extends Protected {
	
	public void a1() {
		System.out.println("my name");
		
	}
	
	public static void main(String[] args) {
		
		ProtectedC abc = new ProtectedC();
		           abc.m1();
		           abc.m2();
		
	}
	
}
