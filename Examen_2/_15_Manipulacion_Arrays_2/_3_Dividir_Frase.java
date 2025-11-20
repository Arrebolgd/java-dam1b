package _15_Manipulacion_Arrays_2;

public class _3_Dividir_Frase {

	public static void main(String[] args) {
		/*
		 * Coger la frase “Esta es la frase que vamos a partir” y obtener un array donde
		 * en cada posición esté una palabra de la frase. No utilizar el método split()
		 * de la clase String.
		 * 
		 * Hasta el 11.
		 */

		String laFrase = "Esta es la frase que vamos a partir";
		String[] laOtraFrase;
		String word = "";
		int largoOtraFrase = 0;
		int jIndex = 0;
		
		for(int i = 0; i <= laFrase.length()-1; i++)
			if(laFrase.charAt(i) == ' ')
				largoOtraFrase++;
				
		laOtraFrase = new String[largoOtraFrase+1];
		
		
		for(int i = 0; i <= laFrase.length()-1; i++) {
			word += laFrase.charAt(i);
			
			if(laFrase.charAt(i) == ' ') {					
				laOtraFrase[jIndex] = word;
				jIndex++;
				word = "";
			}
		}
		laOtraFrase[jIndex] = word;
		
		for(String i : laOtraFrase)
			System.out.println(i);
			
	}

}
