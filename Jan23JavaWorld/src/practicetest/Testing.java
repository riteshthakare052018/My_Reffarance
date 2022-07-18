package practicetest;

public class Testing {
	
	
	int i = 10;
	
	static String s= "abc";
	
	public void m1()
	{
		int i= 5;
		System.out.println(i);//5
		System.out.println(this.i);//10
		System.out.println(this.s);//abc
	}
	
	
public static void m2()
{
	int i = 6;
	
	System.out.println(i);//6
}

public static void main(String[] args) {
	
	Testing.m2();
	
	 Testing tst = new Testing();
	    tst. m1();
	
}
}



