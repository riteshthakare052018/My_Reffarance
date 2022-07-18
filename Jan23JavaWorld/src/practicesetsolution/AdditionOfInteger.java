package practicesetsolution;

public class AdditionOfInteger {
	
	

	public static void main(String[] args) {
		
		String s = "34khdhd3ajkldj5nsdn78";
//		int l = s.length();
//		System.out.println(l);
		String num = "";
		int sum = 0;
		int flag= 0;
		
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			if(Character.isDigit(c)) 
			{
				num=num+c;
				flag=1;
			}if(i!=(s.length()-1)) 
			{
				continue;
			}
			if(flag ==1)
			{
				int value = Integer.parseInt(num);
				num = "";

				sum = sum+ value;

				flag =0;

			}






		}

		System.out.println("The addition of numbers is :"+sum);

	}
		
		
	}


