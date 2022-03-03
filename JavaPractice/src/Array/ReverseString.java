package Array;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s="Nameass";
		char[] arr=s.toCharArray();
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]+" is duplicate");
				}
			}
		}
		
		
		
//		String s="My name is";
//		
//		int count=1;
//		for(int i=0; i<s.length(); i++) {
//			
//			if(s.charAt(i)==' ') {
//				count++;
//			}
//
//		}
//		System.out.println(count);

		
		
		
		
	//	String s="My name is";

//		String[] str=s.split(" ");
//		String emp="";
//		for(String word:str) {
//			
//			String rev=" ";
//			
//			for(int i=word.length()-1; i>=0; i--) {
//				  
//				rev+=word.charAt(i);
//			}
//			System.out.println(rev);
//			emp+=rev;
//		}
//		System.out.println(emp);
//		
}
	
}
		
		
		
		
		
		
		
		
		
		
		
//		String s="ZY CBA";
//		String[] words=s.split(" ");
//		String emp=" ";
//		for(String word: words)
//		{
//			String rev=" ";
//		
//		for(int i=word.length()-1;i>=0; i--){
//			
//		rev= rev+ word.charAt(i);
//		}
//		emp=emp+rev;
//		}
//		System.out.println(emp);
      //}
	//}

