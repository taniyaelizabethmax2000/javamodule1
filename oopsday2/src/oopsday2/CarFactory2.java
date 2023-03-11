package oopsday2;

public class CarFactory2 {
	
	public static void main(String[] args) {
		
		//CarIface car = new CarIface(); //cannot make object for interface
        
	//	CarIface car;  //not referring to any object
	CarIface car = new Car(5000,500,0,false); //interface comes on right side.
	System.out.println(car);
	car.start();
	car.honk();
	car.move();
	car.stop();
	System.out.println(car);
	
	
}
}