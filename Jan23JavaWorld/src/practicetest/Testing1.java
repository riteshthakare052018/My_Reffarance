package practicetest;

public class Testing1 {
	
	
	public void m3(int i, String j, boolean k)
	{
		System.out.println(20+i);
		System.out.println(j+" corporate training");
		System.out.println(k);
	}
	
	public void m4(String value)
	{
		System.out.println(value+" city");
		
		
	}
	
	public static void main(String[] args) {
		
		Testing1 com = new Testing1();
		com.m3(60, "Velocity", false);
		
		com.m4("Pune");
	}


}
