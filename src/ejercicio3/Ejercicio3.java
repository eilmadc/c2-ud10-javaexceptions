/*
 * C2-UD10-EJERCICIO 3
 */

package ejercicio3;

import java.util.Scanner;

import utils.ColorConsole;
import utils.Utils;

public class Ejercicio3 {

	// -------------- Constantes ------------------
	final static String TITULO = "C02-UD10-Ejercicio1";

	// --------- Variables------------
	Scanner sc = new Scanner(System.in);
	Utils utils = new utils.Utils();
	ColorConsole cc = new utils.ColorConsole();

	Ordenador ordenador;

	// ----------Métodos ----------

	public void iniciaEjercicio() {

		// Muestra titulo
		utils.mostrarTitulo(TITULO);

		comenzarJuego();
	}

	// Comenzar Juego
	public void comenzarJuego() {

		 ordenador = new Ordenador();
		// Ordenador genera numero random e indica si es par o impar
		ordenador.esPar();

	}

}
