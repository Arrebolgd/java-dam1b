package _14_Manipulacion_Arrays;

import java.util.Arrays;

public class _1_Ordenar_Mostrar {

	public static void main(String[] args) {

		/*
		 * Hacer un programa que ordene el  array  {23, 1, 45, 2, 87, 1, 22, 4, 8, 9, 12}  de menor a mayor y lo muestre por consola
		 */
		
		int[] array1 = {23, 1, 45, 2, 87, 1, 22, 4, 8, 9, 12};
		
		Arrays.sort(array1);
		
		for(int i : array1)
			System.out.println(i);
	}

}
