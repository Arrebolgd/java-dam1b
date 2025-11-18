package _13_Array_Jedi;

import java.util.Scanner;

public class _3_Altura_Medias {

	public static void main(String[] args) {

		/*
		 * Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
		 * 
		 * Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. 
		 * 
		 * Luego mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y por debajo de la media.
		 */
		
		double media, maxima, minima;
		int encima, debajo;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce cuantas alturas vas a comparar: ");
		int longitudArray = input.nextInt();
		
		double[] alturas = new double[longitudArray];
		
		for(int i = 0; i <= longitudArray-1; i++) {
			System.out.println("Introduce el valor nº " + (i+1) + " de " + longitudArray + " valores");
			alturas[i] = input.nextDouble();
		}
		
		media = 0; maxima = alturas[0]; minima = alturas[0];
		
		for(double i : alturas) {
			media += i;
			
			if(maxima < i)
				maxima = i;
			
			if(minima > i)
				minima = i;
		}
		System.out.printf("· Media: %.2f Máxima: %.2f Mínimo: %.2f\n", (media/longitudArray), maxima, minima);

		
		debajo = 0; encima = 0;
		for(double i : alturas) {
			if(i < media/longitudArray)
				debajo++;
			if(i > media/longitudArray)
				encima++;
		}
		System.out.println("Hay " + debajo + " por debajo de la altura media y " + encima + " por encima de la altura media");
		input.close();
	}

}
