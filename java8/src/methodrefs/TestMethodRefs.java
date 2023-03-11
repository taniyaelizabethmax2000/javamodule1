package methodrefs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

interface Formula{
	public void m1();//m1 needs implements as this is a interface
}
class Some{
	public static void m2() { //m2 need object to work as it is a class 
		System.out.println("from m2....");
	}
}
class Other{
	Other(){
		System.out.println("from other constructor");
	}
	 void m2(String str) {
		System.out.println("from m2..." +str);
	}
}
public class TestMethodRefs {

	public static void main(String[] args) {
		
		Formula f = Some::m2;//:: is method references in java 8 .3 uses for ::1.constructor 2.static method 3.instance method
		f.m1();//when we call m1, m2 is called internally 
		//static one

		f=Other::new;//reference of constructor to interface //take other constructor reference to interface
		//new is constructor reference
		 
		List<String> list=Arrays.asList("one","two","three");//instance method reference
		list.stream().forEach(System.out::println);//this is instance method reference
		List<Integer> intList=Arrays.asList(12,32,1323,11);
		Optional<Integer> num=intList.stream().reduce(Math::max);//math is static method reference
		System.out.println(num.get());
	}

}
