package JavaPrograms;

public class ReplaceCharacterToSpecificIndex {

	public static void main(String[] args) {
		String myString = "Vaishali jain@#$";

		int indexToReplace = 9;

		char newChar = 'Z';

		// convert string into string builder --bcoz it allow to modify string without
		// creating and using memory again and again

		StringBuilder SB = new StringBuilder(myString);

		// replace character at specific index

		if (indexToReplace >= 0 && indexToReplace < myString.length()) {
			SB.setCharAt(indexToReplace, newChar);
			System.out.println("updated string: " + SB.toString());

		} else {
			System.out.println("invalid indec=x for replacement");

		}

	}

}
