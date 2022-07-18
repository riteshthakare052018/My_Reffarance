package accessmodifier;

import Methd_Accessmodifier.Pub;

final  class A {
	
	public void f1() {
		
		System.out.println("hiii");
		
	}
	 
	 public static void main(String[] args) {
		 
		 Pub.m1();
		 
		 A feb = new A();
		   feb.f1();
		 
		 
	
	}
	
	

}
