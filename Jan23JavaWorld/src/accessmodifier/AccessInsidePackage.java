package accessmodifier;

public class AccessInsidePackage extends Abstsactdiscussion {
	
	public void m3() {
		
		System.out.println("m3 method is abstract method after implementation");
		
	}
	
	public static void main(String[] args) {
		
		ThroughtPackage efg = new ThroughtPackage();
		                efg. s1();
		                
		                Default jkl = new Default();
		                
		
	AccessInsidePackage call = new  AccessInsidePackage ();
		             
		                call.m3();
	}
	
	

}
