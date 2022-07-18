package methodpracticesession;

public class NonStaticInsideStatic {
	
	public void addition() {
		
        int a = 2;
		
		int b = 4;
		
		int c = a+b;
		
		System.out.println("c is ="+c);
	
		
	}
	
	public static void f1() {
	
		
	
	}
	
	public static void main(String[] args) {
		
		NonStaticInsideStatic k = new NonStaticInsideStatic();
		
		k.addition();
		
		CallingFromStaticIntoNonStatic.Divide();
		
	}
	
	

}
