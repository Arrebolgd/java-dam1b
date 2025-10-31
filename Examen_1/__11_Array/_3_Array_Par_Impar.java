package __11_Array;

public class _3_Array_Par_Impar {
	public static void main(String args[]) {
		/*
		 * Imprimir en pantalla los elementos del siguiente array {2, 3, 4, 7, 8, 10, 11} 
		 * indicando para cada uno de ellos si es par o impar.
		 */
		
		int[] arrayNumbers = {2, 3, 4, 7, 8, 10, 11};
		
		for(int i: arrayNumbers) {
			if(i%2 == 0)
				System.out.println(i + " es par.");
			else
				System.out.println(i + " es impar.");
		}
	}
}
