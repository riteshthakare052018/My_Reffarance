package catagoriesofmethods;

public class SquareJava {
	public int square (int l, int b) {
	int area = l*b;
	return area;
	
	
	}public int rectangle (int l, int b) {
		int multiply = l*b;
		return multiply;
		
	}
public static void main(String[] args) {
	
//	              SQUARE

	SquareJava abc = new SquareJava();
                  int areaofsquare1 =abc.square(5,6);
                  int areaofsquare2 =abc.square(5,7);
                  
                  System.out.println("area1="+areaofsquare1);
                  System.out.println("area2="+areaofsquare2);
                 int TotalArea =areaofsquare1+areaofsquare2;
                  
                  System.out.println("TA="+TotalArea);
                  
            
//                  IN ANOTHER WAY OF EXECUTION
//                  System.out.println(abc.square(5,6)+abc.square(5,7));
//                  System.out.println(abc.square(8,6));
//                  System.out.println(abc.square(9,7));
//                 int TotalArea1 = (abc.square(8,6))+(abc.square(9,7));
//                 
//                 
//                 System.out.println("TA1="+TotalArea1);
                  
                  
//                                   RECTANGLE 
                        int Total_Area =abc.rectangle(9,6);
                        System.out.println("T="+Total_Area);
                  
}
	
}


