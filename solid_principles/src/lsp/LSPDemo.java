package lsp;

public class LSPDemo {

	
	public void calculateArea(Shape s) {
		System.out.println(s.getArea());
	}
	
	public static void main(String[] args) {
		LSPDemo lsp = new LSPDemo();
		//An instance of Rectangle is passed
		
		lsp.calculateArea(new Rectangle(1,4));
		//An instance of square is passed
		lsp.calculateArea(new Square(5));
	}
}
