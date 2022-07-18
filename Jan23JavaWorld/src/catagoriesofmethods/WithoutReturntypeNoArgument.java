package catagoriesofmethods;

public class WithoutReturntypeNoArgument {
	int i = 85;
	
	
	public static void m2()//Method without return type and without argument.
	{
		int i = 6;
		String s = "velocity";
	   System.out.println(s);
		System.out.println(i);//6
	}
	public void m1()
		{
			int i= 5;
			System.out.println(i);//5
			System.out.println(this.i);//85
			
			
		}public static void main(String[] args) {
			m2();
			WithoutReturntypeNoArgument abc = new WithoutReturntypeNoArgument();

			abc.m1();
			
			
			
		}
}
