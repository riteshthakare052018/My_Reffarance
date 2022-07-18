package practicesetsolution;

public class test1 {
	

		public static void main(String[] args) {

			String s="10value8with30number10";   //output: 10+8+30+10=58
			String s1="";
			int sum=0;
			char[] c=s.toCharArray();
			for(int i=0;i<c.length;i++)
			{
			    if(Character.isDigit(c[i]))
			    {
			    	s1+=c[i];
			    }
			    else
			    {
			    	if(!s1.equals(""))
			    	{
			    	  int a=Integer.parseInt(s1);
					  sum=sum+a;
					  s1="";
			    	}
			    }
		     }
			
			 if(!s1.equals(""))  
			 {
				 int a=Integer.parseInt(s1);
				  sum=sum+a;
			 }
			 System.out.println(sum);
			}
	}


