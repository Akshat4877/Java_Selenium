package CoreJava;

public class Constructors {
	
	Constructors(){
		System.out.println("This is not default constructior");
	}
	
	Constructors(String s){
		System.out.println("This is prameterize constructior");
	}
	
	public static void main(String[] args) {
		Constructors cons=new Constructors();
		Constructors cons2=new Constructors("This is prameterize const");
	}

}
