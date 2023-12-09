package JavaPrograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// all letters are same 
		
		String s1= "army";
		String s2 = "Mary";
		
		s1.toLowerCase().toCharArray();
		
		char[] c1=s1.toCharArray();
		char[] c2= s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)) {
			System.out.println("Its anagram");
		}else {
			
			System.out.println("Its not anagram");
		}

	}

}
