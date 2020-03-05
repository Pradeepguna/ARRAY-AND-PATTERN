package Array;

public class Linearsearch {

	public static void main(String[] args) {
		int[] array = { 12, 13, 14, 15, 16 };
		boolean kind=false;
	
		for(int i=0;i < array.length;i++) {
			if (array[i] == 12) {
				kind=true;
				System.out.println(i);
				break;
			} 
			}
		if(kind==false) {
			System.out.println("not");
		
		}

	}
}
