package practicetest;

public class Construct {
	
	public Construct(int i) 
	{
		System.out.println("buisiness logic");
		i=20;
		System.out.println(i);
	}
	
	public  Construct(String s, double d) {
		System.out.println(s+" "+d);
		
	}
	
	public static void main(String[] args) {
		
		Construct c = new Construct(20);
		Construct H = new Construct("height",6.9);
		
	}

}
