package edu.atria.b94java.inheritence;

public class Employee extends Citizen{
	private int empId;
	private String name;
	private String designation;
	private double salary;
	
	public Employee(long aadharNo, long voterId, String nationality, int empId, String name, String designation,
			double salary) {
		super(aadharNo, voterId, nationality);
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", getAadharNo=" + getAadharNo() + ", getVoterId=" + getVoterId() + ", getNationality="
				+ getNationality() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
	

}