package another;

import oopsday5.AppConstants;//appconstants is imported.

public class TestAppConstants {

	public static void main(String[]  args ) {
		double salary = 40000;
		double tax = salary * AppConstants.TAX_RATE;
		double surcharge=salary * AppConstants.SUR_CHARGE;
	}
}
