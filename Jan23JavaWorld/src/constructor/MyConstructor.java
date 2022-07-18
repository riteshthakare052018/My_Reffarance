package constructor;

public class MyConstructor {
	
	public  MyConstructor() {
		System.out.println("print my name");
		System.out.println("hello");
		
	}	public MyConstructor(int i) {
		this();
		System.out.println(95);
		System.out.println("this is the single constructor argument");
		
		
	} public  MyConstructor(int i, boolean d) {
		this(95);
		System.out.println("this is double contructor argument");
		
		
	}public  MyConstructor(String a, char k, boolean j){
		this(5,true);
		System.out.println("this is multi contructor argument");
//		System.out.println("\"ritesh\", 'g', false");
		
	}
	
	public static void main(String[] args) {
		 MyConstructor abc = new  MyConstructor("ritesh", 'g', false);
		
		
		 
		
                   		 
		
	}
	
	
	
	
}



