package catagoriesofmethods;

public class NoReturntypeZeroArgument {
	
	public boolean m5()
	{
		System.out.println("method with return type");
		
		return false;
		
	}
	
	public static String m6()
	{
		String s = "Velocity";
		System.out.println("m6 is executing");
		
		System.out.println("static method with String return type");
		
		return s;
	}
	
public static void main(String[] args) {
		
	NoReturntypeZeroArgument com = new NoReturntypeZeroArgument();
			
	boolean returnvalue	= com.m5();
	
	System.out.println(returnvalue);// true
	
	String retvalue = m6();
	
	System.out.println(retvalue);
		
		
		
	}
}
