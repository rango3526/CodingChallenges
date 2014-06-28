package Fibonacci;

public class fibonacciClass {
	
	public static void main(String[] args) {
		
		// make variables (to store the sequence numbers [array], plus 0 and 1)
		
		int length = 40;
		int[] stored = new int[length];
		int x = 0;
		int y = 1;
		int z;
		stored[0] = x;
		stored[1] = y;
		int i;
		int l;
		
		//find the sum of the last two numbers
		
		for (i = 2; i < length; i++) {
			// find the sum of the last 2 numbers(x,y)
			z = (x + y);
			//store the sum
			stored[i] = z;
			// set x and y to the last two numbers
			x = stored[i - 1];
			y = stored[i];
			//restart to find the next number
		}
		for (l = 0; l < length; l++) {
			System.out.println(stored[l]);
		}
	}
}
