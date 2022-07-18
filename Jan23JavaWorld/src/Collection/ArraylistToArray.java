package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistToArray {
	public static void main(String[] args) {
		
		String [] s = {"aaa","bbb","ccc"};
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(s));
		System.out.println(al);
		//conversion of arraylist to array
		
		int length = al.size();
		String [] ar =new String[length];
		al.toArray(ar);
		
		
		for(String ss:ar) 
		{
			System.out.println(ss);
		}
		
		
		
	}
	
	

}
