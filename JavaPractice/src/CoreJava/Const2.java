package CoreJava;

public class Const2 {
	
	//Default constructor is use to provide default values to the object
	
	int a;
	String b;
	int rank;
	String subject;
	
	
	
	
	void display() {
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) {
		
		Const2 c=new Const2();//displaying values of the object  
	    c.display();			
		
	}
	

}

class Student{
	
	
	 int id;
	 String name;
	 int rank;
	 String subject;
	 int c;
	
	//this is something important
	//that is 'this' keyword
	
	//so if the variable name and the argument varibale name is same than we have to
	//use 'this keyword' 
	//if not than no need to use 'this keyword' it is one kind of reference variable
	
	Student(int id , String name){
		
		id=this.id;
		name=this.name;
		
	}
	
  Student(int rank , String subject, int c){
		
		id=this.rank;
		name=this.subject;
		c=this.c;
		
	}
	
	void stuinfo() {
		System.out.println(id +" "+name+" "+rank+" "+subject +" "+c);
	}
	
	
	public static void main(String[] args) {
		
		Student s1=new Student(11, "Akshat");
		Student s2=new Student(12, "Zeshan");
		Student s3=new Student(12, "Java",333);
		s1.stuinfo();
		s2.stuinfo();
		s3.stuinfo();
		
	}
	
	
}



