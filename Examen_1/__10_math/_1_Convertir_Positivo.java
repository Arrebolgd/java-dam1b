package __10_math;

import java.io.IOException;
import java.util.Scanner;

public class _1_Convertir_Positivo {

	public static void main(String args[]) throws IOException {
		/*
		 * Capturamos un número entero por teclado. 
		 * Si el usuario teclea un número negativo lo convertimos en positivo y se lo mostramos al usuario. 
		 * Deseamos saber cuántos números han sido introducidos y cuántos de ellos han tenido que
		 * ser convertidos a positivos.
		 */
		
		int numerosIntroducidos = 0, numerosConvertidos = 0;
		int numero;
		Scanner input = new Scanner(System.in);
		char continuar = 'S';
		while(continuar == 'S'){
			System.out.println("· Introduce un número entero (positivo o negativo): ");
			numero = input.nextInt();
			
			if (numero < 0) {
				numero = Math.abs(numero);
				numerosConvertidos++;
			}
			System.out.println("· Número Introducido en positivo: " + numero + "· Números Convertidos: " + " · Números Totales Facilitados: " + numerosIntroducidos);
			numerosIntroducidos++;
			
			System.out.println("· Quieres continuar ? S/N");
			
			continuar = (char)System.in.read();
			continuar = Character.toUpperCase(continuar);
		}
		System.out.println("Saliendo del programa...");
		
		input.close();
	}
}
