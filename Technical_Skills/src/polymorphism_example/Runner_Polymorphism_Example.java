package polymorphism_example;

public class Runner_Polymorphism_Example {

	public static void main(String[] args) {
	
		//A a = new A();
		//B ba = new B();
		A ab = new B();
		//C cb = new B();
		A ac = new C();
		//C c = new C();
		ac.doEverything();
	
		ab.doThis();
	}



}
