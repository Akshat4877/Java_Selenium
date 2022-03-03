package Constructor;

public class Test {
	
	//Constructor overloading
	int i;
	String s;
	
	
	Test(){
		System.out.println("am default constructor");
	}
	
	Test(String name){
		
		s=name;	
	}
	
	Test(int id){
		i=id;		
	}
	 
	Test(int id, String name){
		i=id;
		s=name;				
	}
	

	void display() {
		System.out.println(i+" "+s);
	}
	
	
	public static void main(String[] args) {
		
		Test t=new Test();
		Test t1=new Test("Snad");
		Test t2=new Test(1,"MAck");
		Test t3=new Test(1);
		t.display();
		t1.display();
		t2.display();
		t3.display();		
	}
}

//1.is a block(similar to method) as that name of class
//2.does not have any return type
//3.Modifiers- public ,protected , default and private
//4.Calling -it is called  when object is called at run time
