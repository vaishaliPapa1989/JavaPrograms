package JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {

    String myString = "Vaishali rani ";
     
    //converting string to character array
    
    char[] c = myString.toCharArray();
    
    //First way reverse the char array--this loop iterates through array from both the ends 
    
	/*
	 * for (int i=0,j=c.length-1;i<j;i++,j--) {
	 * 
	 * 
	 * char temp = c[i]; c[i]=c[j]; c[j]= temp;
	 * 
	 * }
	 */
    
    // Second way
    String reverse="";
     for (int i=c.length-1;i>=0;i--) {
    	 reverse = reverse+c[i];
    	
    	 
     }
     System.out.println(reverse);
 //convert array back to string
    
	/*
	 * String revString = new String(c);
	 * 
	 * System.out.println(revString);
	 */
 

	}

}
