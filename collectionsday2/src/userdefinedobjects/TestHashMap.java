package userdefinedobjects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.HashMap;
public class TestHashMap {

	public static void main(String[] args) {
		
		
		
		Employee emp1 = new Employee("John Doe", "Male", 24, 101, "Research", 40000);
		Employee emp2 = new Employee("Jane Doe", "Female", 25, 102, "Accounting", 35000);
		Employee emp3 = new Employee("Jason Doe", "Male", 28, 103, "sales", 10000);
		Employee emp4 = new Employee("Jonas Doe", "Male", 23, 104, "Research", 40000);
		Employee emp5 = new Employee("John Doe", "Male", 24, 101, "Research", 40000);
		
		
		ArrayList<Employee>  empList=new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

		
		HashSet<Employee>  empSet=new HashSet<Employee>();
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		
		TreeSet<Employee>  treeSet=new TreeSet<Employee>();
		treeSet.add(emp1);
		treeSet.add(emp2);
		treeSet.add(emp3);
		treeSet.add(emp4);
		treeSet.add(emp5);
		 
		HashMap<String,Collection> dataMap = new HashMap<>();
		dataMap.put("empList",empList);
		dataMap.put("empSet", empSet);//we can use emp or deptset
		dataMap.put("empTreeSet", treeSet);
		
		System.out.println(dataMap);
		
		Collection<Employee>list =dataMap.get("empList");
		Iterator<Employee> iter =list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		Collection<Employee>set=dataMap.get("empset");
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		Collection<Employee>tree=dataMap.get("empTreeSet");
		iter=tree.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
