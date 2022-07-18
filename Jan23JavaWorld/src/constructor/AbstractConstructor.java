package constructor;

public abstract class AbstractConstructor {
	
	
	int a;
	
	public AbstractConstructor (int a) //  this is constructor with its body
	{
		this.a = a;  // initialize the value of instance veriable a
			
	}
	abstract int multiply (int number);   //  abstract method of abstract class

}
