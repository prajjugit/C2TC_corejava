package edu.atria.b94java.inheritence;

public class Citizen {
	
	private long aadharNo;
	private long voterId;
	private String nationality;
	
	//parameterized constructor
	public Citizen(long aadharNo, long voterId, String nationality) {
		super();
		this.aadharNo = aadharNo;
		this.voterId = voterId;
		this.nationality = nationality;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public long getVoterId() {
		return voterId;
	}

	public void setVoterId(long voterId) {
		this.voterId = voterId;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "Citizen [aadharNo=" + aadharNo + ", voterId=" + voterId + ", nationality=" + nationality + "]";
	}
	
	
	
	
	
	
}