package source;

public class NonSubClass {

	public NonSubClass() {
		Parent p = new Parent();	
	
		System.out.println(p.b);
       System.out.println(p.c);
       System.out.println(p.d);//subclass can be access by object or by parent
       //nonsubclass can be access by only object of parent class.
       
	}
}
