package loopsinjava;

public class ForLoop {
	
	/*public static void main(String[] args) {
		
		int i = 10;
		
		for(System.out.println("FIRST OUTPUT");i<20; System.out.println("second output"))
		{
		
		System.out.println(i);
		i++;
		
	}

}*/
	
	public static void main(String[] args) {
		
		for(int  i=1; i<=10; i++) {
			
			if(i==5 || i==6) {
				
				System.out.println("brocken");
				continue;
				
			}

			
				System.out.println(i);
		
			
		}
		
	
	}
}
