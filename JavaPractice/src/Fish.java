
public class Fish {
	
	
	String type;
	
	Fish(String type){
		this.type=type;
	}
	
	public String toString() {
		
		return "Types of fish is :"+this.type;
	}
	
	public int hashcode(){
		
		return 10;
	}
	
	public static void main(String[] args) {
		
		Fish f=new Fish("haka");
		System.out.println(f);
		System.out.println(f.hashcode());
		
	}
	

}
