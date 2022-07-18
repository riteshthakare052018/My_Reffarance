package Encapsulation;

public class BankServer {
	
	private int cust1balance = 50000;
	
//	if we have know about balance enquiry
	
public void getbalance(int pin) {
	
	if (pin== 1234) {
		
		System.out.println("your account balance is "+cust1balance );
		
			
	}
	else {
		
		System.out.println("please check your pin no.and try again");
	}
		
	
}

//      if we have withdrawl money from bank acc.

public void withdrawl(int amount)
{
	setBalance (amount);
}

public void setBalance(int amount) {
	
	if(amount<= cust1balance) {
		cust1balance = cust1balance-amount;
		
		System.out.println("amount:"+amount+" withdrawl and your balance is "+cust1balance);
		
	}

	
}

	
}




