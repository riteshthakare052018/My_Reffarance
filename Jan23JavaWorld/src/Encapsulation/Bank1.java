package Encapsulation;

public class Bank1 {
	
	private int income = 25000;
	
	public void getbalance(int pin) 
	{
	if (pin==1245) 
	{
		System.out.println("your acc.balance is:"+income);
	}else 
	{
		System.out.println("you have not sufficiant balance");
	}
    }
	
	
	public void withdrawamt (int amount) 
	{
		setBalance(amount);
		
	}public void setBalance(int amount) 
	{
		if(amount<=income) 
		{
			income=income -amount;
			System.out.println("amount deducted from account:"+amount+" your current balance is :"+income);
		}
	}

}
