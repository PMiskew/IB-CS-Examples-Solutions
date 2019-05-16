package class_practice_1;

public class Student {

	private static int studentCount;
	private String studentNumber;
	private int age;
	private String name;

	public Student(int a, String n) {
		
		//studentNumber is assigned based on number of objects.  Use static variable studentCount as 
		//studentNumber and add one every time constructor is called. 
		studentNumber = "000"+studentCount;
		studentCount = studentCount + 1;
		
		age = a;
		name = n;
		
	}
	
	public int getAge() { return age; }
	public String getStudentNumber() { return studentNumber; }
	public String getName() { return name; }
	
	
	//Question:  If teachers took this bus as well, how could OOP principles, specifically
	//			 hierarchies be used to design this to minimize code?
	//			 
	
	
}
