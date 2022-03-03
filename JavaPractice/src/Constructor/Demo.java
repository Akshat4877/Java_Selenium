package Constructor;

public class Demo  {
	
	//default costructor
	
	String ShareName;
	double SharePrice;
	boolean status=true;
	
	public Demo(String ShareName,double SharePrice ) {
		
		this.ShareName=ShareName;
		this.SharePrice=SharePrice;
		System.out.println(ShareName+" "+SharePrice);
		
		
		
	}
	
    public Demo(String p) {
	
    	this.ShareName=p;
    	
    	System.out.println(ShareName);
	
	}
	


public Demo(int a) {
	
}

public Demo(String s, int a) {
	
}



public Demo(int a, String a1,String w) {
	
}
	
	
	public static void main(String[] args) {
		
		Demo d=new Demo("A",202.12);
		Demo d1=new Demo("A");
		
		
	}

}
