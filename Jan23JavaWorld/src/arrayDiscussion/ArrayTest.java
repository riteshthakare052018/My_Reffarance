package arrayDiscussion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		
		int[] intarray = new int[10];
		
		intarray[1]=25;
		intarray[2]=11;
		intarray[3]=23;
		intarray[4]=10;
		intarray[5]=14;
		intarray[6]=15;
		
	int a = intarray.length;
	System.out.println(a);
		
		for(int i=1; i<=6; i++)
		{
			
	     System.out.println(intarray[i]);	
			
		}

		
		System.out.println("*****************************************************************");
		
		int A[] = {10,20,30};
		int A1 = A.length;
		
		
		for(int j=0; j<A1; j++)// j<3 J<=2
		{
		    System.out.println(A[j]);	
		}
		
		System.out.println("********************************************");
		
		for(int d1:intarray)//for(int i=1; i<=6; i++)
		{
			
	     System.out.println(d1);	
			
		}
		
}

}
