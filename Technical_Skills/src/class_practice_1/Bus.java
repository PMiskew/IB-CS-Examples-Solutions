package class_practice_1;

public class Bus {

	private int num;
	private int maxcapacity;
	private static int fleet_count;
	//This array holds all students on teh bus. 
	//For example if there are 7 students and the capacity of the bus is 10
	//students = {s1,s2,s3,s4,s5,s6,s7,null,null,null}
	private Student[] students; 
	
	/**
	 * 
	 * @param n
	 * @param mc
	 * @param s
	 * Pre-Condition: s.length < maxcapacity
	 */
	public Bus(int n, int mc, Student[] s) {
		
		num = n;
		maxcapacity = mc;
		students = new Student[mc];
		
		for (int i = 0; i < s.length; i = i + 1) {
			students[i] = s[i];
		}
		
	}
	
	public Bus() {
		
	}
	
	//Returning an array of students. 
	public Student[] getStudentList() { return students; }
	
}
