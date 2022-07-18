package Methd_Accessmodifier;

public class Private {
	
	private  void m3() {
		
		System.out.println("only access in the class");
		
	}
	public static void main(String[] args) {
		Private abc = new Private();
		
		           abc.m3();
		           
		          Pub.m1();// WE CAN ACCESS PUBLIC METHOD IN THE PRIVATE METHOD
	}

}
