package __12_Array_Padawan;

import java.util.Scanner;

public class _4_Suma_Positivo_Negativo {

	public static void main(String[] args) {

		/*
		 * Crea un programa que pida veinte números enteros por teclado, los almacene en
		 * un array y luego muestre por separado la suma de todos los valores positivos
		 * y la suma de los negativos.
		 */
		
		int[] enteros = new int[20];
		Scanner input = new Scanner(System.in);
		int sumaPositivos = 0, sumaNegativos = 0;
		
		
		for(int i = 0; i <= enteros.length-1; i++) {
			System.out.println("· Introduce el nº " + (i + 1) + ": ");
			
		}
		
		for(int j : enteros) {
			if(j > 0) {
				sumaPositivos += j;
			}
			if(j < 0) {
				sumaNegativos += j;
			}
		}
		
		System.out.println("· Suma de positivos: " + sumaPositivos);
		System.out.println("· Suma de negativos: " + sumaNegativos);
		
		input.close();
	}
}
