package fr.algorithmie;



public class ComparaisonTableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		
		int[] valeurCommunes = compareArray(array1,array2);
		for (int element : valeurCommunes) {
			System.out.println(element);
		}
	}

	private static int[] push(int[] array, int elementPush) {
		int[] newArray = new int[array.length+1];
		
		//Copie de array dans newArray 
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i] ; 
		}
		
		//Push de element dans newArray
		newArray[newArray.length-1] = elementPush;
		
		return newArray;
	}
	
	private static boolean isExist(int element, int[]array) {
		boolean exist = false; 
		for (int elementInArray : array) {
			if(elementInArray == element) {
				exist = true; 
				break;
			}		
		}
		return exist;
	}
	
	private static int[] compareArray(int[] array1, int[] array2) {
		int[] nombreStocke = new int[0];
		for (int elementArray1 : array1) {
			for (int elementArray2 : array2) {
				if(elementArray1 == elementArray2 && !isExist(elementArray1, nombreStocke)) {	
					nombreStocke = push(nombreStocke, elementArray1);
				}
			}
		}
		return nombreStocke;
	}

}
