package __11_Array;

public class _11_Varios {

	public static void main(String[] args) {

		/*
		 * Crea un programa en Java en un único fichero en el que esté uno a
		 * continuación del otro estos ejercicios;
		 * 
		 * Crea un array1 unidimensional de enteros de longitud 10 y rellénalo con los
		 * números que van del 100 en adelante.
		 * 
		 * Crea un array2 unidimensional de enteros de longitud 20 y rellénalo con los
		 * números que van del 20 hacia atrás.
		 * 
		 * Crea un array3 unidimensional de longitud 30 y rellénalo con los 20 elementos
		 * del array2 seguidos de los 10 elementos del array1.
		 * 
		 * Busca la posición en la que se encuentra el número 5 en el array3
		 * 
		 * Rellena en el array2 desde la posición 5 a la posición 8 con el numero 99
		 * 
		 * Copia en el array1 desde la posición 2, los 6 primeros elementos del array2
		 * 
		 * Muestra los valores finales de los tres arrays.
		 */

		int[] array1 = new int[10];
		int valorArray1 = 100;

		int[] array2 = new int[20];
		int valorArray2 = 20;

		int[] array3 = new int[30];
		int indiceArray1paraArray3 = 0;

		for (int i = 0; i <= array2.length - 1; i++) {

			array2[i] = valorArray2;
			valorArray2--;

			if (i <= array1.length - 1) {
				array1[i] = valorArray1;
				valorArray1++;
			}
		}
		for (int i = 0; i <= array3.length - 1; i++) {
			if (i <= 19) {
				switch (i) {
				case 5:
					array3[i] = array2[i];
					array2[i] = 99;
					break;
				case 6:
					array3[i] = array2[i];
					array2[i] = 99;
					break;
				case 7:
					array3[i] = array2[i];
					array2[i] = 99;
					break;
				case 8:
					array3[i] = array2[i];
					array2[i] = 99;
					break;
				default:
					array3[i] = array2[i];
				}
			}
			if (i >= 20) {
				switch (indiceArray1paraArray3) {
				
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				case 6:

					break;
				default:
					array3[i] = array1[indiceArray1paraArray3];
					indiceArray1paraArray3++;
				}
			}
			if (array3[i] == 5) {
				System.out.println("El numero 5 esta en la posición: " + i);
			}
		}

		for (int i : array1)
			System.out.print(i + " ");

		System.out.print("\n");

		for (int i : array2)
			System.out.print(i + " ");

		System.out.print("\n");

		for (int i : array3)
			System.out.print(i + " ");

	}

}
