
public class Test {
	
	public static void main(String[] args) {
		
//		
//		String s="My Name is";
//		String[] str=s.split(" ");
//		String emp=" ";
//		
//		
//		for(String Word:str) {
//			
//			String rev=" ";
//			for(int i=Word.length()-1; i>=0; i--) {
//				
//				rev=rev+Word.charAt(i);
//				
//			}
//			
//			emp=emp+rev+" ";
//					
//			
//		}
		
		
		
		
		
//		String s="Aakash";
//		String s1="";
//		for(int i=s.length()-1; i>=0; i--) {
//			
//			s1+=s.charAt(i);
//			
//			
//		}
//		System.out.println(s1);
		
		
		
		
		
		
		String s="my name tow";
		int count=1;
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i)==' ') {
				count++;
			}
			
		}
		System.out.println(count);
		
	
	
	}
}
