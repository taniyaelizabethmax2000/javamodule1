package userdefinedobjects;
import java.util.HashSet;
import java.util.Iterator;

//import oopsday4.inheritance.Employee;
public class TestEmpHashSet {

	public static void main(String[] args) {
		
HashSet<Employee>  empSet=new HashSet<Employee>();//only employee objects will come..can add in linkedlist,dequeue  as like arraylist
 
 Employee emp1 = new Employee("John Doe", "Male", 24, 101, "Research", 40000);
	Employee emp2 = new Employee("Jane Doe", "Female", 25, 102, "Accounting", 35000);
	Employee emp3 = new Employee("Jason Doe", "Male", 28, 103, "sales", 10000);
	Employee emp4 = new Employee("Jonas Doe", "Male", 23, 104, "Research", 40000);
	Employee emp5 = new Employee("John Doe", "Male", 24, 101, "Research", 40000);
	
	
	empSet.add(emp1);
	empSet.add(emp2);
	empSet.add(emp3);
	empSet.add(emp4);
	empSet.add(emp5);
	System.out.println(empSet.size());//hashset removes duplicates.size gives 4 because duplicate things are removes.arraylist has duplicates.
	
	System.out.println(empSet);
	}

}
