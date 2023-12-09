package JavaPrograms;

public class FetchCharacterFromString {

	public static void main(String[] args) {

		// input string
		String myString = "hello, world!";
		// fetch character using loop

		for (int i = 0; i < myString.length(); i++) {
			char currentChar = myString.charAt(i);

			System.out.println("Character at index " + i + ": " + currentChar);
		}
//for specific index
		int indexToFetch = 7;

		char specificChar = myString.charAt(indexToFetch);
		System.out.println("\nCharacter at index " + indexToFetch + ": " + specificChar);

	}

}
