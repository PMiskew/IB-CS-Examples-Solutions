package class_practice_1;

public class Bus {

	private int num;
	private int maxcapacity;
	private static int fleet_count;
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
	
	public Student[] getStudentList() { return students; }
	
}
