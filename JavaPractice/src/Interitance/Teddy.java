package Interitance;

public class Teddy extends Toy{
	
	String color;
	
	Teddy(String brand, int price,String color){
		
		super(brand,price);
		this.color=color;
		
	}
	
	void sing() {
		System.out.println("Teddy sing");
	}
	

}
