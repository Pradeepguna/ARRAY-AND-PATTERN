package Array;

public class shiftingelementstowardsleft {

	public static void main(String[] args) {
int[]m={12,13,14,15,16};
int i=0;
int temp=m[i];
System.out.println(m[4]);
while(i<m.length-1)
{
	m[i]=m[i+1];
	i++;
}
m[i]=temp;
System.out.println(m[4]);
	}

}
