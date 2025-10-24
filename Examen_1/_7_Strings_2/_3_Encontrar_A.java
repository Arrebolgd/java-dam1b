package _7_Strings_2;

public class _3_Encontrar_A {

	public static void main(String args[]) {

		/*
		 * Obtener en qué posición está la cuarta ‘a’ en una frase. Si la frase tiene
		 * menos de 4 aes tiene que indicarlo. 
		 * “Probarlo con “Esta es una frase con unas cuantas aes”
		 * 
		 */
		String frase = "Esta es una frase con unas cuantas aes";
		// String frase2 = "aaab";
		int contador = 0;
		
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
				contador++;
			}
			if(contador == 4) {
				System.out.println(contador);
				break;
			}
		}
		if(contador < 4) {
			System.out.println("La frase tiene menos de 4 aes");
		}
	}
}
