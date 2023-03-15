package oopsday4.composition;

import java.util.Objects;

public class Employee extends Person {
//is-a(employee is a person) class connection with parent
	
	private long empId;
	private String deptno;
	private double salary;
	private Address residenceAddress;//employee has-a address,has means composition eg:car has a steering and car is avehicle
	private Address correspondenceAddress;//(userdefined class as data member),has a-relationship
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	

	public Employee(String name,String gender,int age,long empId, String deptno, double salary, Address residenceAddress, Address correspondenceAddress) {
		super(name,gender,age);
		this.empId = empId;
		this.deptno = deptno;
		this.salary = salary;
		this.residenceAddress = residenceAddress;
		this.correspondenceAddress = correspondenceAddress;
	}



	public Address getResidenceAddress() {
		return residenceAddress;
	}



	public void setResidenceAddress(Address residenceAddress) {
		this.residenceAddress = residenceAddress;
	}



	public Address getCorrespondenceAddress() {
		return correspondenceAddress;
	}



	public void setCorrespondenceAddress(Address correspondenceAddress) {
		this.correspondenceAddress = correspondenceAddress;
	}



	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String name, String gender, int age, long empId, String deptno, double salary) {
		super(name, gender, age);
		this.empId = empId;
		this.deptno = deptno;
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	
	

	@Override
	public int hashCode() {
		return Objects.hash(deptno, empId, salary);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", deptno=" + deptno + ", salary=" + salary + ", residenceAddress="
				+ residenceAddress + ", correspondenceAddress=" + correspondenceAddress + "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(deptno, other.deptno) && empId == other.empId
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	
/*	public boolean equals(Object obj) {
		Employee ref = null;
		if(obj != null)
			ref =(Employee) obj;
		
		if(this.empId == ref.getEmpId() && this.getName().equals(ref.getName()) && this.deptno == ref.deptno )
			return true;
		else
			return false;
	}
	@Override
	public int hashCode() {
		int code = this.hashCode() * 32 *((int)this.empId) * (this.getName().length()) * this.deptno.length();
		
		return super.hashCode();
	}
*/	 
}
