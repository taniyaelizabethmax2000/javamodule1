package oopsday4.inheritance;

public class A {
  private int x;
  private int y;
  
  public A() {
	// TODO Auto-generated constructor stub
	  System.out.println("from A()");
}
  public A(int a ,int b) {
	  System.out.println("not default constructor");
  }

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}
  
 }
