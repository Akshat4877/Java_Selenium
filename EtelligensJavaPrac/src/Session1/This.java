package Session1;

public class This {
	
	String X="Live";
	
	void me() {
		String X="Die";
		System.out.println(X);
		System.out.println(this.X);
	}
	
	public static void main(String[] args) {
		
		This t=new This();
		t.me();
		This t1=new This();
		t.X="kinko";
		System.out.println(t.X);
		t1.X="mack";
		t1.me();
		System.out.println(t1.X);
		
		
	}

}
