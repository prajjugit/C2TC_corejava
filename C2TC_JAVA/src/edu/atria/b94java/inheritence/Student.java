package edu.atria.b94java.inheritence;

public class Student extends Citizen{
	
	private int studentId;
	private String name;
	private String department;
	private String proctor;
	
	public Student(long aadharNo, long voterId, String nationality, int studentId, String name, String department,
			String proctor) {
		super(aadharNo, voterId, nationality);
		this.studentId = studentId;
		this.name = name;
		this.department = department;
		this.proctor = proctor;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getProctor() {
		return proctor;
	}

	public void setProctor(String proctor) {
		this.proctor = proctor;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", department=" + department + ", proctor="
				+ proctor + ", getAadharNo=" + getAadharNo() + ", getVoterId=" + getVoterId()
				+ ", getNationality=" + getNationality() +  "]";
	}

	
	
	
	
}