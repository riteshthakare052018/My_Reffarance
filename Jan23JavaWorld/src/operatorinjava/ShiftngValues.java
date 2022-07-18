package operatorinjava;

public class ShiftngValues {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		int b = 20;
		
		int temp;
		   temp=a;// value of a moving temp
		      a=b;// value of b is moving in a
		      b=temp; //value of temp shifting in b 
		      
		      System.out.println("the value of b is "+b);
		      System.out.println("the value of a is "+a);
		      
		      
		
	}

}
