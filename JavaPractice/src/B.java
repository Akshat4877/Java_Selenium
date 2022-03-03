
public class B extends A {
	
	public void Foo() {
		System.out.println("Child--This is a static method2");
	}
	
	public void foo2() {
		System.out.println("Fooo2");
	}


	public static void main(String[] args) {
		
		A a=(A)new B();
		
	    a.New();
	   
	    B a1=(B)new A();
	    
	    B b=(B)a;
	    b.foo2();
	    b.Foo();
	    
	    
	    
	    
	    
	}
}
