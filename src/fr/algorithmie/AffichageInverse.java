package fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		System.out.println("\n\rBoucle for qui affiche les nombres du tableau");
		for(int i = 0 ; i < array.length ; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("\n\rBoucle for qui affiche les nombres du tableau inversé");
		for(int i = array.length-1 ; i >= 0  ; i--) {
			System.out.println(array[i]);
		}
		
		System.out.println("\n\rCopie d'un tableau dans un nouveau tableau");
		int[] arrayCopie = Arrays.copyOf(array, array.length);
		
		for(int i = 0; i < arrayCopie.length; i++) {
			System.out.println(arrayCopie[i]); 
		}
		
		System.out.println("\n\r Autre manière de Copier un tableau dans un nouveau tableau");
		int[] monNouveauTableau = new int[array.length];
		for(int item=0; item<monNouveauTableau.length;item++) {
		monNouveauTableau[item]=array[item];
		System.out.println(monNouveauTableau[item]);
		}
	}

}
