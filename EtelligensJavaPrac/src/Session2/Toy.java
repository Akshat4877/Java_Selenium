package Session2;

public class Toy{
	
	String Toy="MAck";
	
	int price;
	String color;
	
	String opt;
	
	void A(){
		System.out.println("A super class");
	}

	Toy(int price, String color){
		this.price=price;
		this.color=color;
		System.out.println(price);
		System.out.println(color);
	}
	
	Toy(String opt){
		
		this.opt=opt;
		System.out.println("this is not parameterzie const.");
	}
	

	

}
