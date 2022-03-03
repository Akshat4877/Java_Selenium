package Interitance;

public class TestToy {
	
	//Advantage of Upcasting
	
	
	
//	 Toy getToy(String s){
//		
//		if(s=="Doll") {
//			return d;
//		}
//		
//		else if(s=="Teddy") {
//			return tdd;
//		}
//		else if(s=="Car") {
//			return c;
//		}
//		else {
//			return null;
//		}
//	}
	


	public static void main(String[] args) {
		

		
		//Upcasting 
		//holding the object of sub class by using reference of Super class
		//as a data type of super class is always bigger than sub class
		//always beneficial to have super class reference variable and object of subclass
		Toy t=(Toy)new Teddy("Nike",200,"black");
		
//		
//		System.out.println(t.brand);
//		System.out.println(t.price);
//		
//		System.out.println("*************************************************");
//		
//		Toy t1=new Doll("Update",500);
//		System.out.println(t1.brand);
//		System.out.println(t1.price);
		
		//Downcasting
		//converting the reference variable of super class into the reference variable 
		// of child class after Upcasting known as DownCasting
	     Doll d=(Doll)t;
//		
//		d.dance();
		System.out.println("*********************************************");
		
		Teddy tdd=(Teddy)t;
		System.out.println("Teddy's color "+tdd.color);
		tdd.sing();
		
	}

}
