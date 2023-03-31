package factorymethod;

public class UseVehicleFactory {
	public static void main(String[] args) {
		
	

	vehicle creta = VehicleFactory.newInstance("Creta");
	creta.start();
	vehicle seltos = VehicleFactory.newInstance("Seltos");
	seltos.honk();
	vehicle XCross = VehicleFactory.newInstance("XCross");
	XCross.move();
		
}
}