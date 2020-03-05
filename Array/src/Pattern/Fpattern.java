package Pattern;

public class Fpattern {

	public static void main(String[] args) {
      for(int row=1;row<=5;row++)
      {
    	  for(int col=1;col<=4;col++)
    	  {
    		  if((row==1)||(row==3)||(col==1))
    		  {
    			  System.out.print("*"+" ");
    		  }else
    		  {
    		  
    			  System.out.print(""+" ");
    		  }
    	 
    	  
      }
System.out.println();
	}

}
}