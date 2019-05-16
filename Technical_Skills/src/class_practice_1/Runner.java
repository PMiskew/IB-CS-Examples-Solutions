package class_practice_1;
/*
 * 1. Runner extends Object
 * 		Theory: 
 * 			-	Since no extends is written the class extends object
 * 			-	Inherits all fields and methods.
 * 			-	Inherits allows you to reuse code by placing common code
 * 				in the super class. 
 * 			-	Polymorphism: Chooses the correct method at runtime. 
 * 			-	Polymorphic methods are overidden
 * 			-	overidden methods have the same method header, but 
 * 				are are in different class. 
 * 			-	Overloading is two or methods wit the same name, but
 * 				different parameter. 
 *		modifies change who can view, access and change fields/methods
 *			-	public:	Anyone can access/change 
 *			-	private:	Can only be accessed/changed inside class
 *			-	static:		Look in Student class
 *			-	protected:	Anyone can access/change in a package
 *			-	final:	means a variable is a constant can't change
 *
 */	
public class Runner {

	public static void main(String[] args) {
	
		//We are creating instances of the student class. 
		//Reference Type --> Object Type
		//Student constructor has two parameters.
		Student s1 = new Student(13,"Paul");
		Student s2 = new Student(14,"Steph");
		Student s3 = new Student(11,"Arun");
		Student s4 = new Student(13,"Jasmine");
		Student s5 = new Student(14,"Peter");
		Student s6 = new Student(10,"Jihoo");
		Student s7 = new Student(12,"Edgar");
		
		//Array that holds all seve students. 
		//Array of Objects (reference types).
		//Default value for reference types = null
		//One dimensional arry
		Student[] arrayStudents = {s1,s2,s3,s4,s5,s6,s7};
		
		//constructing a bus object in using the bus class
		//that takes two integer values and an array of Student
		//Objects
		Bus bus1 = new Bus(213,10,arrayStudents);
		
		//Invoking a static method.
		//There is no instance (implied object) used to invoked the method.
		printBusList(bus1);
	}
	
	/**
	 * 
	 * @param b
	 */
	public static void printBusList(Bus b) {
		
		
		Student[] arrayStudents = b.getStudentList();
		System.out.println("Student Number: \tName: \t\tAge:");

		System.out.println("*******************************************");
		for (int i = 0; i < arrayStudents.length; i++) {
		
			if (arrayStudents[i] != null) {
				String sn = arrayStudents[i].getStudentNumber();
				String name = arrayStudents[i].getName();
				int age = arrayStudents[i].getAge();
	
				System.out.println("\t"+sn+"\t\t"+name+"\t\t"+age);
			}
			
		}
		
		
		
	}
	
	
	

}
