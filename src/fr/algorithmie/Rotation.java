package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4} ;
		int tampon = 0 ;

			for (int i = 0; i < array.length-1; i++) {
				array[0] = tampon;
				array[i] = array[i+1];
				System.out.println(array[i]);
			}
	}
	
}
