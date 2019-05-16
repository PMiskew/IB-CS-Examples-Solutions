package class_practice_1;

public class Runner {

	public static void main(String[] args) {
	
		Student s1 = new Student(13,"Paul");
		Student s2 = new Student(14,"Steph");
		Student s3 = new Student(11,"Arun");
		Student s4 = new Student(13,"Jasmine");
		Student s5 = new Student(14,"Peter");
		Student s6 = new Student(10,"Jihoo");
		Student s7 = new Student(12,"Edgar");
		
		
		Student[] arrayStudents = {s1,s2,s3,s4,s5,s6,s7};
		
		Bus bus1 = new Bus(213,10,arrayStudents);
		
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
