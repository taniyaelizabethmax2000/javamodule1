package oopsday4.statictest; 

public class TestStaticDemo {
   
	public static void main(String[]  args) {
		
	/*	StaticDemo d = new StaticDemo();
	*	StaticDemo d1 = new StaticDemo();
	*	d.a = 20;
	*	System.out.println(d1.a); //20
	*	d1.a++;
	*	System.out.println(d.a); //21
		
		*/
		System.out.println(StaticDemo.a);//0 //static means shared.static variable is shared and can be access with object and also by its class name 
		StaticDemo d = new StaticDemo();
		System.out.println(d.a);//1
		StaticDemo d1 = new StaticDemo();
		System.out.println(d1.a);//2
		StaticDemo d2 = new StaticDemo();
		System.out.println(d2.a);//3
		System.out.println(StaticDemo.a);//3
		
	
	
	}
}
