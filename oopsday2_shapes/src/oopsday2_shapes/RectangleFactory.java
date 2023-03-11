package oopsday2_shapes;

public class RectangleFactory {

	public static void main(String[] args) {
		
		ShapesIface shape = new Rectangle(10,5);
		shape.area();
	}
}
