package JavaPrograms;


//The Java program you provided is used to determine whether a given string is a pangram or not. 
//A pangram is a sentence or phrase that contains every letter of the alphabet at least once.
public class Panagram {

	public static void main(String[] args) {

		String s1 = "a quick brown fox jumps over the lazy dog";
		String s2=s1.replace(" ", "");
		boolean flag=true;	
		System.out.println(s2.length());

			if (s2.length() < 26) {

				flag = false;
			} else {
			for (char c = 'a'; c <= 'z'; c++) {
				if (s2.indexOf(c) < 0) {
					flag = false;

				} 
			}	
			}

		if (flag) {
			System.out.println("panagram");

		} else {
			System.out.println("not a panagram");
		}
	}

}
