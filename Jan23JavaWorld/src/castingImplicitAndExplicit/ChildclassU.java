package castingImplicitAndExplicit;

public class ChildclassU extends Parentclass {
	
	public void m1() {
		
		System.out.println("m1 method from UpCastingC");
		
	}
	public void m3() {
		System.out.println("m3 mehtod from UpCastingC");
		
	}
	
	public static void main(String[] args) {
		
		ChildclassU cst = new ChildclassU();
		Parentclass   pst  =   (Parentclass) cst;
		
		
//		Parentclass   pst= new ChildclassU();   modified
		
     	             pst.m1();
		             cst.m3();
	
		             cst.m1();
		
//		
//		             
//		             
//		             c.m3();// child class
//		     		
//		     		pp.m1();// child class
//		     		
//		     		pp.m2();// Parent class
//		     		

	}

}
