package AbstractDemo;

public class TestBank {
	
	public static void main(String[] args) {
		
		//can not create object of Abstract class
		//Bank b=new Bank();
		
		
		
		Bank b=new ICICI();
		b.getROi();
		
		System.out.println(b.name);
		
		b=new HDFC();
		b.getROi();
	}
	

}
