package Collection;

import java.util.ArrayList;

public class ArrayListImplementation {
	
	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add("abc");
		ar.add(true);
		ar.add('g');
		ar.add(50);
		System.out.println(ar);
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc");
		al.add("def");
		al.add("ghi");
		
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.add(1, "velocity");
		System.out.println(al);
		al.set(0, "cba");// if we want want to edit or rename,replace
		System.out.println(al);
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Pune");
		al2.add("Mumbai");
		al2.add("Delhi");
		al2.add("Bhopal");
		al2.addAll(al);
		
		System.out.println(al2);
		
		boolean ispresent = al2.contains("velocity");
		System.out.println(ispresent);
		
		boolean ispresentall =al2.containsAll(al);
		System.out.println(ispresentall);
		
		boolean isremoveallfromal=al2.removeAll(al);
		System.out.println(isremoveallfromal);
		System.out.println(al2);
		

	}

}
