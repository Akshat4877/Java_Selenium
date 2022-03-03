package CoreJava;

public class Dummy {

	String X="Get Life";
	
	void dosomething() {
		String X="Get Lost";
		System.out.println(X);
		//this keyword always refers the currnetly active objec
        System.out.println(this.X);
	}
	
	public static void main(String[] args) {
		
		Dummy d=new Dummy();
		d.dosomething();
		
		Dummy d1=new Dummy();
		d1.dosomething();
		
		Dummy d2=new Dummy();
		d2.X="Feeling Alive";
		d2.dosomething();
		
		
		
		
	}
	
	
}
