package Akshat;

import java.util.Arrays;

public class Demo1 {
	
	
	
	public static void ISAnagram(String Str1, String Str2) {
		
		String s1=Str1.replace(" ", "");
		String s2=Str2.replace(" ", "");

		boolean status=true;
		
		if(s1.length()!=s2.length()) {
			System.out.println("It is not a Anagram");
			status=false;
		}
		
		else {
			char[] Array1=s1.toLowerCase().toCharArray();
			char[] Array2=s2.toLowerCase().toCharArray();
			Arrays.sort(Array1);
			Arrays.sort(Array2);
			System.out.println(Array1);
			System.out.println(Array2);
			status=Arrays.equals(Array1, Array2);
		}
		if(status) {
			System.out.println("it is Anagaram");
		}
		else {
			System.out.println("Not a Anagram");
		}
	}
	
	public static void main(String[] args) {
		
		
		ISAnagram("Peek","Keep");
		
		
	}

}
