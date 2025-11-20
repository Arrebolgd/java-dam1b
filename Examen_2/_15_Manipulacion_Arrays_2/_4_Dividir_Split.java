package _15_Manipulacion_Arrays_2;

public class _4_Dividir_Split {

	public static void main(String[] args) {

		/*
		 * Repetir el ejercicio anterior utilizando el método split(cadena) de la clase
		 * String, donde cadena es el String por donde vamos a romper la frase.
		 */
		String laFrase = "Esta es la frase que vamos a partir";
		String laOtraFrase[] = laFrase.split(" ");
		
		for(String i : laOtraFrase)
			System.out.println(i);
		
	}

}
