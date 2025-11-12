package __12_Array_Padawan;

import java.util.Scanner;

public class _3_Maximo_Minimo {

	public static void main(String[] args) {

		/*
		 * Crea un programa que pida diez números reales por teclado, los almacene en un
		 * array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por
		 * pantalla.
		 */
		
		double[] numerosReales = new double[10];
		
		Scanner input = new Scanner(System.in);
		
		double max = 0, min = 0;
		
		for(int i = 0; i <= numerosReales.length-1; i++) {
			System.out.println("· Introduce el nº " + (i + 1) + ":");
			numerosReales[i] = input.nextDouble();
		}
		
		for(double j : numerosReales) {
			if(max < j) {
				max = j;
			}
			if(min > j) {
				min = j;
			}
		}
		System.out.println("· El numero mayor es: " + max + " y el menor es: " + min);
		
		input.close();
	}

}
