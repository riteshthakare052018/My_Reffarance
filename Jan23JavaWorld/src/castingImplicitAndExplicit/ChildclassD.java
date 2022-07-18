package castingImplicitAndExplicit;

public class ChildclassD extends Parentclass {
	
	public void m1() {
		
		System.out.println("PARENT CLASS M1 METHOD from  ChildclassD");	
		}
		
	
     public void m2() 
    {
		System.out.println("m1 method from DownCastingC");
		
	}

	public static void main(String[] args) {
		
		ChildclassD a = new ChildclassD();
		Parentclass p    =   (Parentclass) a;//up casting
		
		ChildclassD pp   = ( ChildclassD) p;  // down casting
		             p.m1();
		             pp.m1();
		             p.m3();
		             pp.m3();
		               
}
}
