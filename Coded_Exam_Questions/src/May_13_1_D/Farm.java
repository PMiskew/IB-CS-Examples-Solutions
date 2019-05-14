package May_13_1_D;

public class Farm {

	
	private String name;
	private int id;
	private int numFields;
	/*
	 * Watch: I haven't set the size of the array. 
	 */
	private FarmField[] fields;
	
	
	/*
	 * Constructor:
	 */
	public Farm(String n, int i, int nf) {
		
		this.name = n;
		this.id = i;
		this.numFields = nf;
		fields = new FarmField[numFields];
		
	}
	
	public int getNumFields() { return numFields; }
	public FarmField[] getFarmFields() { return fields; }
	
	public void setFieldName(String n) { name = n; }
	public void addFarm(FarmField f, int i) {
		fields[i] = f;
	}
		
}
