package typeofvariable;

public class LocalIfElseCondition {
	

	public static void main(String[] args) {
              int A = 26;
              
              int B = 30;
         
              
              if(A<B){
            	  String s  = "Velocity";
            	  System.out.println("condition true");
            	  System.out.println(s);
            	  System.out.println(A);
//            	  int c = 35;
//            	   System.out.println(c);   // it will accesss here
              }
            
              else {System.out.println("condition false");
                
              }
              
     //         System.out.println(c);   it can not access throught the if else because scope of the  local verible inside the two curly braces
              
              
              
              
              
              int c = 52;
              int d  = 65;
              
              if(c>d) {
            	  System.out.println("condition true");
              }
              else {System.out.println("condition false");
              
              
              
	}
}
}
              
              
	
