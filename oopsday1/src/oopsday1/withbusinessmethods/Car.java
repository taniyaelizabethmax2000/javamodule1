package oopsday1.withbusinessmethods;

public class Car {

	//properties data members instance variables
	private String color;
	private double price;
	private String brand;
	private String model;
	
	public Car(String color, double price, String brand, String model) {
		
		this.color = color;
		this.price = price;
		this.brand = brand;
		this.model = model;
	}
	@Override
	public String toString() {
		return "I am a "+ brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public void start() {
		System.out.println("car is starting....");
	}
	public void changeGear(int gear) {
		System.out.println("car is in " + gear);
	}
	public void stop() {
		System.out.println("car is stopping...");
	}
}
