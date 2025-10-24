package _7_Strings_2;

public class _4_Contar_Palabras {

	public static void main(String args[]) {

		/*
		 * Obtener el número de palabras que hay en cualquier frase. Probarlo con “A ver
		 * cuántas palabras hay aquí.”
		 * 
		 * 
		 */
		
		String frase = "A ver cuántas palabras hay aquí.";
		int contador = 0;
		
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == ' ') {
				contador++;
			}
		}
		contador++;
		System.out.println("· Hay " + contador + " palabras");
	}
}
