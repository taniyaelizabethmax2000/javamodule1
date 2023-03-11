package testlamdas;
@FunctionalInterface
interface Shape {//interface which has only 1 method is called functional interface.

	double area();// lambda function holds some code and whenever area is called the lambda is
					// invoked.
	
	//not allowed double perimeter();
}

interface Math{//instead of implementing a class we  implement it in lamda for interface.without creating a class we can implement a interface using lamda
	double power(int b,int e);
}
interface Factorial{
	double fact(int num);
}
public class Example1 {

	public static void main(String[] args) {
       int a=10;
       
		Runnable r1=new Runnable() { //anonymous class is not used nowadays we can use lamda method
			public void run() {
				System.out.println("from run method");//runnable is for thread implementation
			}
		};
		Thread t1=new Thread(r1);
		t1.start();
		Runnable r = ()->{
			for(int i=1;i<5;i++) {
				System.out.println("in run method" + i);
			}
		};
		Thread t =new Thread(r);
		t.start();
		Math m = (int  b,int e)-> {
			int p=1;
			for(int i=1;i<=e;i++) {
				p*=b;//2 raise to 3 .2*2*2
			}
			return p;
		};
		
		
		Factorial f=(int num) ->{
			int fact=1;
			while(num!=0) {
				fact=fact*num;
					num--;
			}
			return fact;
		};
		double fac=f.fact(5);
		System.out.println(fac);
		
		
		Shape s = () -> { // ()-> lambda function represents a piece of code.reference of interface lamdas
							// is a placeholder
			return 0.0;
		};
		
		
		double result = s.area();
		System.out.println(result);
		
			
		double p =m.power(2, 3);
		System.out.println(p);
	}

}
