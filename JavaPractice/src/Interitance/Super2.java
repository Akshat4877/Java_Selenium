package Interitance;

public class Super2 extends Super {
	
	int id;

	//Super() //to call constructor of super class form sub class constructor
	//must be first line inside the constructor
	
	Super2(int id){
		super("super keyword", 12);
		this.id=id;
		System.out.println(id);
	}
	
	public static void main(String[] args) {
		
		Super2 s2=new Super2(25);
		System.out.println(s2.age);
		System.out.println(s2.name);
		
		
	}
	
}
