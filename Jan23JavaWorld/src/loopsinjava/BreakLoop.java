package loopsinjava;

public class BreakLoop {
	
	public static void main(String[] args) {
		
		for ( int a=1; a<=10;a++) {
			System.out.println("hello");
			
			if(a==2) {
				
				break;
			}
			
			System.out.println("hii");
		}
		System.out.println("exit the loop");
	}

}
