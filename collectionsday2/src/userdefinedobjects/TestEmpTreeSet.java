package userdefinedobjects;
import java.util.TreeSet;
import java.util.Iterator;

//import oopsday4.inheritance.Employee;
public class TestEmpTreeSet {

	public static void main(String[] args) {
		
TreeSet<Employee>  treeSet=new TreeSet<Employee>();//only employee objects will come..can add in linkedlist,dequeue  as like arraylist
 
 Employee emp1 = new Employee("John Doe", "Male", 24, 101, "Research", 40000);
	Employee emp2 = new Employee("Jane Doe", "Female", 25, 102, "Accounting", 35000);
	Employee emp3 = new Employee("Jason Doe", "Male", 28, 103, "sales", 10000);
	Employee emp4 = new Employee("Jonas Doe", "Male", 23, 104, "Research", 40000);
	Employee emp5 = new Employee("John Doe", "Male", 24, 101, "Research", 40000);
	
	
	treeSet.add(emp1);
	treeSet.add(emp2);
	treeSet.add(emp3);
	treeSet.add(emp4);
	treeSet.add(emp5);
	System.out.println(treeSet.size());//hashset removes duplicates.size gives 4 because duplicate things are removes.arraylist has duplicates.
	
	System.out.println(treeSet);
	}

}
