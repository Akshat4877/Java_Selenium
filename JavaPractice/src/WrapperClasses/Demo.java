package WrapperClasses;

public class Demo {
	
	String type="Java";
	
	@Override
	public String toString() {
		return "this is of type :"+this.type;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	public static void main(String[] args) {
		
		Demo d=new Demo();
		System.out.println(d);
		System.out.println(d.hashCode());	
	}
	
	
	//default constructor
	

}
