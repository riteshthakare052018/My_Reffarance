package constructor;

public class CollageConstructor {
	
	static String collagename ;
	static String classname   ;
           String studentname;
           int    age;
           int    mathmarks;
           int    physicssmark;
           
public CollageConstructor(String collage_name,String class_name,String student_name,int age_,int math_marks,int physics_smark){
	
	collagename=collage_name;
	classname=class_name;
	studentname=student_name;
	age=age_;
	mathmarks=math_marks;
	physicssmark=physics_smark;
	
	System.out.println("collagename="+collagename);
	System.out.println("classname="+classname);
	System.out.println("studentname="+studentname);
	System.out.println("age="+age);
	System.out.println("mathmarks="+mathmarks);
	System.out.println("physicsmarks="+physicssmark);
	
}
		      
public static void main(String[] args) {
//                 	first student data
	CollageConstructor abc = new CollageConstructor("DBNCOET","A","DANIAL",45,85,95);
	System.out.println();
//	              	second student data
		CollageConstructor abc1 = new CollageConstructor("DBNCOET","A","SAM",26,90,100);
	System.out.println();
//	               third student data
	CollageConstructor abc2 = new CollageConstructor("DBNCOET","A","JOHN",28,88,63);
	
	
	
	
}
}
