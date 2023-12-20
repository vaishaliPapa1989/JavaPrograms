import java.util.HashMap;
import java.util.Map;

public class MapMergeExample {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        map2.forEach((key, value) -> map1.merge(key, value, Integer::sum));
        //This line of code demonstrates an advanced use of Java Collections and Lambdas. Let's break it down for clarity:

//map2.forEach((key, value) -> ...): This is a method from the Map interface in Java, introduced in Java 8. It's used for iterating over the entries (key-value pairs) of map2. For each entry in map2, the lambda expression (key, value) -> ... is executed. The key and value are the current entry's key and value, respectively.

//map1.merge(key, value, Integer::sum): The merge method is a part of the Map interface as well. It's used here to combine the two maps (map1 and map2). This method does the following:

Checks if map1 contains the key from map2:
If no, the key-value pair is added to map1.
If yes, it uses the provided lambda expression Integer::sum to determine what value to associate with the key.
Integer::sum: This is a method reference in Java, referring to the sum method in the Integer class. It takes two integers and returns their sum. In the context of map1.merge, it's used to define how to handle a key collision between map1 and map2. Specifically, if the same key exists in both maps, their values are summed.
So, in essence, this line iterates through each entry in map2, and for each entry, it attempts to merge it into map1. If map1 already contains the key, it sums the values from both maps; if not, it simply adds the new key-value pair from map2 to map1.
        System.out.println(map1);
    }
}
