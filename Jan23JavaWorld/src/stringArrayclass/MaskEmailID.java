package stringArrayclass;

public class MaskEmailID {
	
	public static void main(String[] args) {
		
		String s = "riteshthakare052018@gamil.com";
//		output = ri*******k*******18@*****.com
		
		
		String r1 = s.substring(0,9);
		System.out.println(r1);
		
		String r2 = s.substring(9,17);
		System.out.println(r2);
		
		String r3 = s.substring(17, 29);
		System.out.println(r3);
		
		System.out.println("************************");
		
		String r4 = r1.replace("teshtha", "*******");
		System.out.println(r4);
		
		String r5 = r2.replace("are0520", "*******");
		System.out.println(r5);
		
		String r6 = r3.replace("gamil", "*****");
		System.out.println(r6);
		
		System.out.println("*********************************");
		
//		System.out.println(r4+r5+r6);
		
		String cnct = r4.concat(r5);
		String cnct1 = cnct.concat(r6);
		System.out.println(cnct1);
		
		
		
//		using for each reverse
		
		String i = "i am a indian";
		
		char[] c = i.toCharArray();
		System.out.println(c);
		System.out.println(c.length);
		
//		for(char con:c)

	for(int j=c.length-1; j>=0; j--)
		{
			System.out.print(c[j]);
				
		}
		System.out.println();
		System.out.println("**********************************************************");
		
//		for using charAt
		

		
		
		
	}	
	}


