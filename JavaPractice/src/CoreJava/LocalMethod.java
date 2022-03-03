package CoreJava;

public class LocalMethod {
	
	String x="Hello";
	
	void test() {
		String y="Hi";
		System.out.println(y);
		System.out.println(x);
	}
	
	void run() {
		//local variable of method test can not be accessed
		//can have same declaration of data member in differnt methods
		String y="run";
		System.out.println(y);
	}
	
	
	public static void main(String[] args) {
		
		LocalMethod m=new LocalMethod();
				m.test();
				m.run();
		
	}

}
