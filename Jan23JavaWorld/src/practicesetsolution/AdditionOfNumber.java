package practicesetsolution;

public class AdditionOfNumber {
	
public static void main(String[] args) {
		
		String s = "45sadasd7sdsa12sdsads8";
		String num = "";
	
		
		int temp =0;
		
		for(int i =0; i<s.length(); i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				num = num+ s.charAt(i);
				int intvalue = Integer.parseInt(num);
				temp= temp +intvalue;
				num = "";
			}

		}
		System.out.println("The sum is :"+temp);
		

}
}
