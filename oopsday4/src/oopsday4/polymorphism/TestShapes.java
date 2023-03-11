package oopsday4.polymorphism;

class A{}
class B extends A{}
public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//B b = new A();narrowing
		double d=10;
		 A a =new B();
		 
	Shape s = new Rectangle(10.25,65.75); //shape 
	double result = s.area();
	System.out.println(result);
	
	s = new Circle(35);
	result = s.area();
	System.out.println(result);
	
	s = new Square(55);
	result = s.area();
	System.out.println(result);
	}
	

}
