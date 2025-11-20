package _13_Array_Jedi;

import java.util.Scanner;

public class _11_Destacar {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que rellene un array de 100 elementos con números enteros
		 * aleatorios comprendidos entre 0 y 500 (ambos incluidos).
		 * 
		 * A continuación el programa mostrará el array y preguntará si el usuario
		 * quiere destacar el máximo o el mínimo.
		 * 
		 * Seguidamente se volverá a mostrar el array escribiendo el número destacado
		 * entre dobles asteriscos.
		 */

		int[] arrayR = new int[100];
		Scanner input = new Scanner(System.in);
		int minMax;
		int min;
		int max;

		for (int i = 0; i <= arrayR.length - 1; i++) {
			arrayR[i] = (int) (Math.random() * 501);
		}
		
		min = arrayR[0];
		max = arrayR[0];

		for (int i : arrayR)
			System.out.print(i + " ");

		System.out.println("\n\nQue quieres destacar: el mínimo (1), o el máximo (2)");
		minMax = input.nextInt();

		for (int i = 0; i <= arrayR.length - 1; i++) {
			if (min > arrayR[i])
				min = arrayR[i];

			if (max < arrayR[i])
				max = arrayR[i];
		}
		
		if (minMax == 1) {
			for (int i = 0; i <= arrayR.length - 1; i++) {

				if (arrayR[i] != min)
					System.out.print(arrayR[i] + " ");
				else
					System.out.print("**" + arrayR[i] + "** ");
			}
		}

		if (minMax == 2) {
			for (int i = 0; i <= arrayR.length - 1; i++) {

				if (arrayR[i] != max)
					System.out.print(arrayR[i] + " ");
				else
					System.out.print("**" + arrayR[i] + "** ");
			}
		}

		input.close();
	}

}
