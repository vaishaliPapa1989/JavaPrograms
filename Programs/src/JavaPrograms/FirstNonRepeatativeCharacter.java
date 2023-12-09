package JavaPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatativeCharacter {

	public static void main(String[] args) {

		String str = "swisswfg";
		int count = 1;

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (!map.containsKey(str.charAt(i))) {

				map.put(str.charAt(i), count);
			} else {

				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}
		}
		// print
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				
				System.out.println("the first non repetative character "+ entry.getKey());
			}break;

		}

	}

}
