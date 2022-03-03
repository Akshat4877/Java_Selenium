package Poly;


//byte <short <int <long <float <double

public class CastFun2 {
	
	static void foo(int X) {
		System.out.println("int "+X);
	}
	
	static void foo(long X) {
		System.out.println("long "+X);
	}
	
	static void foo(short X) {
		System.out.println("short "+X);
	}

	public static void main(String[] args) {
		
		foo(21);
		foo(32L);
		short z=2;
		foo(z);
		
		//narrowing
		foo((short)21.99);
		
	}
}
