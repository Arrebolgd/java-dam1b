package _Los_Juegos_Del_Tiempo;

import java.util.Scanner;

public class Los_Juegos_Del_Tiempo_Class {

	public static void main(String args[]) {

		// Variables para manipulación del menu, la entrada por defecto es -1 para
		// enviar el mensaje de menu
		int entradaMenu = -1;
		Scanner input = new Scanner(System.in);

		// 1. Variables para valorar estado del portal
		final int ENERGIA_PORTAL_CALIBRADO = 35;
		int energiaPortal = 0;
		int contadorIntentos = 0;
		// guardo en un boolean si se ha calibrado o no el portal
		boolean calibrarPortal = false;

		// 2. establezco un valor por defecto -1 para trabajar con un bucle while durante asignacion
		int day = -1;
		int month = -1;
		int year = -1;
		boolean calibrarFecha = false;

		// 3.
		int crones = 0;

		do {
			switch (entradaMenu) {

			case 1:
				System.out.println("""
						========================================
							Calibrar el portal
						========================================
						Introduce la cantidad de energía:
						""");
				do {
					energiaPortal = input.nextInt();

					if (energiaPortal > 35) {
						System.out.println("""
								La energía introducida es demasiado alta...
								Introduce la cantidad de energía de nuevo:
								""");

					} else if (energiaPortal < 35) {
						System.out.println("""
								La energía introducida es demasiado baja...
								Introduce la cantidad de energía de nuevo:
								""");
					}
					contadorIntentos++;

				} while (energiaPortal != ENERGIA_PORTAL_CALIBRADO);

				System.out.println(" El portal ha sido calibrado, numero de intentos: " + contadorIntentos);

				calibrarPortal = true;
				entradaMenu = -1;
				crones += 10;

				break;

			case 2:
				do {
					
				}while(day == -1 || month == -1 || year == -1);
								
				entradaMenu = -1;
				break;

			case 3:
				System.out.println("\"Tu carga temporal es de " + crones + " crones\"\n");

				entradaMenu = -1;
				break;

			case 4:

				entradaMenu = -1;
				break;

			case -1:
				System.out.println("""
						---- CENTRO DE CONTROL TEMPORAL ----

						1. Calibrar el Portal

						2. Establecer fecha de viaje

						3. Mostrar la carga temporal acumulada

						4. Iniciar viaje

						0. Salir

						-------------------------------------

						Elige una opción:
						""");
				entradaMenu = input.nextInt();
				break;

			default:
				if (entradaMenu < 0 || entradaMenu > 4)
					System.out.println("Valor no comprendido en las opciones, eliga opción de nuevo...");

				entradaMenu = -1;
				break;
			}

		} while (entradaMenu != 0);

		input.close();
	}
}
