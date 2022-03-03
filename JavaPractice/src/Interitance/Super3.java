package Interitance;

public class Super3 {

	String color="Red";
	
	void run() {
		System.out.println("run of Parent class");
	}
	
}

class Super4 extends Super3{
	
	String color="Green";
	
	void run() {
		System.out.println(color);
		System.out.println(super.color);
		super.run();
		System.out.println("run of Child class");
	}
	
	
	
	
	
}
