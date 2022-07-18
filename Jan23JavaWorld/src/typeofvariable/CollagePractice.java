package typeofvariable;

public class CollagePractice {
	
	static String collagename = "COEP";
	static String classname   = "A";
           String studentname;
           int    age;
           int    mathmarks;
           int    physicssmark;
           
 public static void main(String[] args) {
	 CollagePractice R = new  CollagePractice();
//  	first student data
	 
	 R.studentname = "Daniel";
	 R. age         = 26;
	 R.mathmarks = 50;
	 R.physicssmark = 60;
	 
	 System.out.println( "collage Name="+collagename);
	 System.out.println("class Name="+classname );
	 System.out.println( "Name="+R.studentname);
	 System.out.println("AGE="+R.age);
	 System.out.println(  "Marks="+R.mathmarks);
	 System.out.println(  "Marks="+R.physicssmark);
	 System.out.println("********************************************");
	 
//  	second student data
	 CollagePractice R1 = new  CollagePractice();
	
	 System.out.println( "collage Name="+collagename);
	 System.out.println("Class name="+classname );
	 
	 
	 R1.studentname = "JOHN";
	 R1.mathmarks = 50;
	 R1.physicssmark = 60;
	 R1.age = 25;
	 
	 System.out.println( "Name="+R1.studentname);
	 System.out.println("AGE="+R1.age);
	 System.out.println(  "Marks="+R1.mathmarks);
	 System.out.println(  "Maks="+R1.physicssmark);
	 System.out.println("********************************************");
	 
//  	third student data
	 CollagePractice R2 = new  CollagePractice();
	 
	 System.out.println( collagename);
	 System.out.println(classname );

	 
	 
	 R2.studentname = "CARTER";
	 R2.mathmarks = 25;
	 R2.physicssmark = 65;
	
	 
	 
		System.out.println("age:"+R2.age);
	 System.out.println(  "Name "+R2.studentname);
	 System.out.println(  R2.mathmarks);
	 System.out.println(  R2.physicssmark);
	 
	 
	/*
	 collage Name=COEP                                 

	 class Name=A
			 Name=Daniel
			 AGE=26
			 Marks=50
			 Marks=60
			 ********************************************
			 collage Name=COEP
			 Class name=A
			 Name=JOHN
			 AGE=25
			 Marks=50
			 Maks=60
			 ********************************************
			 COEP
			 A
			 age:0       WE HAVE DECLEARE THIS VALUE BUT NOT THE INITIALIZE THE VALUE IN MAIN METHOD  It only share its memory with its object.
                            It should prefer when we have change the value w.r.t object.

			 Name CARTER
			 25
			 65 */

	 
	 
	  
	 
	 
	
}          
}
