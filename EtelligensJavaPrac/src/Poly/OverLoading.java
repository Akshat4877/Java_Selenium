package Poly;

public class OverLoading {
	
	
	
	//method call and method implementation
	
	//early binding, compile time polymorphism, static binding
	
	int add(int a, int b) {
		
		return(a+b);
		
	}
	
    int add(int a, int b, int c) {
    	
    	return(a+b+c);
		
	}
	
	public static void main(String[] args) {
		
		OverLoading o=new OverLoading();
		int x=o.add(1, 2);
		int y=o.add(1, 2, 3);
		System.out.println(x);
		System.out.println(y);
		
		
	}

}
