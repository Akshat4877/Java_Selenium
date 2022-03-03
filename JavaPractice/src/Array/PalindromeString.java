package Array;

public class PalindromeString {

	public static void main(String[] args) {

		
      String s="Hi This is me";
      String rev="";
      char[] str=s.toCharArray();
      int len=str.length;
      System.out.println("String legnth is :"+len);
      for(int i=len-1; i>=0; i--) {
    	  rev=rev+s.charAt(i);
      }
      System.out.println("Reverse String is "+rev);	
      
      if(s.equalsIgnoreCase(rev)) {
    	  System.out.println("It is a Palindrome String");
      }
      else
      {
    	  System.out.println("It is not a Palindrome String");
      }
	}

}
