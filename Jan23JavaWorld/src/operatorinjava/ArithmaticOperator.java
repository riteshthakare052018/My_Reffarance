package operatorinjava;

public class ArithmaticOperator {
	
	public static void main(String[] args) {
//		addition
		int a = 1;
		int b = 2;
		int c = a+b;
		
		System.out.println(c);
		
//		substraction
		
		int d = a-b;
		System.out.println(d);
		
		
//		iii. multiplication operator '*'
		
		int e = a*b;
		System.out.println(e);
		
//		iv. division operator '/'
		
		double f = a/b;
		
		System.out.println(f);
		
		double g = b/a;
		
		System.out.println(g);

//		v. modulo operator '%'- It provides the remainder value of the operation.
		
		int j = 10;
	    int k = 3;
		
		int l = k%j;
		int m = j%k;
		
		System.out.println(l);
		System.out.println(m);
		
		byte b1 = 10;
		byte c1 = 50;
		
		int d1 = b1 + c1 ;
		System.out.println(d1);

//		assignment operator
	int z = 50;
		
		int e1 = (z+1)-(z-2);
		
		System.out.println(e1);//3
		
//		comparative operator
		
//		greater than '>'
		
		int n = 85;
		int o = 95;
		
         boolean p =o>n;
         System.out.println(p);
         
// 		less than '<'
         
       boolean k1 =o<n;
       System.out.println(k1);
       
//   	equals to operator '=='
   	
   	boolean h1 = n==o;
   	
   	System.out.println(h1);//false

   	boolean w = n==1;
	System.out.println(w);// true

		


			


	}

}
