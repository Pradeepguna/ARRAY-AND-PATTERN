package Array;

public class printingbetweentwonumbers {
	public static void main(String args[])
	{
		int s=0;
		int[] arr={1,5,8,15};
		while(s<arr.length-1)
		{
		int n1=arr[s];
		int n2=arr[s+1];
		int big=n1>n2?n1:n2;
		int small=n1<n2?n1:n2;
		for(int i=small+1;i<big;i++)
		{
			System.out.println(i);
		}
		s++;
	 	}
	
}
}