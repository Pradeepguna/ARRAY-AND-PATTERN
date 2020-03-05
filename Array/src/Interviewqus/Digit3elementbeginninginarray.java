package Interviewqus;

public class Digit3elementbeginninginarray {

	public static void main(String[] args) {
		int a[] = {  3, 71,123, 34, 4444,534 };
		int len = a.length;
		int[] result = new int[len];
		int i, b, rem, j = 0;
		 int c = len - 1;
			for (i = 0; i < len; i++) {
				int count = 0;
				
				b = a[i];

				while (b > 0) {

					rem = b % 10;
					count++;
					b = b / 10;

				}

				if (count == 3) {
					result[j] = a[i];
					j++;
				}
				
			}
			for (i = 0; i < len; i++) {
				int count = 0;
				
				b = a[i];

				while (b > 0) {

					rem = b % 10;
					count++;
					b = b / 10;

				}

				if (count != 3) {
					result[j] = a[i];
					j++;
				}
			}			
			
			for (j = 0; j < len; j++) {
				System.out.println(result[j]);
			}
	}

}
