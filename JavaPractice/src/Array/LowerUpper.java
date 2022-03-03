package Array;

public class LowerUpper {
	
//	public static void main(int[] args) {
//		
//	}
	
	
	public static void main(String[] args) {
		
		//LowerUpper.main(new int[] {1,2});
		String name="AkSaaaaaaahat TyAgi ALEXA";
		StringBuilder sb=new StringBuilder(name);
		for(int i=0; i<sb.length(); i++) {
			if(Character.isUpperCase(name.charAt(i))) {
				sb.setCharAt(i, Character.toLowerCase(name.charAt(i)));	
			}
			
			else {
			
		      sb.setCharAt(i, Character.toUpperCase(name.charAt(i)));
			}
		}
		
		System.out.println(sb);
		
	}

}
