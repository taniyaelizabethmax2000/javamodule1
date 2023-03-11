package oopsday3.atm.exceptions;

public class NegativeAmountException extends Exception {

	
	public NegativeAmountException() {
		// TODO Auto-generated constructor stub
	}
	
	public NegativeAmountException(String msg) {
		super(msg);
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}
