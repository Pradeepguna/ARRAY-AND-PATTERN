package Interviewqus;

public class pattern {

	public static void main(String[] args) {
		for (int r = 1; r <= 5; r++) {
			int a = r;
			for (int c = 1; c <= r; c++) {
				System.out.print(" "+ a);
				a++;
			}System.out.println("");
		}
		
	}

}
