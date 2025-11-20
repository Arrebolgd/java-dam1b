package _15_Manipulacion_Arrays_2;

import java.util.Arrays;

public class _5_Dividir_Arrays {

	public static void main(String[] args) {

		/*
		 * Coger el siguiente array [6, 9, 8, 10, 11]
		 * 
		 * y dividirlo por este otro posición a posición [2, 3, 4, 2, 3] y en el array
		 * resultado sumarle 10 a todos los valores menores de 4.
		 */
		
		int[] array1 = {6, 9, 8, 10, 11};
		int[] array2 = {2, 3, 4, 2, 3};
		int[] array3 = new int[array1.length];
		
		
		for(int i = 0; i <= array1.length-1; i++) {
			array3[i] = array1[i] / array2[i];
			if(array3[i] < 4)
				array3[i] += 10;
		}
		
		System.out.println("· Array3: " + Arrays.toString(array3));
	}

}
