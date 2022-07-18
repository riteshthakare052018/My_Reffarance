package typeofvariable;

public class NonStaticVeriable {
	
	String a = "Ritesh";
	
	 int   b = 129;
	 
	 int   c = 100;
	 
public static void main(String[] args) {
	

	
	NonStaticVeriable nsv = new NonStaticVeriable();
	
	
	System.out.println(nsv.a);
	System.out.println(nsv.b);
	System.out.println(nsv.c);

	
	int h = nsv.b+25;
	int d = nsv.c+25;
	int r = nsv.b+nsv.c;
	
	System.out.println(h);
	System.out.println(d);
	System.out.println(r);
	
	
}
}
