package _8_Characters;

import java.util.Scanner;

public class _2_Frase {

	public static void main(String args[]) {
		/*
		 * Capturar por pantalla una frase cualquiera.
		 * 
		 * El programa debe calcular y mostrar por pantalla cuántas letras, dígitos y
		 * espacios en blanco hay recorriendo la cadena.
		 */

		int contadorLetra = 0, contadorDigito = 0, contadorWhitespace = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		
		String phrase = input.nextLine();

		if(phrase.length() > 0) {
			for (int i = 0; i < phrase.length(); i++) {
				if (Character.isAlphabetic(phrase.charAt(i))) {
					contadorLetra++;

				} else if (Character.isDigit(phrase.charAt(i))) {
					contadorDigito++;

				} else if (Character.isWhitespace(phrase.charAt(i))) {
					contadorWhitespace++;
					
				}
			}
		}
		System.out.println("· Hay " + contadorLetra + " letras, " + contadorDigito + " digitos, " + contadorWhitespace
				+ " espacios en blanco.");

		input.close();
	}
}
