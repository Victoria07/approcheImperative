package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {6, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 6} ;

		boolean verifier = false; 
		
		if(array.length > 0 ) {
			
			if( array[0] == 6 || array[array.length-1] == 6 ) {
				verifier = true; 
			}
			else verifier = false; 
			
			System.out.println(verifier);
		}
	}

}
