package constructor;

public class ConstructorUsage {
	
	int i;
	String j;
	char   k;
	boolean l;

public ConstructorUsage(int m, String n, char o, boolean p ){
	
   i=m;
   j=n;
	k=o;
	l=p;
	
	System.out.println(i);
	System.out.println(j);
	System.out.println(k);
	System.out.println(l);
	
	
	
}public static void main(String[] args) {
	ConstructorUsage abc = new ConstructorUsage(20,"velocity",'a',false);
	System.out.println();
	ConstructorUsage abc1 = new ConstructorUsage(50,"velocity",'a',true);

//	System.out.println(abc.j+ abc.k+abc.i+abc.l);
//	System.out.println(abc.j);
	
}
}
