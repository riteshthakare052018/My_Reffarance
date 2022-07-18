package methodpracticesession;

public class StaticInsideNonStatic {
	
	public static void addition()
	{
		int a = 2;
		
		int b = 4;
		
		int c = a+b;
		
		System.out.println("c is ="+c);
	
		
	}
	
	public void D3() {
		
		addition();
		
		CallingFromStaticIntoNonStatic.Divide();
		
	}
	public static void main(String[] args) {
		
		
		addition();
	
		CallingFromStaticIntoNonStatic.Divide();
		
		
	}
	
		
	}
	
	

		
		
	
	
		
	
		
	
	

		
	
		
		
		
		 
	

