package May_16_15D;

public class Dates {

	private int day;
	private int month; 
	private int year; 
	
	public Dates (int day, int month, int year) {
		this.day = day;
		this.month = month; 
		this.year = year;
	}
	
	public int getDay() { return day; }
	public int getMonth() { return month; }
	public int getYear()  { return year; }
	public static int stayDays(Dates x, Dates y) {
	/*
	 * I have written an implementation for this method, but from an exam 
	 * perspective you just need to know how to use it.  This is VERY IMPORTANT
	 * use what is provided and don't worry about how it works, just that 
	 * it works. 
	 * 
	 * AP Suggestion:  For those writing AP CS A this is a really common thing.  Infact
	 * if part a of a question has you write a function and part b has you use the function
	 * you just assume that part a was correct, even if you left it blank. 
	 */
		
		//Stores days per month starting in January (assume feb has 28)
		int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		//method calculates the number of nights between x an y
		//I wrote the logic here. 
		
		int totalDays = 0;
		
	
		if (x.getYear() == y.getYear()) {
			
			
			if (x.getMonth() == y.getMonth()) {
				return y.getDay() - x.getDay();
			}
			else {
				
				totalDays = daysInMonth[x.getMonth() - 1] - x.getDay(); //days in first month
				totalDays = totalDays + y.getDay();
				
				for (int i = x.getMonth(); i < y.getMonth() - 1; i = i + 1) {
					totalDays =totalDays + daysInMonth[i];
				}
			}
		}
		else {
			
			//days in month x
			totalDays = daysInMonth[x.getMonth() - 1] - x.getDay();
			
			//rest of the year
			for (int i = x.getMonth(); i < 12 ; i = i + 1 ) {
				
				totalDays = totalDays + daysInMonth[i];
			}
		
			//Full years
			if (y.getYear() - x.getYear() > 1) {
				totalDays = totalDays + 365 + (y.getYear() - x.getYear());
			}
			
			
			//Last year days (not including month y)
			for (int i = 0; i < y.getMonth() - 2; i = i + 1) {
				totalDays = totalDays + daysInMonth[i];
			}
			
			//Month y days
			totalDays = totalDays + x.getDay();
			
			
		}
		return totalDays;
		
		
		
		
		
		
	}
}
