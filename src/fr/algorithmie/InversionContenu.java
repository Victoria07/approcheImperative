package fr.algorithmie;

import java.util.Arrays;

public class InversionContenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		int[] arrayCopie = new int[array.length];
		int index = 0;
		for(int i = array.length-1 ; i >= 0 ; i--) {
			arrayCopie[index] = array[i];
			index++;
			
			System.out.println(array[i] + " " + arrayCopie[i]);
		}
		
		
	}

}
