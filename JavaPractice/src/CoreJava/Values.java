package CoreJava;

public class Values {
	
	
	int i;
	String s="Akshat";
	
	Values(int i){
		this.i=i;
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		Values v=new Values(1);
		v.i=2;
		System.out.println(v.i);
		
	}

}
