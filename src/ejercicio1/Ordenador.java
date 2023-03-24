/**
 * 
 */
package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

import utils.ColorConsole;
import utils.Utils;

/**
 * @author elena-01
 *
 */
public class Ordenador {
	// -------------- Constantes ------------------
	final static String TITULO = "C02-UD10-EJERCICIO 1: ADIVINA NUMERO";
	final static int MAX = 500;
	final static int MIN = 1;

	// --------- Variables------------
	public Scanner sc = new Scanner(System.in);
	public Utils utils = new utils.Utils();
	public ColorConsole cc = new utils.ColorConsole();

	int numeroRandom;
	int numVeces;

	// --------- Constructores------------

	/**
	 * Constructor por defecto Asigna por defecto un valor random entre 1 y 500 a
	 * numRandom
	 */
	public Ordenador() {
		this.numeroRandom = (int) (Math.random() * (MAX - MIN) + MIN);
		this.numVeces = 0;
	}

	// --------- Getters y Setters------------

	/**
	 * @return the numeroRandom
	 */
	public int getNumeroRandom() {
		return numeroRandom;
	}

	/**
	 * @param numeroRandom the numeroRandom to set
	 */
	public void setNumeroRandom(int numeroRandom) {
		this.numeroRandom = numeroRandom;
	}

	/**
	 * @return the numVeces
	 */
	public int getNumVeces() {
		return numVeces;
	}

	/**
	 * @param numVeces the numVeces to set
	 */
	public void setNumVeces(int numVeces) {
		this.numVeces = numVeces;
	}

	// Pide Numero a usuario
	public int pideNumero() {

		int numUsuario = 0;

		// Pedir numero por pantalla 
		try {
			System.out.println("Introduce numero :");
			numUsuario = sc.nextInt();
		} catch (InputMismatchException e) {
			utils.mostrarMensajeDialog( e.toString(), TITULO);
		}

		System.out.println(numUsuario);

		return numUsuario;
	}

	public void juega(int numero, int numRandom) {

		if (numero == numRandom) {
			utils.mostrarMensajeDialog(
					"Numero " + numRandom + " Adivinado! Has ganado! \n Numero de Intentos : " + this.numVeces, TITULO);
		} else if (numero > numRandom) {
			utils.mostrarMensajeDialog("Numero usuario: " + numero + " MAYOR que numero de ordenador : " + numRandom,
					TITULO);
			this.numVeces = this.numVeces + 1;
		} else if (numero < numRandom) {
			utils.mostrarMensajeDialog("Numero usuario: " + numero + " MENOR que numero de ordenador : " + numRandom,
					TITULO);
			this.numVeces = this.numVeces + 1;
		}
	}

}
