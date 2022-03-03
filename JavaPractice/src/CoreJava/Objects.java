package CoreJava;

public class Objects {
	
	
	int money=1000;
	//no primitive
	String b; //Classes , interface, Arrays etc
	
	//Primitive
	
	//boolean
	boolean g;
		
	//Character
	char c;
	
	//Floating point
	float e;
	double f;
	
	//integer
	byte x;
	short y;
	int a;
	long d;
	
	
	void method() {
		
		int a=10;
		
		
	}
	
	
	public static void main(String[] args) {
		
		Objects obj=new Objects();
		
		//Ananomous object, can be accessed only one time
		new Objects();
		//System.out.println(new Objects().a);
		
		System.out.println("A ="+obj.a);
		//System.out.println("B ="+obj.b);
		System.out.println("C ="+obj.c);
		System.out.println("D ="+obj.d);
		System.out.println("E ="+obj.e);
		System.out.println("F ="+obj.f);
		System.out.println("G ="+obj.g);
		System.out.println("OBJECT ="+obj);
		System.out.println("X ="+obj.x);
		System.out.println("Y ="+obj.y);
		
	}
	
}
