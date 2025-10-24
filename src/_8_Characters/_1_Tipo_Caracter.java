package _8_Characters;

import java.io.IOException;

public class _1_Tipo_Caracter {

	public static void main(String args[]) throws IOException {
		/*
		 * Captura un caracter e indica si es una letra, un dígito o cualquier otro tipo
		 * de carácter. 
		 * Si es una letra debe indicar además si está en mayúscula o minúscula.
		 */
		
		System.out.println("· Introduce un caracter: ");
		char tipoCaracter = (char) System.in.read();
		
		if(Character.isAlphabetic(tipoCaracter)) {
			System.out.print("Es una letra");
			if(Character.isUpperCase(tipoCaracter)) {
				System.out.print(" mayuscula\n");
			}else {
				System.out.print(" minuscula\n");
			}
		}else if (Character.isDigit(tipoCaracter)) {
			System.out.println("Es un número");
		}else {
			System.out.println("No es ni letra ni número");
		}
	}
}
