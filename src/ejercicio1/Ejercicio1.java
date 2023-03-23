/**
 * C2-UD10-EJERCICIO 1
 */
package ejercicio1;

import java.util.Scanner;
import utils.ColorConsole;
import utils.Utils;

/**
 * @author elena-01
 *
 */
public class Ejercicio1 {

	// -------------- Constantes ------------------
	final static String TITULO = "C02-UD10-Ejercicio1";

	// --------- Variables------------
	Scanner sc = new Scanner(System.in);
	Utils utils = new utils.Utils();
	ColorConsole cc = new utils.ColorConsole();

	Usuario usuario = new Usuario();
	Ordenador ordenador = new Ordenador();

	// ----------Métodos ----------

	public void iniciaEjercicio() {

		// Muestra titulo
		utils.mostrarTitulo(TITULO);

		comenzarJuego();
	}

	// Comenzar Juego
	public void comenzarJuego() {

		int numero;
		String respuesta = "y";

		//Haz lo siguiente mientras el usuario responda si
		do {

			if (respuesta.equals("y")) {

				// Ordenador pide numero a usuario
				numero = ordenador.pideNumero();

				usuario.setNumero(numero);

				/*
				 * Se juega el número random generado por el ordenador en el constructor con el
				 * numero introducido por el usuario
				 */
				ordenador.juega(usuario.getNumero(), ordenador.getNumeroRandom());
			}
			
			// Preguntamos al usuario si quiere seguir jugando
			respuesta = utils.pideString("¿Otro intento?(y);", TITULO);
			System.out.println(respuesta);
		} while (respuesta.equals("y"));
	}
}