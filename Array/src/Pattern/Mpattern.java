package Pattern;

public class Mpattern {

	public static void main(String[] args) {
		for (int r = 1; r <= 5; r++) {
			for (int c = 1; c <= 3; c++) {
				if ((c == 1) && ((r == 1) || (r == 2) || (r == 3) || (r == 4) || (r == 5))) {
					System.out.print("*" + " ");
				} else if ((c == 3) && ((r == 1) || (r == 2) || (r == 3) || (r == 4) || (r == 5))) {
					System.out.print("*" + " ");
				}else if((c==2)&&(r==2)) {
					System.out.print("*"+" ");
				}else{
					System.out.print(" "+" ");
				}
			}System.out.println();

		}
		
	}

}
