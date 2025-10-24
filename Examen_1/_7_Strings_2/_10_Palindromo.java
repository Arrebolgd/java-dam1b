package _7_Strings_2;

public class _10_Palindromo {

	public static void main(String args[]) {

		/*
		 * Dada una palabra cualquiera introducida por el usuario deducir si es o no un
		 * palíndromo.
		 */

		String frasePal = "arenera";
		//String frasePal = "Jose Luis";
		int contador = frasePal.length() - 1;
		boolean palindromo = false;

		if (frasePal.length() > 0) {
			
			for (int i = 0; i < frasePal.length(); i++) {

				if (frasePal.charAt(i) == frasePal.charAt(contador)) {
					palindromo = true;

				} else {
					palindromo = false;
					break;

				}
				contador--;
			}
		}
		if (palindromo) {
			System.out.println("La palabra es un palíndromo.");
		} else {
			System.out.println("La palabra no es un palíndromo.");
		}
	}
}
