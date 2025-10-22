package _6_Strings;

public class _8_Buscar_Espacios {

	public static void main(String args[]) {
		/*
		 * Crea un programa que obtenga en qué posición aparece por primera vez un
		 * espacio.
		 *  Y después del primer espacio en qué posición aparece el tercer espacio. 
		 *  
		 *  Prueba con la frase "En esta frase hay varios espacios"
		 */
		
		String frase = "En esta frase hay varios espacios";
		
		int contador = 0;
		
		for(int i = 0; i < frase.length(); i++) {
			
			if(frase.charAt(i) == ' ') {
				contador++;
				
				if(contador == 1 || contador == 3) {
					System.out.println("· " + i);
				}
			}
		}
	}
}
