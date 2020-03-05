package Array;

public class Onearrayfromanotherarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array={3,8,2,5,4};

int len=array.length;
	int [] array1=new int[len];
	int i=0,j=array.length-1;
	while(i<array.length)
		{
		array1[i]=array[j];
		System.out.println(array1[i]);
		i++;
		j--;
		
		}
	
		}

}
