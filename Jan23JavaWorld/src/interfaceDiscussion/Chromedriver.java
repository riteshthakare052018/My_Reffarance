package interfaceDiscussion;

public  class Chromedriver implements Interface {

	
	public void close() {
		
		System.out.println("close the browser");

		
	}

	public void open() {
		
		System.out.println("open the browser");
	}


	public void enter() {

		System.out.println("enter the system");
		
	}


	public void click() {
         System.out.println("click on the object");		
		
	}

	
	public  void getid() {
	
		
		System.out.println("get the value from field");
	}
	
//	public static void d1() {
//		
//		System.out.println("d1");  // We can have static methods inside an interface but that should have complete method / concrete method.
//		
//	}
	
	public static void main(String[] args) {
//		 d1();
		
		Chromedriver drive = new Chromedriver();
		             drive.click();
		             drive.close();
		             drive.enter();
		             drive.open();
		             drive.getid();
		             
		Interface drive1 = new Chromedriver();
		              drive1.click();// We cannot create the object of an interface as it contains only incomplete method. But we can create reference variable of an interface.
		     

	
		
	}

}
