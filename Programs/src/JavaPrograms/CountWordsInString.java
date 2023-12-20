package JavaPrograms;

import java.util.HashMap;

import java.util.Map;

public class CountWordsInString {

	public static void main(String[] args) {

		String str = "I am am am learning java learning java learning java java programs";

		Map<String, Integer> map = new HashMap<String, Integer>();

		int count = 1;

		String[] arr = str.split(" ");


		for (int i = 0; i < arr.length; i++) {

			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}

		}

		// printing output

		for (String x : map.keySet()) {

			System.out.println("The count of each word" + x + ":" + map.get(x));
		}

	}

}