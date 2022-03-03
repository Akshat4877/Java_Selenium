
public class EqualsMethods {
	
	
	//== operator compaire two object on the basic of address
	//equals() -compaire two object on the basic of their content
	
	
	public static void main(String[] args) {
		
		String f="Hello";
		String f1="Hello";
		String s=new String("Hello");
		System.out.println(f.equals(f1));
		System.out.println(f==f1);
		System.out.println(f==s);
		System.out.println(f.equals(s));	
	}

}
