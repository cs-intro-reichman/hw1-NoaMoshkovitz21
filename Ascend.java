// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend { 
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int[] numbers ={0,0,0};
		for(int i=0;i<3;i++){

			numbers[i] = (int)((double)lim*Math.random());
		}

		int min_ab = Math.min(numbers[0],numbers[1]);
		int max_ab = Math.max(numbers[0],numbers[1]);

		int min_bc = Math.min(numbers[1],numbers[2]);
		int max_bc = Math.max(numbers[1],numbers[2]);

		int low  = Math.min(min_ab,min_bc);
		int high = Math.max(max_ab,max_bc);
		int mid  = numbers[0]+numbers[1]+numbers[2] - low -high ; 

		System.out.println(numbers[0]+" "+numbers[1]+" "+numbers[2]);
		System.out.println(low +" " + mid + " " + high);
		
	}
}
