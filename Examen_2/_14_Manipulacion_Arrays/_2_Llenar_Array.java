package _14_Manipulacion_Arrays;

import java.util.Arrays;

public class _2_Llenar_Array {

	public static void main(String[] args) {
		/*
		 * Crea un un array de números  de tipo int y tamaño 10.
		 * Usando el método fill de Arrays modifica todos los valores del array con  el valor 2.
		 * 
		 * Muestra el array por consola.
		 * 
		 * Luego, usando el método fill de Arrays dale a los 5 primeros elementos el valor 10.
		 * 
		 * Muestra el array por consola.
		 */
		
		int[] arrayChachi = new int[10];
		
		Arrays.fill(arrayChachi, 2);
		
		for(int i : arrayChachi)
			System.out.print(i);

		System.out.print("\n");
		
		Arrays.fill(arrayChachi, 0, 4, 10);
		
		for(int i : arrayChachi)
			System.out.print(i);
	}

}
