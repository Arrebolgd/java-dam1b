package _13_Array_Jedi;

import java.util.Scanner;

public class _2_Apariciones_N {

	public static void main(String[] args) {
		/*
		 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
		 * valores enteros aleatorios entre 1 y 10 (utiliza Math. Random()). Luego
		 * pedirá un valor N y mostrará en qué posiciones del array aparece N.
		 */

		int[] cienNumeros = new int[100];
		Scanner input = new Scanner(System.in);
		int var;
		
		System.out.println("Introduce un número que quieres ver cuantas veces se repite");
		var = input.nextInt();
		
		System.out.println("Las posiciones en las que aparece el número son: ");
		
		for(int i = 0; i <= 99; i++) {
			
			cienNumeros[i] = (int) (Math.random()*10);

			if(cienNumeros[i] == var) {
				System.out.println(i);
			}
		}
		
		//System.out.println("Hay " + contador + " numeros mayores que los introducidos en el usuario.");
		input.close();
	}

}
