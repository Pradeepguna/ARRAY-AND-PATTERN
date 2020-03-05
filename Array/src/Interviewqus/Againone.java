package Interviewqus;

public class Againone {

	public static void main(String[] args) {

		for (int r = 1; r <= 5; r++) {
			int i = 1, j = 9;
			for (int c = r; c <= 5; c++) {
				if (r % 2 == 1) {
					System.out.print(i+" ");
					i = i + 2;
				} else {
					System.out.print(j+" ");
					j = j - 2;
				}
			}
			System.out.println();
		}
	}
}