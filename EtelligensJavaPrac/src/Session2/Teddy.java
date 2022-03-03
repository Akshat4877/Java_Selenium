package Session2;

public class Teddy extends Toy {
	
	
	int range;
	
void B(){
		
	System.out.println("B child class");
	}
	
	
Teddy(){
		
	super("HIII");
	
	}
	
	
	Teddy(int range){
		
		super(101,"Red");
	
		this.range=range;
		System.out.println(range);
	}
	
	
	
	
	

}
