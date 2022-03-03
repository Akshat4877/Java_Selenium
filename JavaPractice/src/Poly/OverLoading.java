package Poly;

public class OverLoading {
	
	//A class have multiple method with the same name but different in parameter list
	//In method overloading ,the binding of method call and method implementation 
	//is done at compile time by java compiler
	
	int add(int a, int b) {
		
		return(a+b);
	}
	
	int add(int a, int b, int c) {
		
		return(a+b+c);
	}
	
	
	
	public static void main(String[] args) {
		
		OverLoading o=new OverLoading();
		int x=o.add(10, 12);
		System.out.println(x);
		int y=o.add(1, 2, 3);
		System.out.println(y);
		
	}

}
