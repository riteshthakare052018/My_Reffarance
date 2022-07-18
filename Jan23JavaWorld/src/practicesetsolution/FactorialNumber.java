package practicesetsolution;

public class FactorialNumber {
	public static void main(String[] args) {
	
	int num = 5;
	
	int factorail = 1;
	
//	for(int i=1; i<=num;i++) 
	for(int i=num; i>=1;i--)// for reverse factorail number
	{
		factorail=factorail*i;
	}
	System.out.println("factorial of number is :"+factorail);

}
}