package fr.algorithmie;

public class SommeDeTableauDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;
		
		int[] somme = new int [array.length];
		
		for(int i = 0; i < array.length ; i++ ) {
			if(array2.length > i)
				somme[i] = array[i] + array2[i];
			else
				somme[i] = array[i];
			System.out.println(somme[i]);
		}
	}

}
