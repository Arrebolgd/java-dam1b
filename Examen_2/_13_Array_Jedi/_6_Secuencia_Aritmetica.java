package _13_Array_Jedi;

import java.util.Scanner;

public class _6_Secuencia_Aritmetica {

	public static void main(String[] args) {

		/*
		 * Crea un programa que permita al usuario almacenar una secuencia aritmética en
		 * un array y luego mostrarla. Una secuencia aritmética es una serie de números
		 * que comienza por un valor inicial V, y continúa con incrementos de I.
		 * 
		 * Por ejemplo, con V=1 e I=2, la secuencia sería 1, 3, 5, 7, 9…
		 * 
		 * Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… 
		 * 
		 * El programa solicitará al usuario V, I además de N (nº de valores a crear).
		 */

		Scanner input = new Scanner(System.in);
		int arrayLenght;
		final int V;
		final int I;
		
		System.out.println("Numero V: ");
		V = input.nextInt();
		
		System.out.println("Numero I: ");
		I = input.nextInt();
		
		System.out.println("Numero de Valores: ");
		arrayLenght = input.nextInt();
		
		int[] secuencia = new int[arrayLenght];
		
		for(int j = 0; j <= secuencia.length-1; j++) {
			secuencia[j] = V + (I * j);
		}
		
		for(int j : secuencia)
			System.out.println(j);
		
		
		input.close();
	}

}
