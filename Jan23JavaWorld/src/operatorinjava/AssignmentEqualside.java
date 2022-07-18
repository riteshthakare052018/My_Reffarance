package operatorinjava;

public class AssignmentEqualside {
	
	public static void main(String[] args) {
		
		int a = 20;
		
		int b = 20;
		
		int c = 25;
		
		int d = 20;
		
		boolean e = a==b; //true
		System.out.println(e);// false
		boolean f = c==d;
		System.out.println(f);
		
//		boolean k = e && f;
//		boolean k = e || f;
		if(a==b && c==d){
			
			System.out.println("square are equal");
			
		}else
			
		{System.out.println("square are unequal");
		
		}
		
//		if the value get double or half without using add operator
		
		System.out.println(50>>1);
		System.out.println(50<<1);
	}
}