package interfaceDiscussion;

public class ClassE extends ClassC implements InterfaceB {


	public void m1() {
		System.out.println("print the logic from interfaceB");	
	}


	public void m2() {

		System.out.println("print the logic from interfaceB");	
	}
public void m3() {
		
	System.out.println("print the logic from interfaceB");	
	}

	public void m4() {
		System.out.println("print the logic from interfaceB");	
	}

	
	public void m5() {

		System.out.println("print the logic from interfaceB");	
	}

	public void m6() {

		System.out.println("print the logic from interfaceB");	
	}
	
public void m7() {
		
		System.out.println("complete method of classE");
}
	
	public static void main(String[] args) {
		
		ClassE call = new 	ClassE ();
		       call.m1();
		       call.m2();
		       call.m5();
		       call.m7();
		
	}

}
