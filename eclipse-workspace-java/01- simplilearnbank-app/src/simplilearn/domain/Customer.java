package simplilearn.domain;

public class Customer {

	private String firstname;
	private String lastname;
	private Account account;// Customer has an account
	
	
	//Declare public constructor that take 2 params
	public Customer(String f, String l) {
		firstname =f ;
		lastname = l;
	}
	
	//2 public accessor for object variables
	public String getFirstName()
	{
		return firstname;
	}
	
	public String getLastName()
	{
		return lastname;
	}
	
	public Account getAccount() 
	{
		return account;
	}
	
	public void setAccount( Account acct){
		account = acct;
		return;
	}
	
}
