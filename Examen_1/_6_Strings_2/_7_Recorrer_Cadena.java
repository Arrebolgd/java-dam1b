package _6_Strings_2;

public class _7_Recorrer_Cadena {

	public static void main(String args[]) {
		/*
		 * Crea un programa que muestre cada una de las letras de una frase en una
		 * línea, exceptuando los espacios. 
		 * Probar con "Esta es la frase del Ejercicio 5".
		 */
		
		String frase = "Esta es la frase del Ejercicio 5";
		
		for (int i = 0; i < frase.length(); i++) {
			
			if(frase.charAt(i) != ' ') {
				System.out.println("· " + frase.charAt(i));
			}
			
		}
	}
}
