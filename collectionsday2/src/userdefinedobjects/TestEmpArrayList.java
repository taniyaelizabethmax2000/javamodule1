package userdefinedobjects;
import java.util.ArrayList;
import java.util.Iterator;

//import oopsday4.inheritance.Employee;
public class TestEmpArrayList {

	public static void main(String[] args) {
		
 ArrayList<Employee>  empList=new ArrayList<Employee>();//only employee objects will come..can add in linkedlist,dequeue  as like arraylist
 
 Employee emp1 = new Employee("John Doe", "Male", 24, 101, "Research", 40000);
	Employee emp2 = new Employee("Jane Doe", "Female", 25, 102, "Accounting", 35000);
	Employee emp3 = new Employee("Jason Doe", "Male", 28, 103, "sales", 10000);
	Employee emp4 = new Employee("Jonas Doe", "Male", 23, 104, "Research", 40000);
	Employee emp5 = new Employee("John Doe", "Male", 24, 101, "Research", 40000);
	
	
	empList.add(emp1);
	empList.add(emp2);
	empList.add(emp3);
	empList.add(emp4);
	empList.add(emp5);
	
	
	System.out.println(empList);
	}

}
