package praAccModiVeriable;

public class FinalKey {
	
	  final static int i = 424;

	  
	  public void house () {
		  
		  System.out.println("house from final key");
		
		   
	  }	
	  public void tata() {
		  
		  System.out.println("tata from finalkey");
		  System.out.println(i);
		  
//		  i = 425;// here we get an error that means variable i cannot be redefine as it is final in nature.
			

		
	}
	 public static void main(String[] args) {
		 
		FinalKey ml = new FinalKey();
		         ml.tata();
	}
	  
	
	  }

