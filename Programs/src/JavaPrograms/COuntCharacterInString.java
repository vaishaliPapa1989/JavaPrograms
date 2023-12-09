package JavaPrograms;

public class COuntCharacterInString {

	public static void main(String[] args) {
		String str = "I am am am   am am am  am am am learning java   learning java  learning java java programs";
		
		String strnew =str.replace(" ", "");
		
		strnew.length();
		
	//count any particular character
		
		int result = str.length()-str.replaceAll("a", "").length();
		

	}

}
