package Polymorphism;

public class OverridingC extends OverridingP {
	
    public void tata() {
		
		System.out.println("tata method from overrindingC");
		

	}
     public void house() {
 		
 		System.out.println("house method from overrindingC");
 		
         
 	}
     public void D1() {
  		
  		System.out.println("D1 method from overrindingC");
  		
          
  	}
     public void D1(int i) {
   		
   		System.out.println("D1 method from overrindingC");
   		
     }
     public static void same()
     {
		System.out.println("this is static methodc");
	}
     
     
     public static void main(String[] args) {
    	 
   
    	
    	             
    	             OverridingC T = new OverridingC();
//    	                          T.f1();// (THIS IS PARENT CLASS) THIS METHOD IS NOT OVERRIDING HENCE IT CAN ACCESS WITH OBJECT OF PARENT CLASS AND ALSO OBJECT OF CHILD CLASS
//    	                          T.f2();//   THIS METHOD IS NOT OVERRIDING HENCE IT CAN ACCESS WITH OBJECT OF PARENT CLASS AND ALSO OBJECT OF CHILD CLASS
//    	                          T.D1();//   THIS METHOD IS IN CHILD CLASS HENCE IT CAN NOT ACCESS WITH OBJECT OF PARENT CLASS
//    	                          T.D1(50);//  
//    	                          T.tata();// THIS IS  OVERRIDING METHOD IT CAN ONLY ACCESS CHILD CLASS BECAUSE WE HAVE CREATED OBJECT OF CHILD CLASS
//    	                          T.house();
    	                          T.same();
//    	                          
    	  /*            OverridingP H =   new OverridingP();
    	                          H.f1();
    	                          H.f2();
    	                          H.house();// ACCESS ONLY PARENT CLASS METHOD BECAUSE WE HAVE CREATED OBJECT OF PARENT CLASS
                                 H.tata();//   ACCESS ONLY PARENT CLASS METHOD BECAUSE WE HAVE CREATED OBJECT OF PARENT CLASS
    	*/       
    	 
    	 
         
                    OverridingP on = new OverridingC();
                                on.house();  // this method are overrriden method which can call on the basis of object AND PRINT THE VALUE IN THE CHILD CLASS 
                                on.tata();    // same here
                                on.f1();    //     this is not overriden method It CAN ACCESS ONLY WITH BASIS OF REFERANCE VERIABLE AND THE VERIABLE IS CREATED OF PARENT CLASS
//                                on.D1(20);  //(CHILD CLASS)THIS IS NOT THE OVERRIDEN METHOD It CAN ACCESS ONLY WITH BASIS OF VERIABLE AND THE VERIABLE IS CREATED OF PARENT CLASS
             
	}

}
