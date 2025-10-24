package _7_Strings_2;

public class _1_Partir_Frase_4 {

	public static void main(String args[]) {

		/*
		 * Vamos a partir una frase en cuatro partes, para ellos:
		 * 
		 * Partiremos la frase en dos. A continuación partir cada una de las dos mitades
		 * en otras dos. Mostramos las cuatro partes. (Si en cualquier división el
		 * número es impar, la segunda mitad tendrá un carácter más). 
		 * 
		 * Probarlo con “Esta es la frase que vamos a partir en cuatro”
		 */
		
		String frase = "Esta es la frase que vamos a partir en cuatro";

		String frasem1, frasem2;
		
		frasem1 = frase.substring(0, frase.length()/2);
		frasem2 = frase.substring(frase.length()/2, frase.length());
		
		System.out.println(frasem1);
		System.out.println(frasem2);
		
		String fraseq1, fraseq2, fraseq3, fraseq4;
		
		// 0 hasta 1/4
		fraseq1 = frase.substring(0, frase.length()/4);
		// 1/4 hasta 1/2(o 2/4)
		fraseq2 = frase.substring(frase.length()/4, frase.length()/2);
		// 1/2(o 2/4) hasta 3/4
		fraseq3 = frase.substring(frase.length()/2, frase.length() * 3/4);
		// 3/4 hasta 4/4
		fraseq4 = frase.substring(frase.length()* 3/4, frase.length());
		
		System.out.println(fraseq1);
		System.out.println(fraseq2);
		System.out.println(fraseq3);
		System.out.println(fraseq4);
	}
}
