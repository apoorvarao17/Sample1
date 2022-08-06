package simplilearn.test;
import simplilearn.domain.Account;
import simplilearn.domain.Customer;

public class TestBanking {

	public static void main(String[] args) {
		
		Customer theCustomer = new Customer( "James", "Smith");
		System.out.println("Creating account James smith with balance 500");
		
		Account acc = new Account(500);
		
		theCustomer.setAccount(acc);
		
		System.out.println("withdraw 150 $");
		
		acc.withdraw(150);
		
		System.out.println("deposit 200$");
		
		acc.deposit(130);
		
		System.out.println("Customer["+ theCustomer.getFirstName()+"."+ theCustomer.getLastName()+ "] Balance ="+ theCustomer.getAccount().get_balance());

	}

}
