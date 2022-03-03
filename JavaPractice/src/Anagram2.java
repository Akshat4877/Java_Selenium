import java.util.Arrays;
import java.util.Collections;

public class Anagram2 {
	
	public static void isAnagram(String str1, String str2) {
		
		String s1=str1.replaceAll(" ", "");
		String s2=str2.replaceAll(" ", "");
		boolean status=true;
		
		if(s1.length()!=s2.length()) {
			status=false;
		}
		else {
			
			char[] ArrayS1=s1.toLowerCase().toCharArray();
			char[] ArrayS2=s2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			System.out.println(ArrayS1);
			System.out.println(ArrayS2);
			status=Arrays.equals(ArrayS1, ArrayS2);
		}
		if(status)
			System.out.println(s1+" and "+s2 +" are anagram");
		else
			System.out.println(s1+" and "+s2 +" are NOT a anagram");			
		
	}
	
	public static void main(String[] args) {
		isAnagram("Peek", "Keepp");
		isAnagram("MotherInLaw", "HitlerWoman");
	}

}
