package edu.atria.b94java.inheritence;

public class SingleInhertitenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Employee eOne = new Employee(1278903527l, 1212121212l, "Indian", 121, "Rahul","Front end developer", 40000.00);

		Citizen eTwo = new Employee(396788999936l,13452920l,"Indian",111,"Ravi","Tester",50000.00);
		System.out.println(eTwo);
		
		//Hierarchial inheritence
		Citizen sOne = new Student(12456783909l,1233214649l,"Indian",101,"Rohith","CSE","Rahul");
		System.out.println(sOne);
		
	}

}