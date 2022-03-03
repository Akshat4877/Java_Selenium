package Method;

public class Demo {
	
	
	
	
	//method has -void, primitive and object return type
	
	static public int foo(int a,int b) {
		
		int c=a+b;
		return c;
		
	}
	
	public static void main(String[] args) {
		
		//Demo d=new Demo();
		
		int add=foo(1, 2);
		System.out.println(add);
		int add1=foo(add,4);
		System.out.println(add1);
		
	}
	
	

}
