package Array;

public class printingnegativelements {

	public static void main(String[] args) {
	int[] a={-3,5,-8,2};
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<0)
		{
			count++;
		}
	}
int [] result=new int[count];
int j=0;
for(int i=0;i<a.length;i++)
{
	if(a[i]<0)
	{
		result[j]=a[i];
		j++;
	}
}
for(int i=0;i<result.length;i++)
{
System.out.println(result[i]);
	}

}
}
