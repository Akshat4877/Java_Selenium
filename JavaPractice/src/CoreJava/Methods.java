package CoreJava;

public class Methods {
	
	
	//to represent action performed by an object or if any action and behaviour in an object
	//we define method in our class
	
	//There are two types of method
	//1.Abstract method-we know the only decleartion but not implementation
	//2.Concrete method-known both
	
	int add(int a){  //provide parameter value at method call
		//body
		//Implementation
		return 0;
	}
	
	
	int add(int a, int b) {
		
		int c=a+b;
		return c;
		
	}
	
	Methods Methods() {
		
		Methods m=new Methods();
		return m;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Methods m=new Methods();
	    int d=m.add(1, 2); //calling line, and value is here
		System.out.println(d);
		System.out.println(m.add(d, 2));
		int f=m.add(d, 2);
		System.out.println(f);
		
	}
	

}
