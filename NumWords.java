// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int mynum = Integer.parseInt(args[0]);
		
		int hundreds =  mynum / 100 ;
		int tens 	 = (mynum / 10 ) % 10 ; 
		int units    =  mynum % 10 ;


		System.out.println(hundreds + " " + "hundreds" + "," + " " + tens + " " + "tens"+ "," + " " + "and " + units +" ones.");
	}
}
