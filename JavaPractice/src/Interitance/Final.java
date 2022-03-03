package Interitance;

public final class Final {
	
	//variable =If you make any variable as final, 
	//you cannot change the value of final variable(It will be constant).
	
	//method=If you make any method as final, you cannot override it.
	
	//class=If you make any class as final, you cannot extend it.
	
	final int a=10;
	
	final void dosomthing() {
		System.out.println("I am final");
	}
	
	public static void main(String[] args) {
		
		Final f=new Final();
		System.out.println(f.a);
		//f.a=20;  //can not modify value
		
	}

}
