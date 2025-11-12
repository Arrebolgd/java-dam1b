package examen;

import java.io.IOException;
import java.util.Scanner;

public class Fernandez_Manuel_examen {

	public static void main(String args[]) throws IOException {

		Scanner input = new Scanner(System.in);
		int entradaMenu;

		// 1. 5.
		final int INTENTOS_MAXIMOS = 6;
		int contadorIntentos;

		// 1.
		// Cambio de constante a variable para poder modificar el número en tiempo de
		// ejecución
		int energia_portal_calibrado;
		int energiaPortal = 0;

		// Inicializo por si el usuario le da directamente a la opcion 4
		boolean portalCalibrado = false;

		// 2.
		int dia;
		int mes;
		int ano;

		final int DIAS_MES = 30;
		final int DIAS_FEBRERO = 28;

		// Inicializo por si el usuario le da directamente a la opcion 4
		boolean fechaCalibrada = false;
		boolean bisiesto;

		// 3.
		int crones = 0;

		// 5.
		String palabraClaveTemporal = "CRONOS";
		String placeholder;
		char letra;
		boolean palabraCalibrada;

		// 6.
		final int numeroIdentificadores = 5;
		final String prefix = "IV-";
		String identificador1, identificador2, identificador3, identificador4, identificador5;
		boolean comprobadorGeneral, comprobadorBloques;
		int comprobadorNumeroLetras, comprobadorNumeroGuiones;
		String consonantes = "BCDFGHJKLMNPQRSTVWXYZ", vocales = "AEIOU";
		int generadorConsonantesA1, generadorConsonantesA2, generadorNumeroA, generadorVocalA;
		int identificadorBasico, identificadorEstable, identificadorPrioritario, identificadorMaestro;

		do {

			System.out.println("""
					---- CENTRO DE CONTROL TEMPORAL ----

					1. Calibrar el Portal

					2. Establecer fecha de viaje

					3. Mostrar la carga temporal acumulada

					4. Iniciar viaje

					5. Descifrar la Clave Temporal

					6. Verificador de Identificadores

					0. Salir

					-------------------------------------

					Elige una opción:
					""");
			entradaMenu = input.nextInt();

			switch (entradaMenu) {
			case 0:
				System.out.println("\"Desconectando sistema temporal... Hasta el próximo salto\"");
				break;
			case 1:
				System.out.println("""
						========================================
							Calibrar el portal
						========================================
						Introduce la cantidad de energía:
						""");
				// Asignacion de un numero aleatorio
				energia_portal_calibrado = (int) (Math.random() * 141) + 10;

				// Asigno para reiniciar el numero de intentos y estado en cada iteracion
				contadorIntentos = 0;
				portalCalibrado = false;

				// He imprimido el numero aleatorio asignado tanto para que me sea mas facila mi
				// desbugear, como a usted
				System.out.println(energia_portal_calibrado);

				do {
					energiaPortal = input.nextInt();

					if (energiaPortal == energia_portal_calibrado) {
						portalCalibrado = true;
						break;
					}

					if (energiaPortal > energia_portal_calibrado) {
						System.out.println("""
								La energía introducida es demasiado alta...
								Introduce la cantidad de energía de nuevo:
								""");
						contadorIntentos++;

					} else if (energiaPortal < energia_portal_calibrado) {
						System.out.println("""
								La energía introducida es demasiado baja...
								Introduce la cantidad de energía de nuevo:
								""");
						contadorIntentos++;
					}

				} while (contadorIntentos != INTENTOS_MAXIMOS || energiaPortal == energia_portal_calibrado);

				if (portalCalibrado == true) {
					crones += 10;
					System.out.println("El portal ha sido calibrado, numero de intentos: " + contadorIntentos);
				} else {
					System.out.println("El portal no ha sido calibrado...\n"
							+ " Numero de intentos máximos (6) alcanzado...\n" + " La grieta temporal ha colapsado");
				}
				break;

			case 2:
				// No añado condiciones por lo laxa que es la variable:
				// Pudiendo ser negativa (A.C) o incluso "0" (que equivaldria al año 1 A.C al no
				// haber año 0
				// Por ahora no se nos pide indicar la fecha ni asi que...

				// Reinicio variables al principio de la ejecucion
				ano = 0;
				mes = 0;
				dia = 0;

				System.out.println("Introduce el dia: ");
				dia = input.nextInt();

				System.out.println("Introduce el mes: ");
				mes = input.nextInt();

				System.out.println("Introduce el ano: ");
				ano = input.nextInt();

				if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
					bisiesto = true;

				} else {
					bisiesto = false;
				}

				switch (mes) {

				// Meses de 30 días
				case 4, 6, 9, 11:
					if (dia > 0 && dia <= DIAS_MES) {

						System.out.println("\"Las coordenadas son estables\"");
						crones += 5;
						fechaCalibrada = true;

					} else {

						System.out.println("\"Las coordenadas son inestables\"");
						fechaCalibrada = false;
					}

					break;

				// Meses de 31 días
				case 1, 3, 5, 7, 8, 10, 12:
					if (dia > 0 && dia <= DIAS_MES + 1) {

						System.out.println("\"Las coordenadas son estables\"");
						crones += 5;
						fechaCalibrada = true;

					} else {

						System.out.println("\"Las coordenadas son inestables\"");
						fechaCalibrada = false;
					}
					break;

				// Febrero
				case 2:
					if ((bisiesto == false && (dia > 0 && dia <= DIAS_FEBRERO))
							|| (bisiesto == true && (dia > 0 && dia <= DIAS_FEBRERO + 1))) {

						System.out.println("\"Las coordenadas son estables\"");
						crones += 5;
						fechaCalibrada = true;

					} else {

						System.out.println("\"Las coordenadas son inestables\"");
						fechaCalibrada = false;
					}
					break;

				default:
					System.out.println("\"Las coordenadas son inestables\"");
					fechaCalibrada = false;
				}

				break;
			case 3:
				System.out.println("\"Tu carga temporal es de " + crones + " crones\"\n");
				break;
			case 4:
				if (portalCalibrado == true) {
					if (fechaCalibrada == true) {
						if (crones >= 10) {
							System.out.println("""
									\"Activando portal...

									Coordenadas estables...

									¡Salto temporal realizado con exito!\"
									""");
						} else {
							System.out.println(
									"\"Error: carga temporal insuficiente. Se necesitan al menos 10 crones para abrir el portal.\"");
						}
					} else {
						System.out.println(
								"\"Error: coordenadas temporales inestables. Introduce una fecha de destino correcta.\"");
					}
				} else {
					System.out.println(
							"\"Error: el portal no está calibrado. Realiza la calibración antes de iniciar el viaje.\"");
				}
				break;

			case 5:
				System.out.println("""
						========================================
							Descifrar la Clave Temporal
						========================================
						""");
				placeholder = "******";
				palabraCalibrada = false;

				for (contadorIntentos = 6; contadorIntentos > 0; contadorIntentos--) {
					System.out.println(placeholder);
					System.out.println("Intentos restantes: " + contadorIntentos);
					System.out.println("Introduce la letra: ");
					letra = Character.toUpperCase((char) System.in.read());

					// Uso 2 system.in.read() extras para limpiar el buffer de "\" y "n"
					System.in.read();
					System.in.read();

					for (int i = 0; i <= palabraClaveTemporal.length() - 1; i++) {
						if (letra == palabraClaveTemporal.charAt(i)) {
							System.out.println("Letra Correcta!");

							// Sigo la cadena hasta "palabraClaveTemporal.Lenght() y no a lenght()-1, por
							// que
							// el ultimo caracter no se incluye
							placeholder = placeholder.substring(0, i) + palabraClaveTemporal.charAt(i)
									+ placeholder.substring(i + 1, palabraClaveTemporal.length());

						}
					}
					if (palabraClaveTemporal.equals(placeholder)) {
						palabraCalibrada = true;
						break;
					}

				}

				if (palabraCalibrada == false) {
					System.out.println("Colapso temporal... La palabra era: CRONOS");
				}
				if (palabraCalibrada == true) {
					// Pongo "placeholder" en vez de "CRONOS" directamente, por si hay algun error
					// que sea visible
					System.out.println("Has ganado! La palabra era: " + placeholder);
					crones += 15;
				}
				break;

			// Verificador de Identificadores
			case 6:
				identificadorMaestro = 0;
				identificadorPrioritario = 0;
				identificadorEstable = 0;
				identificadorBasico = 0;

				
				// Empiezo en 1 para que solo itere 5 veces
				for (int i = 1; i <= numeroIdentificadores; i++) {

					comprobadorGeneral = false;
					comprobadorBloques = false;
					comprobadorNumeroLetras = 0;
					comprobadorNumeroGuiones = 0;
					
					generadorConsonantesA1 = (int) (Math.random() * 21);
					generadorConsonantesA2 = (int) (Math.random() * 21);
					generadorNumeroA = (int) (Math.random() * 9000) + 1000;
					generadorVocalA = (int) (Math.random() * 5);
					
					switch (i) {
					case 1:
						identificador1 = prefix;

						identificador1 = identificador1 + consonantes.charAt(generadorConsonantesA1)
								+ consonantes.charAt(generadorConsonantesA2) + "-" + generadorNumeroA + "-"
								+ vocales.charAt(generadorVocalA);

						if (identificador1.charAt(0) == 'I' && identificador1.charAt(1) == 'V') {
							if (identificador1.length() == 12) {
								if (Character.isUpperCase(identificador1.charAt(identificador1.length() - 1))) {
									comprobadorGeneral = true;

									for (int z = 0; z <= identificador1.length() - 1; z++) {
										if (identificador1.charAt(z) == '-') {

											comprobadorNumeroGuiones++;
										} else {

											comprobadorNumeroLetras++;
										}
									}
									if (comprobadorNumeroGuiones == 3 && comprobadorNumeroLetras == 9) {
										comprobadorBloques = true;
									}
								}
							}
						}
						
						if (comprobadorGeneral && comprobadorBloques) {
							if (identificador1.charAt(identificador1.length() - 1) == 'A'
									&& generadorNumeroA % 7 == 0) {
								
								System.out.println(identificador1 + "-->Identificado maestro");
								identificadorMaestro++;

							} else if (identificador1.charAt(identificador1.length() - 1) == 'A') {

								System.out.println(identificador1 + "-->Identificado prioritario");
								identificadorPrioritario++;

							} else if (generadorNumeroA % 7 == 0) {

								System.out.println(identificador1 + "-->Identificado estable");
								identificadorEstable++;

							} else {

								System.out.println(identificador1 + "-->Identificado básico");
								identificadorBasico++;
							}
						}
						break;
					case 2:
						identificador2 = prefix;

						identificador2 = identificador2 + consonantes.charAt(generadorConsonantesA1)
								+ consonantes.charAt(generadorConsonantesA2) + "-" + generadorNumeroA + "-"
								+ vocales.charAt(generadorVocalA);

						if (identificador2.charAt(0) == 'I' && identificador2.charAt(1) == 'V') {
							if (identificador2.length() == 12) {
								if (Character.isUpperCase(identificador2.charAt(identificador2.length() - 1))) {
									comprobadorGeneral = true;

									for (int z = 0; z <= identificador2.length() - 1; z++) {
										if (identificador2.charAt(z) == '-') {

											comprobadorNumeroGuiones++;
										} else {

											comprobadorNumeroLetras++;
										}
									}
									if (comprobadorNumeroGuiones == 3 && comprobadorNumeroLetras == 9) {
										comprobadorBloques = true;
									}
								}
							}
						}
						if (comprobadorGeneral && comprobadorBloques) {
							if (identificador2.charAt(identificador2.length() - 1) == 'A'
									&& generadorNumeroA % 7 == 0) {

								System.out.println(identificador2 + "-->Identificado maestro");
								identificadorMaestro++;

							} else if (identificador2.charAt(identificador2.length() - 1) == 'A') {

								System.out.println(identificador2 + "-->Identificado prioritario");
								identificadorPrioritario++;

							} else if (generadorNumeroA % 7 == 0) {

								System.out.println(identificador2 + "-->Identificado estable");
								identificadorEstable++;

							} else {

								System.out.println(identificador2 + "-->Identificado básico");
								identificadorBasico++;

							}
						}

						break;
					case 3:
						identificador3 = prefix;

						identificador3 = identificador3 + consonantes.charAt(generadorConsonantesA1)
								+ consonantes.charAt(generadorConsonantesA2) + "-" + generadorNumeroA + "-"
								+ vocales.charAt(generadorVocalA);

						if (identificador3.charAt(0) == 'I' && identificador3.charAt(1) == 'V') {
							if (identificador3.length() == 12) {
								if (Character.isUpperCase(identificador3.charAt(identificador3.length() - 1))) {
									comprobadorGeneral = true;

									for (int z = 0; z <= identificador3.length() - 1; z++) {
										if (identificador3.charAt(z) == '-') {

											comprobadorNumeroGuiones++;
										} else {

											comprobadorNumeroLetras++;
										}
									}
									if (comprobadorNumeroGuiones == 3 && comprobadorNumeroLetras == 9) {
										comprobadorBloques = true;
									}
								}
							}
						}
						
						if (comprobadorGeneral && comprobadorBloques) {
							if (identificador3.charAt(identificador3.length() - 1) == 'A'
									&& generadorNumeroA % 7 == 0) {

								System.out.println(identificador3 + "-->Identificado maestro");
								identificadorMaestro++;

							} else if (identificador3.charAt(identificador3.length() - 1) == 'A') {

								System.out.println(identificador3 + "-->Identificado prioritario");
								identificadorPrioritario++;

							} else if (generadorNumeroA % 7 == 0) {

								System.out.println(identificador3 + "-->Identificado estable");
								identificadorEstable++;

							} else {

								System.out.println(identificador3 + "-->Identificado básico");
								identificadorBasico++;

							}
						}
						break;
					case 4:
						identificador4 = prefix;

						identificador4 = identificador4 + consonantes.charAt(generadorConsonantesA1)
								+ consonantes.charAt(generadorConsonantesA2) + "-" + generadorNumeroA + "-"
								+ vocales.charAt(generadorVocalA);

						if (identificador4.charAt(0) == 'I' && identificador4.charAt(1) == 'V') {
							if (identificador4.length() == 12) {
								if (Character.isUpperCase(identificador4.charAt(identificador4.length() - 1))) {
									comprobadorGeneral = true;

									for (int z = 0; z <= identificador4.length() - 1; z++) {
										if (identificador4.charAt(z) == '-') {

											comprobadorNumeroGuiones++;
										} else {

											comprobadorNumeroLetras++;
										}
									}
									if (comprobadorNumeroGuiones == 3 && comprobadorNumeroLetras == 9) {
										comprobadorBloques = true;
									}
								}
							}
						}
						
						if (comprobadorGeneral && comprobadorBloques) {
							if (identificador4.charAt(identificador4.length() - 1) == 'A'
									&& generadorNumeroA % 7 == 0) {

								System.out.println(identificador4 + "-->Identificado maestro");
								identificadorMaestro++;

							} else if (identificador4.charAt(identificador4.length() - 1) == 'A') {

								System.out.println(identificador4 + "-->Identificado prioritario");
								identificadorPrioritario++;

							} else if (generadorNumeroA % 7 == 0) {

								System.out.println(identificador4 + "-->Identificado estable");
								identificadorEstable++;

							} else {

								System.out.println(identificador4 + "-->Identificado básico");
								identificadorBasico++;

							}
						}
						break;
					case 5:
						identificador5 = prefix;

						identificador5 = identificador5 + consonantes.charAt(generadorConsonantesA1)
								+ consonantes.charAt(generadorConsonantesA2) + "-" + generadorNumeroA + "-"
								+ vocales.charAt(generadorVocalA);

						if (identificador5.charAt(0) == 'I' && identificador5.charAt(1) == 'V') {
							if (identificador5.length() == 12) {
								if (Character.isUpperCase(identificador5.charAt(identificador5.length() - 1))) {
									comprobadorGeneral = true;

									for (int z = 0; z <= identificador5.length() - 1; z++) {
										if (identificador5.charAt(z) == '-') {

											comprobadorNumeroGuiones++;
										} else {

											comprobadorNumeroLetras++;
										}
									}
									if (comprobadorNumeroGuiones == 3 && comprobadorNumeroLetras == 9) {
										comprobadorBloques = true;
									}
								}
							}
						}
						
						if (comprobadorGeneral && comprobadorBloques) {
							if (identificador5.charAt(identificador5.length() - 1) == 'A'
									&& generadorNumeroA % 7 == 0) {

								System.out.println(identificador5 + "-->Identificado maestro");
								identificadorMaestro++;

							} else if (identificador5.charAt(identificador5.length() - 1) == 'A') {

								System.out.println(identificador5 + "-->Identificado prioritario");
								identificadorPrioritario++;

							} else if (generadorNumeroA % 7 == 0) {

								System.out.println(identificador5 + "-->Identificado estable");
								identificadorEstable++;

							} else {

								System.out.println(identificador5 + "-->Identificado básico");
								identificadorBasico++;

							}
						}
						break;
					}
				}
				System.out.println("========Resumen========");
				System.out.println("Identificadores maestros: " + identificadorMaestro);
				System.out.println("Identificadores prioritarios: " + identificadorPrioritario);
				System.out.println("Identificadores estables: " + identificadorEstable);
				System.out.println("Identificadores básicos: " + identificadorBasico);
				break;
				
			default:
				System.out.println("\"Opción no válida. Por favor, selecciona una opción del 0 al 4\"");

			}
		} while (entradaMenu != 0);
		input.close();
	}

}
