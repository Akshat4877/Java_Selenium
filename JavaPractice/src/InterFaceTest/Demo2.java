package InterFaceTest;

public class Demo2 implements Demo1 {

	
	//abstract void run();
	
	@Override
	public boolean IswitchOn() {
		System.out.println("Light ON");
		return false;
	}

	@Override
	public boolean IswitchOff() {
		System.out.println("Light Off");
		return false;
	}	
	
	public static void main(String[] args) {
		
		
		Demo2 d=new Demo2();
		d.IswitchOn();
		d.IswitchOff();
		System.out.println(d.color);
		System.out.println(d.size);
		
	}
	
	
}
