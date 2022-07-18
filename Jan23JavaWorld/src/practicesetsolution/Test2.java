package practicesetsolution;

public class Test2 {
	
	public static void main(String[] args) {
		
		int a = 20,
		    b= 10;
		System.out.println("before swapping of value are :"+a+"  "+b);
		
//		int t = a;
//		    a=b;//10
//		    b=t;//20
//		   
//		    System.out.println("after swapping of value are :"+a+"  "+b);
		    
//		    a = a+b;//20+10=30
//		    b= a-b;//30-20=10
//		    a=a-b;  //30-10=20;
//		    
//		    System.out.println("after swapping of value are :"+a+"  "+b);
		
		a=a*b; //20*10= 200
		b =a/b;// 200/10=20
		a=a/b;  //200/20=10
		
		System.out.println("after swapping of value are :"+a+"  "+b);
	}

}
