package Poly;

public class OverRide2 extends OverRiding {

	//method signature must be same
	//cann't change return type in sub clas
	//cann't decrease the visibility of the overridden method
	
	//Public >protected > default > private
	
	//can not override private ,final and static method but inherited
	
	//it is run time polymorphisam
	
	@Override
	public void over() {
		System.out.println("i am child class overridden method");
	}
	
	public static void main(String[] args) {
		
		OverRide2 o=new OverRide2();
		o.over();
		
	}
}
