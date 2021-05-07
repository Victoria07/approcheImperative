package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Boucle for qui affiche les nombres de 1 à 10");
		for (int i = 0 ; i < 11; i++) {
			System.out.println(i);
		} 
		
		System.out.println("\n\rBoucle for qui affiche les nombres paire de 1 à 10");
		for (int paire = 0 ; paire < 10; paire+=2) {
			System.out.println(paire);
		}
		
		System.out.println("\n\rBoucle for qui affiche les nombres impaire de 1 à 10");
		for (int impaire = 1 ; impaire < 10; impaire+=2) {
			System.out.println(impaire);
		}
		
		System.out.println("\n\rBoucle While qui affiche les nombres de 1 à 10");
		int i = 0;
		while ( i < 11) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("\n\rBoucle While qui affiche les nombres paire de 1 à 10");
		int paire = 0;
		while(paire <11) {
			System.out.println(paire);
			paire+=2;
		}
		
		System.out.println("\n\rBoucle While qui affiche les nombres paire de 1 à 10");
		int impaire = 1;
		while(impaire <10) {
			System.out.println(impaire);
			impaire+=2;
				}
	}

}
