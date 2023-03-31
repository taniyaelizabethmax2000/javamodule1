package structural.adapter.phoneimp;

import structural.adapter.phoneifaces.MicroUsbPhone;

public class Android implements MicroUsbPhone {
 private boolean connector;
	@Override
	public void recharge() {
		if(connector) {
			System.out.println("Recharge started");
			System.out.println("Recharge finished");
		}
		else {
			System.out.println("Connect MicroUsb first");
		}

	}

	@Override
	public void useMicroUsb() {
		connector=true;
		System.out.println("Microusb connected");

	}

}
