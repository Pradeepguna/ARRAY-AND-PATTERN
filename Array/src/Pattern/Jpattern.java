package Pattern;

public class Jpattern {

	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if ((col == 1) && ((row == 1) || (row == 4))) {
					System.out.print("*" + "");
				} else if ((col == 2) && ((row == 1) || (row == 5))) {
					System.out.print("*" + "");
				} else if ((col == 3) && ((row == 2) || (row == 1) || (row == 2) || (row == 3) || (row == 4))) {
					System.out.print("*" + " ");
				} else if (((col == 4) || (col == 5)) && (row == 1)) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}	System.out.println();
		}
	
	}

}
