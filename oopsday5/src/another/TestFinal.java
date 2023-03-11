package another;

public class TestFinal {

	
	int a =b;//forward reference trying to access  b by a which is not defined.b is forward referenced.
	static int b=10;
	/**
	 * 
	 */
	static final private double pie = 3.14;//final means compile time constant.
	
	public static void main(String[] args) {
	}
	}

