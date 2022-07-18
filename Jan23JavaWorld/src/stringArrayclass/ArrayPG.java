package stringArrayclass;

public class ArrayPG {
	
	
	public static void main(String[] args) {
		int[] intarray = new int[10];// defination of array
		int [] a = {10, 20, 30};
		for(int i=0; i<3; i++)
		{
		System.out.println(a[i]);
		}
		// initialization of array
		try {
		intarray[0] = 10;
		intarray[1] = 20;
		intarray[2] = 30;
		intarray[3] = 40;
		intarray[4] = 50;
		intarray[5] = 30;
		intarray[6] = 40;
		intarray[7] = 50;
		intarray[8] = 80;
		}
		catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Array Overflow");
		}
		int size = intarray.length;
		System.out.println("the size of array is :"+size);
		for(int i=0; i<size; i++)
		{
		System.out.println(intarray[i]);
		}
	}

}
