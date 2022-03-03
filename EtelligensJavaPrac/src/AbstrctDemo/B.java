package AbstrctDemo;



public class B extends AA{
String A="Child";
	
void Child() {
	System.out.println("i am Child class");
}
	
	
	public static void main(String[] args) {
		
		//upcasting
		AA a=new B();
		a.parnet();
		
		
	
		
		
		
	}
}
