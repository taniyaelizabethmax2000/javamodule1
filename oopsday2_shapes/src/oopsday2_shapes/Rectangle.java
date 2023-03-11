package oopsday2_shapes;

public class Rectangle implements ShapesIface {
 
	private double length;
	private double breadth;
	
	
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public void area() {
		System.out.println(length*breadth);
		// TODO Auto-generated method stub

	}

}
