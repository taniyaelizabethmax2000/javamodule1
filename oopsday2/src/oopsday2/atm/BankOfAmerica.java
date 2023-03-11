package oopsday2.atm;

public class BankOfAmerica implements BankingIface {

	
	private Account account = new Account(1010,"John Doe","salary",500);
	@Override
	public double withdraw(double amount) {
		
     account.setBalance(account.getBalance() - amount);
     return account.getBalance();
		// TODO Auto-generated method stub
		
	}

	@Override
	public double deposit(double amount) {
		account.setBalance(account.getBalance() + amount);
		// TODO Auto-generated method stub
		return account.getBalance();
	}

	@Override
	public double balanceEnquiry(int actno) {
		// TODO Auto-generated method stub
		return account.getBalance();
	}

}
