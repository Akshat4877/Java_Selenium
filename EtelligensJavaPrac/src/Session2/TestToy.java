package Session2;

public class TestToy {
	
	public static void main(String[] args) {
		
		//Teddy t=new Teddy();
		
		//upcasting
		Toy t=new Teddy();
		t.A();
		
		//downcasting
		Teddy d=(Teddy)t;
		d.B();
		
		//does not support casting b/w sibblings 
		
		
	
		
	}

}
