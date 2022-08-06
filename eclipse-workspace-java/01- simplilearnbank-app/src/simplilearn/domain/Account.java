package simplilearn.domain;

public class Account {
	
	//declare an instance variable with default access.
	private double balance;
	
	public void deposit(double amt) {
		if (amt > 0.0) 
		{
			balance = balance + amt;
		}
	}
	
	public void withdraw(double amt)
	{
		if (amt<= balance) {
			balance = balance -amt;
		}	
	}
	
	public Account(double initBal){
		if(initBal > 0)
		{
			balance = initBal;
		}
		else
		{
			System.err.println("Invalid balance");
		}
	}
	
	public double get_balance()
	{
		return balance;
	}

}
