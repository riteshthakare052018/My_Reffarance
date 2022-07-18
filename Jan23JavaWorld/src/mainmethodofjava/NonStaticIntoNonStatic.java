package mainmethodofjava;

public class NonStaticIntoNonStatic {
	
	public void subtraction() {
		
		int a = 25;
		
		int b  = 45;
		
		int s  =  a-b;
		
		System.out.println("s is equal to"+s);
		
				
	}
public void l2() {
	
}
public static void main(String[] args) {
	
	 NonStaticIntoNonStatic n = new  NonStaticIntoNonStatic();
	 
	 n.subtraction();
	 
	 
	
}

}
