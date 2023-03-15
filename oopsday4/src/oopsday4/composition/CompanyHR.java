package oopsday4.composition;

public class CompanyHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Address resAdd=new Address("31","Mannath","Worli","Mumbai",40048);
      Address commAdd=new Address("32","Antela","Bandra","Mumbai",40032);
		Employee emp1 = new Employee("John Doe", "Male", 24, 101, "Research", 40000,resAdd,commAdd);
		System.out.println(emp1);
		Employee emp2 = new Employee("Jane Doe", "Female", 25, 102, "Accounting", 35000,resAdd,commAdd);
		System.out.println(emp2);
		Employee emp3 = new Employee("Jason Doe", "Male", 28, 103, "sales", 10000,resAdd,commAdd);
		System.out.println(emp3);
		Employee emp4 = new Employee("Jonas Doe", "Male", 23, 104, "Research", 40000,resAdd,commAdd);
		System.out.println(emp4);
		Employee emp5 = new Employee("John Doe", "Male", 24, 101, "Research", 40000,resAdd,commAdd);
		System.out.println(emp5);

	

	if(emp1.equals(emp5) ) {  //emp1 is invoking and emp5 is invoked emp1 uses this
		System.out.println("the objects are equal");
	}
	else
		System.out.println("the objects are not equal");
}
}
