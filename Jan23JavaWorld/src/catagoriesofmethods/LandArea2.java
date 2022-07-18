package catagoriesofmethods;

public class LandArea2 {
	
	public int total_area (int l1, int l2, int l3, int b1, int b2, int b3 ) {
		
		int Area1 = l1*b1;// 6
		int Area2 = l2*b2;// 10
		int Area3 = l3*b3;// 12
		int total_area = Area1+Area2+Area3;
		return total_area;
		
	}public static void main(String[] args) {
		LandArea2 abc = new LandArea2();
		            System.out.println("Total Area of land="+abc.total_area(1,2,3,6,5,4));   
		
	}

}
