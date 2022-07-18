package inheritance;

public class Child1 extends Parent1 {
	
	String s = "def";


public void bike () {
	
	System.out.println("bike method from child1 class");
	
	System.out.println(s);
	
	System.out.println(this.s);
	
	System.out.println(super.s);
	
	System.out.println(c);
	
}

public static void m1() {
	
	System.out.println("differant rule");
	
}
public void m2() {
	System.out.println("differant class");
	
}
public static void main(String[] args) {
	Child1 k = new Child1();
	       k.bike();
	           m1();
	       k.m2();
	
	
}
}