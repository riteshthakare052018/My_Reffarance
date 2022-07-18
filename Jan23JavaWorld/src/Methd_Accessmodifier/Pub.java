package Methd_Accessmodifier;

import Polymorphism.OverloadingC;

public class Pub extends OverloadingC {
	
	public static void m1() {
		
		System.out.println("public level method");
//		: If we declare a method as public then we can access that method throughout the project (within the package or outside the package)provided that class is accessible to that location.
	
	
		
	}public static void main(String[] args) {
		 m1();
		
		DefaultMethod abc = new DefaultMethod();
		              abc.M2();		
//		       Private efg = new Private();
//		                efg.m3();          //If we declare a method as private then we can only be able to access that method with in the class.
		
		              
		              
		 ProtectedM mno = new ProtectedM ();
		            mno.S1();
		            mno.S2();
		            mno.S3();

//		            Overloading sd = new  Overloading ();// we can access both way
//	                sd.s1(false);
		            
	            Pub sd = new  Pub ();// we can access both way
	                sd.s1(false);
	                
	     


	}
	}
