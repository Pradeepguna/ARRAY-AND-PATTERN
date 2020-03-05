package Array;

public class howmanytimeoneelement {

	public static void main(String[] args) {
		int []array={10,20,10,30,40,10,25,20};
		int search1=10,search2=20,count1=0,count2=0,i=0;
		while(i<array.length)
		{
				if(array[i]==search1)
			{
				count1++;
			}
				else if(array[i]==search2)
				{
					count2++;
				}
			
	
		i++;
		}
		System.out.println(count1);
		System.out.println(count2);

	
	}
}
