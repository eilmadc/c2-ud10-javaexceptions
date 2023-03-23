/**
 * 
 */
package ejercicio1;

import java.util.Scanner;

import utils.ColorConsole;
import utils.Utils;

/**
 * @author elena-01
 *
 */
public class Usuario {

	// -------------- Constantes ------------------
	final static String TITULO = "C02-UD10-Ejercicio1";

	// --------- Variables------------
	private Utils utils = new utils.Utils();
	private ColorConsole cc = new utils.ColorConsole();

	private int numero;

	// --------- Constructores------------

	/**
	 * Constructor por defecto
	 */
	public Usuario() {
		this.numero = numero;
	}

	
	//------------- Getters y Setters ------------
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

}
