package __12_Array_Padawan;

import java.util.Scanner;

public class _1_Numeros_Reales {

	public static void main(String arg[]) {

		/*
		 * Crea un programa que pida diez números reales por teclado, los almacene en un
		 * array, y luego muestre todos sus valores.
		 */

		double[] numerosReales = new double[10];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i <= numerosReales.length-1; i++) {
			
			System.out.println("· Introduce el nº " + (i + 1) + ":");
			numerosReales[i] = input.nextDouble();
		}
		for(double j : numerosReales) {
			System.out.println(j);
		}
		
		input.close();
	}
}
