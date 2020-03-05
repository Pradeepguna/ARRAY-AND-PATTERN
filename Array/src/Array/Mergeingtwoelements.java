package Array;

public class Mergeingtwoelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={10,20,30};
		int [] b={5,15};
		int [] result=new int[a.length+b.length];
		/*int i;
		for( i=0;i<a.length;i++)
		{
			result[i]=a[i];
		
		}
		int k=0;
		for(int j=i;j<result.length;j++)
		{
			result[j]=b[k];
			k++;
		}
		for(i=0;i<result.length;i++)
		{
		System.out.println(result[i]);

	}*/
		//or_this_method
		int i=0,k=0;
		while(i<result.length)
		{
			if(i<a.length)
			{
				result[i]=a[i];
				
			}
			else{
				result[i]=b[k];
				k++;
			}
		i++;
	}
		for(i=0;i<result.length;i++)
		{
		System.out.println(result[i]);
		}
}
}