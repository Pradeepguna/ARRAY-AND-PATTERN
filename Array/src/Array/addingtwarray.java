package Array;

public class addingtwarray {

	public static void main(String[] args) {
		int[]arr1={5,8,2,3};
		int[]arr2={1,2};
		int len1=arr1.length;
		int len2=arr2.length;
		int len=len1>len2?len1:len2;
		int []result=new int[len];
		int addcount=len1<len2?len1:len2;
		int i=0;
		while(i<addcount)
		{
			result[i]=arr1[i]+arr2[i];
			i++;
		}
System.out.println(i);
while(i<len)
{
result[i]=arr1[i];
i++;
}
i=0;
while(i<len){
System.out.println(result[i]);
i++;
	}

}
}
