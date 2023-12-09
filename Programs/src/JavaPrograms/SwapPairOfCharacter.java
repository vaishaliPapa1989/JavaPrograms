package JavaPrograms;

public class SwapPairOfCharacter {

	public static void main(String[] args) {
		 String original = "aaryav";
		 
		 char [] c = original.toCharArray();
		 
		 for (int i=0;i<c.length-1;i+=2) {
			 
			 char temp =c[i];
			 c[i]= c[i+1];
			 c[i+1]=temp;
			 
			 
	String Updated = new String(c);	 
			 System.out.println(Updated);
			 
		 }

	}

}
