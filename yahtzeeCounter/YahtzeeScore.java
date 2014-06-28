package yahtzeeCounter;

public class YahtzeeScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[6];
		array[0] = 1;
		array[1] = 1;
		array[2] = 1;
		array[3] = 1;
		array[4] = 5;
		array[5] = 4;
		maxPoints(array);
	}
	public static int maxPoints(int[] toss) {
		//declare variables
		int i;
		int checkingVar;
		int c;
		int l;
		int[] stored = new int[6];
		int highestCheck = 0;;
		//check how many elements have the same value
		for (i = 0; i < 6; i++) {
			checkingVar = toss[i];
			int amtSame = 0;
			for (c = 0; c < 6; c++) {
				if (checkingVar == toss[c]) {
					amtSame += 1;
				}
			}
			stored[i] = amtSame*checkingVar;
			//System.out.println(stored[i]);
		}
		for (l = 0; l < 6; l++) {
			if (highestCheck < stored[l]) {
				highestCheck = stored[l];
			}
		}
		
		System.out.println(highestCheck);
		return highestCheck;
	}
}