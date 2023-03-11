package serialization.test;
import java.io.Serializable;


public class Employee implements Serializable{

	
	private int empno;
	private String name;
	private static double salary;//static is non serializable that is why it gives output 0.
	transient private String password;//not serializable not sending to file becoz of transient
	
	public Employee() {
		
	}

	

	public Employee(int empno, String name, double salary, String password) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.password = password;
	}



	public int getEmpno() {
		return empno;
	}



	public void setEmpno(int empno) {
		this.empno = empno;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + ", password=" + password + "]";
	}



	



	
	
	
	
	
}
