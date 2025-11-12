package __11_Array;

public class Fernandez_Manuel_11_Varios_Re {

	public static void main(String args[]) {
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
		int valorArray1;

		int[] array2 = new int[20];
		int valorArray2;

		int[] array3 = new int[30];
		int IndiceExtra;
		int posicion5;

		// Initialize
		valorArray2 = 20;
		valorArray1 = 100;
		
		for (int i = 0; i <= array2.length - 1; i++) {

			array2[i] = valorArray2;
			valorArray2--;

			if (i <= array1.length - 1) {
				array1[i] = valorArray1;
				valorArray1++;
			}
		}

		IndiceExtra = 0;
		posicion5 = 0;
		
		for (int i = 0; i <= array3.length - 1; i++) {
			if (i <= 19)
				array3[i] = array2[i];

			if (i >= 20) {
				array3[i] = array1[IndiceExtra];
				IndiceExtra++;
			}
			if (array3[i] == 5)
				posicion5 = i;
		}
		
		IndiceExtra = 0;
		
		for (int i = 0; i <= array2.length - 1; i++) {
			
			switch (i) {
			case 2, 3, 4:
				array1[i] = array2[IndiceExtra];
				IndiceExtra++;
				break;
			case 5, 6, 7, 8:
				array2[i] = 99;
				array1[i] = array2[i];
				break;
			}
		}

		System.out.println("· La posición es la " + posicion5);

		System.out.print("· Array1: ");
		for (int i : array1)
			System.out.print(i + " ");

		System.out.print("\n");

		System.out.print("· Array2: ");
		for (int i : array2)
			System.out.print(i + " ");

		System.out.print("\n");

		System.out.print("· Array3: ");
		for (int i : array3)
			System.out.print(i + " ");

	}
}
