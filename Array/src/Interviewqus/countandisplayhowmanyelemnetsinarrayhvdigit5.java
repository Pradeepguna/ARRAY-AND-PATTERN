package Interviewqus;

public class countandisplayhowmanyelemnetsinarrayhvdigit5 {

	public static void main(String[] args) {
		int a[]={12,15,100,22};
		int len=a.length;
		int count=0;
		int i=0;
		while(i<len)
		{
			if(a[i]%10==5)
			{
			count++;
			
		}
			i++;
		
		}
		System.out.println(count);
	}

}
