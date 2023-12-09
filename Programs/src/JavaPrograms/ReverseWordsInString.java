package JavaPrograms;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String input= "Hello world java";
		String result =
				
				reverseWordsInString(input);
		System.out.println("Original: "+ input);
		System.out.println("Reverse: "+ result);
	}

	private static String reverseWordsInString(String input) {
		String[] words = input.split("\s+");
		
		StringBuilder reversed = new StringBuilder();
		
		for (String var:words) {
			StringBuilder reversedWord = new StringBuilder(var);
			
			reversed.append(reversedWord.reverse()).append("");
			
			
			
		}
		
		return reversed.toString().trim();
	}
	
	

}
