package Encapsulation;

public class BankServerDatabase {
	
	        private int customerbalance = 20000;
	        
	        
public void balanceEnquiry(int pin) {
	
	if (pin == 8450) {
		
		System.out.println("your acco.balance is :"+customerbalance);
		
	}else {
		System.out.println("please check your pin and try again");
	}
	
}

public void withdrawlAMOU(int wthwlamount) 
{
	
	setamount(wthwlamount);
	
}
public void setamount(int wthwlamount) {
	
	if (wthwlamount<=customerbalance) {
		
		customerbalance = customerbalance-wthwlamount;
		
		System.out.println("withdrwal:"+wthwlamount+"rupees and your balance is "+customerbalance);
		        
	}else {
		
		System.out.println("you have  insufficiant balance");
		
		
		
		
	}
	
	
}public static void main(String[] args) {
	
}
}
