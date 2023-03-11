package testlamdas;

@FunctionalInterface
public interface TestInterface {

	public double method();
	public default void method2() { //in java8,for interface, only default method and static methods applicable and  not applicable to class
		System.out.println("from method2");
	}
	public static  void method3() {
		System.out.println("from static method");
	}
}
