package class_practice_1;

//4 fields
//It extend object
//It is a sub-class of object
//Object is Student super class
//fields are encapsulated with the private modified. 

public class Student {

	//A static field means that all instances share the same variable. 
	private static int studentCount;
	private String studentNumber;
	private int age;
	private String name;

	//This class has 1 constructors
	//If no constructor is written the program uses a default constructor
	//If a single constructor is written the default constructor is removed. 
	
	public Student(int a, String n) {
		
		//studentNumber is assigned based on number of objects.  Use static variable studentCount as 
		//studentNumber and add one every time constructor is called. 
		studentNumber = "000"+studentCount;
		studentCount = studentCount + 1;
		
		age = a;
		name = n;
		
	}
	
	//Get and set methods
	//Non static methods are called instance methods. 
	public int getAge() { return age; }
	public String getStudentNumber() { return studentNumber; }
	public String getName() { return name; }
	
	//Static methods can ONLY ACCESS STATIC FIELDS
	public static int getStudentCount() { return studentCount; }
	
	
	
	//Question:  If teachers took this bus as well, how could OOP principles, specifically
	//			 hierarchies be used to design this to minimize code?
	//			 
	
	
}
