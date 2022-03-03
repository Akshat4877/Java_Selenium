package HasA;

public class Student {
	
	String name;
	int id;
	
	static Trainer t=new Trainer();
	
	
	public static void main(String[] args) {
		
		
		Student s=new Student();
		s.id=101;
		s.name="Mack";
		//Trainer t=new Trainer();
		
		Student.t.tech();
		
		
		t.name="Akshat";
		t.sub="Java";
		t.tech();
		
		
		
	}

}
