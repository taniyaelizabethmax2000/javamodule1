package oopsday3_math;

public class MathImp implements MathIface {
	
	private int num;

	public MathImp() {
		// TODO Auto-generated constructor stub
	}
	public MathImp(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public void factorial(int n) {
		   int fact = 1;
		   for(int i=num;i>0;i--) {
			  fact = fact*i;
		   }
		// TODO Auto-generated method stub
		   System.out.println(fact);
	}

	@Override
	public void primeOrNot(int n) {
		for(int i=2;i<num;i++) {
		// TODO Auto-generated method stub

	}
System.out.println();
	}
}