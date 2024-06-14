package edu.atria.b94java.statickeyword;

public class MyClass {
	private int section; //nonstatic variable
	private static int srNo; //static variable
	
	//static block
	static {
		System.out.println("within the static block.......");
		srNo=1000;
	}
	
	MyClass(){
		System.out.println("within default constructor....");
		srNo++;
	}
	
	//static method
	public static void display() {
		System.out.println(srNo);
		//System.out.println(section); //cannot access non static member inside a static method
	}

	@Override
	public String toString() {
		return "MyClass [section=" + section + ", srNo=" +srNo+ "]";
	}
	
	
	
}