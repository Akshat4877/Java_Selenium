package Interitance;

public class Student {
	
	String name;
	int sid;
	
	//Trainer t;
	
	static Trainer t=new Trainer();
	
	public static void main(String[] args) {
		
		Student s=new Student();
		s.name="Vishal";
		s.sid=101;
		s.t=new Trainer();
//		s.t.name="Deverkonda";
//		s.t.sub="MBBS";
		
		
		Student.t.name="many to one";
		Student.t.sub="Has A";
		Student.t.tech();
				
		System.out.println();
		//class //static reference variable of printstrem
		//instance function of class PrintStream
	}

}


