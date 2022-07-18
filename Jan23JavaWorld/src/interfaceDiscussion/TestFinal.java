package interfaceDiscussion;

public class TestFinal implements Test1,Test2 {
	
  


public void R3() {

	System.out.println("implementation of interface class test2");
}


public void R1() {

	System.out.println("implementation of interface class test1");
}


public void R2() {

	System.out.println("implementation of interface class test1 and test2");
}

public void Test2() {
	
	System.out.println("calling constructor ");
}

public static void main(String[] args) {
	   
	   TestFinal view = new   TestFinal ();
	             view.R1();
	             view.R2();
	             view.R3();
	             view.Test2();
	




	
}

}
