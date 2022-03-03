package Interitance;

public class Animal {
	
	String eat="Dog food";
	int legs=4;
	
	void common() {
		System.out.println("Common method");
	}
	
	void run() {
		System.out.println("Animals run");
	}
	
	void eat() {
		System.out.println("all animals eat");
	}

}

class  Dog extends Animal {
	
	void common() {
		System.out.println("Common method");
	}
	
	void bark() {
		System.out.println("dogs bark");
	}
	
}

class BabyDog extends Dog {
	
	void weep() {
		System.out.println("dog weep");
	}
	
}




