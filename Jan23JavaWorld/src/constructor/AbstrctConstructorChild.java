package constructor;

public class AbstrctConstructorChild extends AbstractConstructor  {
	
	
	
	public AbstrctConstructorChild()  // constructor never follow inhertance rule hence we have call the constructor using super keyword
	{
		super(20);  // call the constructor from the  AbstractConstructor class
	}
	 
	 int multiply (int number) //here we must have implement the incomplete method from parent class otherwise we have declere the class and method as abstract
	 {
		 return this.a*number;
	 }
	 
	 public static void main(String[] args) {
			
		 AbstrctConstructorChild d = new AbstrctConstructorChild();
		 
    	 System.out.println(d.multiply(10));
		 
		 
	}
	 
	
	 
	
}
