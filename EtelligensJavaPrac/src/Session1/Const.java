package Session1;

public class Const {
	
	int a;
	String b;
	
	Const(int a, String b){
		this.a=a;
	    this.b=b;
		System.out.println("this is not default const, but non parametrize");
	}
	
	void info() {
		System.out.println(a);
		System.out.println(b);
	}
	
	Const(String s){
		System.out.println("this is parametrize constructor");
	}
	
	Const(int a){
		System.out.println("Const overloading");
	}
	
	public static void main(String[] args) {
		
		Const c=new Const(1, "New");
		c.info();
		Const c2=new Const("JAva");
		Const c1=new Const(1);
		c.a=10;
		c.b="Java";		
		System.out.println(c.a);
		System.out.println(c.b);	
	}

}
