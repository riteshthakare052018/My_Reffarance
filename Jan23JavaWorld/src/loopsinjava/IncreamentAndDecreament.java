package loopsinjava;

public class IncreamentAndDecreament {
	
	public static void main(String[] args) {
		
	int k = 10;
	
	
//	pre-increament
	int j = ++k;
	
	System.out.println("j1:"+j);//11
	System.out.println("k:"+k);//11
	
//	post increament
	
     j = k++;
    System.out.println("j2:"+j);//11
    System.out.println("k:"+k);//12
    
//    pre decreament
    
    j = k--;
    System.out.println("j3:"+j);//12
    System.out.println("k:"+k);//11
    
//    post decreament
    
      j = --k;
      System.out.println("j4:"+j);//10
      System.out.println("k:"+k);//10
	
	
	}

}
