package Poly;

//byte <short <int <long <float <double


public class CastFun {
	
	static void foo(double X) {
		System.out.println("Double "+X);
	}
	
	static void foo(float X) {
		System.out.println("Float "+X);
	}
	
	static void foo(int X) {
		System.out.println("int "+X);
	}
	
	public static void main(String[] args) {
		
		//Widening by compiler and explicitly by user using case operator
		foo(21.37);
		foo(21.33f);
		foo(21);
		foo(21L);

		//narrowing
		foo((double)21);
		
		short s=21;
		foo((int)s);
			
	}

}
