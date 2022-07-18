package catagoriesofmethods;

public class WithoutReturntypeWithArgument {
	
	public void E1(int s,String d,boolean k) {
		
		System.out.println(s);// while we have print the value of s
		System.out.println(d);// while we have print the value of d
		System.out.println(k);// while we have print the value of k
		
	}
	public static void E2(String value) {
		System.out.println(value+" CITY");// when we have print the value of String with the "CITY"
		
		
		
	}public static void main(String[] args) {
		 WithoutReturntypeWithArgument abc = new  WithoutReturntypeWithArgument();
		 abc.E1(20, "Ritesh", true);// We are calling the method with their variable values
		 
		
		E2("PUNE");//  We are calling the method with their variable value
		
		
	}

}
