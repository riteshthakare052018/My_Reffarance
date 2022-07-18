package Methd_Accessmodifier;

public class ProtectedM {
	
	protected void S1() {
		System.out.println("protected method from s1 class");
		
	}
	protected void S2() {
		System.out.println("protected method from s2 class");
		
	}protected void S3() {
		System.out.println("protected method from s3 class");
		
	}
	public static void main(String[] args) {
		
		ProtectedM ghi = new 	ProtectedM();
		           ghi.S1();
		           ghi.S2();
		           ghi.S3();
		
	}

}
