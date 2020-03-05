package Array;

public class Arrayfreq {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 10, 20, 30, 10, 20, 40, 50, };
		int freq[] = new int[arr.length];
		for (int j = 0; j < arr.length; j++) {
			int no = arr[j];
			int count = 1;
			for (int i = j + 1; i < arr.length; i++) {

				if (no == arr[i]) {
					count++;
					freq[i] = -1;
				}
			}
			if (freq[j] != -1) {
				freq[j] = count;
			}
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0)
				//if(freq[i]==1)    //=>unique elements find
				//if(freq[i]>1)  // =>duplicate elements find
			{ 
				System.out.println(arr[i] + " count : " + freq[i]);
			}
		}
		/*int max=Integer.MIN_VALUE;
		int index=0;
		{
			if(freq[i]>max)
			{
				max=freq[i];
				index=i;
			}
		}System.out.println([index]);*/

	}
}