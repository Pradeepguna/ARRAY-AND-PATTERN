package Array;

public class Shiftingtwoelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,10,15,20,25};
		//int a1[]={15,20,25,5,10};
		int i=0;
		while(i<3)
		{
			a[i]=a[i+2];
			i++;
			System.out.println(i);
		}

	}

}
