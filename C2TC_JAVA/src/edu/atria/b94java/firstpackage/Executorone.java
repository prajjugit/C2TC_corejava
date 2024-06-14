package edu.atria.b94java.firstpackage;

public class Executorone {

	public static void main(String[] args) {
		Base bOne= new Base();
		
		//private members are not visible outside the class
		//System.out.println(bOne.varPrivate);
		
		System.out.println(bOne.variableDefault);
		System.out.println(bOne.variableProtected);
		System.out.println(bOne.variablePublic);
		

	}

}