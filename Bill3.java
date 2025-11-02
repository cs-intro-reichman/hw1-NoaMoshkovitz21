// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int bill  = Integer.parseInt(args[3]);
		int each  = bill / 3 ; 
		System.out.println("The guests are: " + name3 +"," + name2 + "," + name1 + "and the bill for each is: " + each);
	    // Replace this comment with the rest of your code   
	}
}
