package Encapsulation;

public class AtmMachine  {
	
	public static void m3() {
		
		 BankServerDatabase money = new BankServerDatabase ();
	                        money.withdrawlAMOU(9000);
	}
	
	public static void main(String[] args) {
		
	BankServer Money = new BankServer();//                   1
	           Money.getbalance(1234);
	           
//             withdrawl money
	           
	          Money.withdrawl(6000);
	           
//	           check balance with another bank server
	           
   BankServerDatabase money = new BankServerDatabase ();  //  2
                      money.balanceEnquiry(8450);
                      

//                      withdrawl money
                      
                      AtmMachine.m3();    //  object is created in static method and call in main method
     	
	}

}
