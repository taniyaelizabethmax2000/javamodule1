package oopsday3.atm.menu;

import oopsday3.atm.exceptions.InsufficientFundsException;
import oopsday3.atm.exceptions.NegativeAmountException;

public interface BankingIface2 {

	
 public double withdraw(double amount,int accno) throws InsufficientFundsException;
 public double deposit(double amount,int acctno) throws NegativeAmountException;
 public double balanceEnquiry(int actno);
}
