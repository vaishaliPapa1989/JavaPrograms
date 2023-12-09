package JavaPrograms;

public class RemoveleadingZeros {

	public static void main(String[] args) {
		
		String input = "00123";
		String result = "";
		
		removeLeadingZero(input);
		
		
	

	}

private static String removeLeadingZero(String input) {
		
		return String.valueOf(Integer.parseInt(input));
	}

}
