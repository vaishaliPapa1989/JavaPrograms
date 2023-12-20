import java.util.HashSet;
import java.util.Set;

public class SubstringExample {
    public static void main(String[] args) {
        String input = "abc";
        Set<String> substrings = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                substrings.add(input.substring(i, j));
            }
        }

        System.out.println(substrings);
    }
}
