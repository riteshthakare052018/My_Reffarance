package catagoriesofmethods;

public class FarmerLandArea {
	
	public int areaofland (int length, int breadth) {
		
		int square = length*breadth;
		return square;
		
	
	}public static void main(String[] args) {
		FarmerLandArea abc = new FarmerLandArea();
                 int Areaofland1 = abc.areaofland(2,2);		
                 int Areaofland2 = abc.areaofland(3,4);
                 int Areaofland3 = abc.areaofland(3,5);	
                 
//                 seperate area calculation
                 
//               System.out.println("area1="+Areaofland1);
//               System.out.println("area2="+Areaofland2);
//               System.out.println("area3="+Areaofland3);
               
               int totalArea = Areaofland1+Areaofland2+Areaofland3;
               
               System.out.println("total Areaof land="+totalArea);
               
	}
}
	

		

		
		
	
