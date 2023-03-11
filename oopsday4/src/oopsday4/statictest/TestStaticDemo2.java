package oopsday4.statictest;

public class TestStaticDemo2 {

	public static void main(String[] args) {
		StaticDemo2 d1 = new  StaticDemo2();
		d1.method();  //instance methods can access only through object
		StaticDemo2.method(); //static methods can access by class and object
		
	
	}
}
