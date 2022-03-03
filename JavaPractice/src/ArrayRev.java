
public class ArrayRev {
	
	public static void main(String[] args) {
		
		
		String s="malayalam";
		char[] origianl = s.toCharArray();
		int len=origianl.length;
		System.out.println(len);
		String rev="";
		for(int i=len-1 ;i>=0; i--) {
			
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		
		//String palintrom program
		
	if(s.equals(rev)) {
			System.out.println("it is palintrom");
		}
		else {
			System.out.println("not palintrom");		}
				
}
	
}
