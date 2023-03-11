package oopsday4.polymorphism;

public class Circle extends Shape {

	private double radius;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double area() {
		return Math.PI*radius*radius;
	}
}
