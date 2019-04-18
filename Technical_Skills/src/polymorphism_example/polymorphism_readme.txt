Polymorphic Methods:

- Polymorphic methods are overridden methods. 
- Polymorphism is applied at run time.  It is choosing the correction version of the method to run at runtime

Example: (SEE CODE to RUN

doThis is Polymorphic since it is defined in class A, B and C


At compile time Java assumes that ab is an A object.
At run time Java will treat ab as a B object. 
		A ab = new B(); 
		
At compile time Java assumes it called doThis in A class.
At run time Java will actually call the doThis in B class. 
		ab.doThis();

At compile time Java assumes that ac is an A object.
At run time Java will treat ac as a C object. 	
		A ac = new C();
		

		
