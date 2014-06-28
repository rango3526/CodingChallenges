package numberGuess;

import java.util.Scanner;

public class numberGuessClass {
	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		boolean run = true;
		while (run == true) {
			//declare variables
		
			int highRange;
			int lowRange = 0;
			int x;
			int y;
			double z;
			int n = 0;
			int i;
			int guess;
			int correct;
			int counter = 0;
			Scanner input = new Scanner(System.in);
	
			//tell computer range 399,247
	
			System.out.println("I will guess your number in between 0 and what number?");
			highRange = input.nextInt();
			z = Logarithm.log2(highRange);
			z = Math.round(z);
		
			System.out.println("I bet I can get it in " + z + " guesses at most.");
		
			for (i = 0; true; i++) {
			
				if (counter > z) {
					System.out.print("That is against the laws of physics. Would you like to restart? (1 is yes, 0 is no)");
					y = input.nextInt();
					if (y == 1) {
						break;
					}
					else {
						run = false;
						break;
					}
				
				}
				
				//makes guess
	
				x = (highRange - lowRange);
				guess = x/2 + lowRange;
	
				//if incorrect ask higher or lower and change the range variables
	
				System.out.println("Is it " + guess + "? Was my guess correct (1), or do I need to go lower (2) or higher (3)? Press 4 to restart and 5 to quit.");
				y = input.nextInt();
	
				if (y == 1) {
					counter++;
					System.out.println("I got the answer in " + counter + " guesses.");
					if (z - counter == 0) {
						System.out.println("It took me exactly how many guesses I thought it would.");
					}
					else {
						System.out.println("It took " + (z - counter) + " less guesses than I thought.");
					}
					break;
				}
				else if (y == 2) {
					highRange = guess;
					counter++;
				}
				else if (y == 3) {
					lowRange = guess;
					counter++;
				}
				else if (y == 4) {
					break;
				}
				else if (y == 5) {
					run = false;
					break;
				}
				else {
					System.out.println("You must enter in a 1, 2, or 3.");
				}
			}
		}
		}
	}
