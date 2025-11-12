package __11_Array;

import java.util.Scanner;

public class Fernandez_Manuel_6_Maximo_Minimo {

	public static void main(String args[]) {
		/*
		 * Crea un array de 10 elementos de tipo entero, introduce 10 valores por
		 * teclado y almacénalos en los elementos del array. Después calcula y muestra
		 * por pantalla el valor máximo y mínimo
		 */
		
		int[] arrayInputs = new int[10];
		int min = 0, max = 0;
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i <= arrayInputs.length-1; i++) {
			
			System.out.println("· Introduce el valor nº " + (i + 1) + ": ");
			arrayInputs[i] = input.nextInt();
			
			if(i == 0) {
				max = arrayInputs[i];
				min = arrayInputs[i];
			}
			
			if(arrayInputs[i] < min) {
				min = arrayInputs[i];
			}
			
			if(arrayInputs[i] > max) {
				max = arrayInputs[i];
			}
		}
		
		System.out.println(" El número máximo es: " + max);
		System.out.println(" El número mínimo es: " + min);
		input.close();
	}
}
