package practicesetsolution;

public class ReverseSplitValue {
	
	public static void main(String[] args) {
		
		String s = "my name is jack";
		String rev = "";
		
		String[] saprate = s.split(" ");
		int sz = saprate.length-1;
		
		for(int i=sz;i>=0; i--) 
		{
			System.out.println(saprate[i]);
		}
	}

}
