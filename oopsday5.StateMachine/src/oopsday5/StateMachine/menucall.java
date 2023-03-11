package oopsday5.StateMachine;

public class menucall {

	BaseAtm b = new BaseAtm();
	int amount100new;
	int val1 = 0;
	int val2=0;

	public int deno100(int amount, int d100) {
		if (d100 < b.getD100()) {
			int n = b.getD100();
			int val1 = d100 * 100;
			b.setD100(n - d100);

			if (amount == val1) {

				return amount;
			} else {
				return (amount - val1);
			}
		}
		return amount;
	}

	public int deno50(int amount, int d50) {
		
		if (d50 < b.getD50()) {
			int n1 = b.getD50();
			int val2 = d50 * 50;
			b.setD50(n1 - d50);

			if (amount == val2) {

				return amount;
			} else {
				return (amount - val2);
			}
		}
		return amount;
	

	}

	public int deno10(int amount, int d10) {
		
		if (d10 < b.getD10()) {
			int n1 = b.getD10();
			int val2 = d10 * 10;
			b.setD50(n1 - d10);

			if (amount == val2) {

				return amount;
			} else {
				return (amount - val2);
			}
		}
		return amount;
	}
	
}