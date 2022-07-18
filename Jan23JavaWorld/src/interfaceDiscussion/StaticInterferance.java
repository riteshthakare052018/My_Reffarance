package interfaceDiscussion;

public interface StaticInterferance {
	
	public static void m1() {
		
		System.out.println("calling static inside the interferance");
		
	}
	
	public static void main(String[] args) {
		
		 StaticInterferance.m1();//We can have static methods inside an interface but that should have complete method / concrete method. 
		
	}

}
