package stringArrayclass;

public class RegularExpression {
	
	public static void main(String[] args){
		
	String s = "bea123ti@#$ful";
	        String a1  = s.replaceAll("[^a-z]", "");
	        System.out.println(a1);
	        
	        String a2  = s.replaceAll("[^1-3]", "!");
	        System.out.println(a2);
	
}

}
