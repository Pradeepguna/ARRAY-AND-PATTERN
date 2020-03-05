package Pattern;

public class Epattern {

	public static void main(String[] args) {
	for(int row=1;row<=5;row++)
	{
		for(int col=1;col<=5;col++)
		{
			if((row==1)||(row==3)||(row==5))
			{
				System.out.print("*");
			}else if((col==1)&&((row==2)||(row==4)))
			{
				System.out.print("*");
			}
		}
	System.out.println();
	}
	}

}
