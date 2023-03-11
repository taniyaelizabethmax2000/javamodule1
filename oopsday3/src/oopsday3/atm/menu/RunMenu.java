package oopsday3.atm.menu;

import oopsday3.atm.exceptions.NegativeAmountException;

public class RunMenu {

	public static void main(String[] args) throws NegativeAmountException {
		// TODO Auto-generated method stub
		
		//int i=10/0;
		//throw new ArithmeticException("divide by 0");
		BankMenu bank = new BankMenu();
		bank.menu();

	}

}
