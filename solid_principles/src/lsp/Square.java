package lsp;

public class Square implements Shape {
private int side;



	public Square(int side) {
	super();
	this.side = side;
}



	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return this.side*this.side;
	}

}
