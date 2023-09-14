package programs;

import java.util.Arrays;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String  str="Sre";
		String str1= "uadmh";
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		
		 str=str.toLowerCase();
		 str1=str1.toLowerCase();
		 
		 if(str.length()!=str1.length()) {
			 System.out.println("not  a anagram");
		 }
		 
		 char[] ch= str.toCharArray();
		 char[ ] ch1= str1.toCharArray();
		 
		 Arrays.sort(ch);
		 Arrays.sort(ch1);
		 
		 if(Arrays.equals(ch, ch1)==true) {
			 System.out.println("		anagram");
		 }else {
			 System.out.println("    not a anagram");
		 }
		
		
		
	}

}
