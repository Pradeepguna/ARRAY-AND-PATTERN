package Pattern;

public class Apattern {

	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if ((col == 1) || (col == 5)) {
					if (row == 1) {
						System.out.print(" "+" ");
					} else {
						System.out.print("*"+" ");
					}
				} else if ((col == 4) || (col == 2)) {
					if ((row == 1) || (row == 3)) {
						System.out.print("*"+" ");
					
				} else {
					System.out.print(" "+" ");
				}
			}
				else if (col == 3) {
					if((row==1)||(row==3))
					{					
					
					System.out.print("*"+" ");
				}else
				{
					System.out.print(" "+" ");
				}
			}
		}
			System.out.println();
	}
}
}