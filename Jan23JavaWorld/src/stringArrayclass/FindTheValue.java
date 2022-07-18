package stringArrayclass;

public class FindTheValue {
	
public static void main(String[] args) {
	
	String s [] = {"my","name","is","Ritesh"};
	System.out.println(s.length-1);
	
	for(int i=0; i<=s.length; i++) 
	{
	    if(s[i]=="is")	
	    {
	    	System.out.println(s[i]);
	    }
	}
}

}
