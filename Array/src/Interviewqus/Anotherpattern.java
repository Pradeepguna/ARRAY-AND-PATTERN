package Interviewqus;

public class Anotherpattern {

	public static void main(String[] args) {
		int i=1,j=2;
		for(int r=1;r<=5;r++){
		
			for(int c=1;c<=r;c++){
				if(r%2==0){
					System.out.print(j+" ");
					j=j+2;
				}else{
					System.out.print(i+" ");
					i=i+2;
				}
			}System.out.println();
		}

	}

}
