package structural.adapter.phoneimp;

import structural.adapter.phoneifaces.LightningPhone;

public class Iphone implements LightningPhone {
public boolean connector;
	@Override
	public void recharge() {
		if(connector) {
			System.out.println("Recharge started");
			System.out.println("Recharge finished");
		}
		else {
			System.out.println("Connect Lightning first");
		}

	}

	@Override
	public void useLightning() {
		connector=true;
		System.out.println("Lightning connected");

	}

}
