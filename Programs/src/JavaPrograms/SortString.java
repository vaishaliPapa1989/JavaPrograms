package JavaPrograms;

public class SortString {

	public static void main(String[] args) {

 String original = "vaishali jain apple";
 
 //convert string into char array
 
 char[] c = original.toCharArray();
 
 //sort char array
 
java.util.Arrays.sort(c);

//convert array back to string

String sort = new String(c);

System.out.println(sort);

	}

}
