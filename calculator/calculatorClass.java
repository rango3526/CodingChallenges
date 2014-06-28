package calculator;

import java.util.Scanner;

public class calculatorClass {
	
	public static void main(String[] args) {
		while (true) {
			
			Scanner input = new Scanner(System.in);
		
			float x;
		
			float y;
		
			int z;

			int r;

			//ask for first number
		
			System.out.println("Input the first number.");
		
			x = input.nextInt();
		
			//ask for second number
	
			System.out.println("Input the second number.");
		
			y = input.nextInt();
		
			//ask for operation
	
			System.out.println("===Menu===");
			System.out.println("<1> Addition");
			System.out.println("<2> Subtraction");
			System.out.println("<3> Multiplication");
			System.out.println("<4> Division");
		
			z = input.nextInt();
		
			//use the operation
		
			if (z == 1) {
				System.out.println(x + " + " + y + " = " + (x+y));
			}
			else if (z == 2) {
				System.out.println(x + " - " + y + " = " + (x-y));
			}
			else if (z == 3) {
				System.out.println(x + " * " + y + " = " + (x*y));
			}
			else if (z == 4) {
				System.out.println(x + " / " + y + " = " + (x/y));
			}
		 
			System.out.println("Type 1 to restart, or 0 to quit.");
		 
			r = input.nextInt();
			
			if (r != 1) {
				break;
			}
		 
		}
		 
	}
}
