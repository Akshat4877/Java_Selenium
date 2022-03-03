package AbstractDemo;

public abstract class Bank {
	
	
	//Abstraction is a process of hiding the implementation details
	//and showing only functionality to the user.
	
	//can have-
	//1.instance data members and static data members
	//2.constructor
	//3.blocks
	//4.concrete method and abstract method
	
	//Note- Abstract method can be declare private, final ,
	//and static but cann't be overridden
	
	
	//the only way to use  features of abstract class is Inheritance
	
	
	//abstract void method() ;
	//System.out.println("Abstract method can only declare with abstract class");
	
	String name;
	
	Bank(){
		this.name="DJ";
		System.out.println(name);
				
	}
	
	
	void getROi(){
		
	}

}
