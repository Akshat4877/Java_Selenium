package AbstrctDemo;

public class Test extends Dummy  {

	@Override
	void run() {

		System.out.println("Run");
	}
	
	public static void main(String[] args) {
		
		
		Dummy d=new Test();
		d.run();
	}
	
	 

}
