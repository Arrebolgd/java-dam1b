package _13_Array_Jedi;

import java.util.Scanner;

public class _1_Array_Aleatorio {

	public static void main(String[] args) {

		/*
		 * Crea un programa que cree un array con 100 números reales aleatorios entre
		 * 0.0 y 1.0, utilizando Math.random(), y luego le pida al usuario un valor real
		 * R. 
		 * Por último, mostrará cuántos valores del array son igual o superiores a R.
		 */
		
		double[] cienNumeros = new double[100];
		Scanner input = new Scanner(System.in);
		double var;
		
		System.out.println("Introduce un número entre 0 y 1");
		var = input.nextDouble();
		
		int contador = 0;
		
		for(int i = 0; i <= 99; i++) {
			cienNumeros[i] = (double) Math.random();
			if(cienNumeros[i] > var) {
				contador++;
			}
		}
		
		System.out.println("Hay " + contador + " numeros mayores que los introducidos en el usuario.");
		input.close();
	}
}
