package practicesetsolution;

public class ReverseTheInteger {
	
	public static void main(String[] args) {
		
	
	
//	String str = "Ritesh";
//	
//
//	
//	
//	public static void main(String[] args) {
//		System.out.println(str.);
//		System.out.println(str.lastIndexOf(""));
	
	int num = 12345;
	int rev = 0;
	while(num !=0){
	rev =rev *10+ num % 10;
	num = num/10;
	System.out.println(rev);
	}
	String str = "Y^%^*%&*^*(&*(Pankaj)";
	str= str.replaceAll("[^a-z, 0-9, A-Z]", str);

	}


	}


