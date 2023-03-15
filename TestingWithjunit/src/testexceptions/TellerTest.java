package testexceptions;

import static org.junit.Assert.*;

import org.junit.Test;

public class TellerTest {

	Teller  teller =new Teller();
	
	@Test(expected=IllegalArgumentException.class)
	public void testValidateUnAcceptedCurrency() {
      teller.validateTransaction("AUSD", 100);
	}
	@Test(expected=InvalidTransactionAmountException.class)
public void testValidateNegativeAmount() {
	Teller.validateTransaction("EUR", -100);
}
}
