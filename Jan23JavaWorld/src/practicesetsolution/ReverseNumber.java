package practicesetsolution;

public class ReverseNumber {

	
	public static void main(String[] args)   
	{  
	int i = 123456, reverse = 0;  
	//we have not mentioned the initialization part of the for loop  
	for(; i!=0; )   
	{  
	int remainder = i % 10;  
	reverse = reverse * 10 + remainder;  
	}  
	System.out.println("The reverse of the given number is: " + reverse);  
	}  

}

