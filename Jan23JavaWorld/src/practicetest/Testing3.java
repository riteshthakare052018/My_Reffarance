package practicetest;

public class Testing3 {
	
	public boolean m1()
	{
		System.out.println("m1 method is excuting");
		return true;
		
	}
	public static String s1() 
	{
		String s = "commando";
		System.out.println("s1 method is excuting");
		
		return s;
	}public static void main(String[] args) {
		
		Testing3  CALL = new Testing3();
		          boolean merge = CALL.m1();
		          System.out.println(merge);
		            
		          String store = s1() ;
		          System.out.println(store);
		            
		           
	}

}
