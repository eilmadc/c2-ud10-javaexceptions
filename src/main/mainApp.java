/**
 * C02 - UD10
 */
package main;

import java.util.Scanner;

import ejercicio1.Ejercicio1;
import ejercicio2.Ejercicio2;
import ejercicio3.Ejercicio3;
import ejercicio4.Ejercicio4;
import ejercicio5.Ejercicio5;
import utils.ColorConsole;
import utils.Utils;

/**
 * @author elena-01
 *
 */
public class mainApp {

	// --------- Variables ------------

	public Scanner sc = new Scanner(System.in);
	public static Utils utils = new utils.Utils();
	public ColorConsole cc = new utils.ColorConsole();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO: hacer Switch case control Ejercicio 1 a 5
		imprimeMenuPrincipal();
	}

	// Imprimir Menu
	static public void imprimeMenuPrincipal() {

		// Muestra el menu mediante poantalla y dialog
		utils.mostrarTitulo("UNIDAD 10 : JAVA EXCEPTIONS");
		String mensaje = " Opcion 1: EJERCICIO 1" + "\n Opcion 2: EJERCICIO 2" + "\n Opcion 3: EJERCICIO 3"
				+ "\n Opcion 4: EJERCICIO 4" + "\n Opcion 5: EJERCICIO 5";
		System.out.println(mensaje);

		int opcion;

		// Pide mensaje hasta que se introduzca una opcion correcta.(Entre 1 y 3)
		do {

			// Pide numero de opcion de MENU mediante dialog
			opcion = utils.pideInt(mensaje, "UD10");
			System.out.println(opcion);

		} while (opcion > 5);

		verificaOpcionPrincipal(opcion);

	}

	// Verifica Opcion del menu
	/**
	 * @param opcion
	 */
	static public void verificaOpcionPrincipal(int opcion) {

		String respuesta = "si";
		do {

			switch (opcion) {
			case 1:
				// Ejercicio1
				Ejercicio1 ejercicio1 = new Ejercicio1();
				ejercicio1.iniciaEjercicio();
				break;
			case 2:
				// Ejercicio2
				Ejercicio2 ejercicio2 = new Ejercicio2();
				ejercicio2.iniciaEjercicio();
				break;
			case 3:
				// Ejercicio3
				Ejercicio3 ejercicio3 = new Ejercicio3();
				ejercicio3.iniciaEjercicio();

				break;
			case 4:
				// Ejercicio4
				Ejercicio4 ejercicio4 = new Ejercicio4();
				ejercicio4.iniciaEjercicio();
				break;
			case 5:
				// Ejercicio4
				Ejercicio5 ejercicio5 = new Ejercicio5();
				ejercicio5.iniciaEjercicio();
				break;
			default:
				break;
			}

			if (respuesta.equals("si")) {
				imprimeMenuPrincipal();
			}

			respuesta = utils.pideString("¿Deseas continuar?(si,no);", "MENU PRINCIPAL UD10");
			System.out.println(respuesta);
		} while (respuesta == "si");

	}
}
