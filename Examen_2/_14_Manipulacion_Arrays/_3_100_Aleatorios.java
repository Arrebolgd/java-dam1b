package _14_Manipulacion_Arrays;

import java.util.Arrays;

public class _3_100_Aleatorios {

	public static void main(String[] args) {
		/*
		 * Crear un un array de tamaño 100 de  números tipo double.
		 * Rellénalo con valores aleatorios entre 5 y 9  ( utiliza el método random de la clase Math).
		 * 
		 * Ordena el array y muéstralo por pantalla.
		 */
		
		double[] arrayChachi = new double[100];
		
		for(int i = 0; i <= arrayChachi.length-1; i++)
			arrayChachi[i] = Math.random() * 4 + 5;
		
		Arrays.sort(arrayChachi);
		
		for(double i : arrayChachi)
			System.out.println(i);
	}

}
