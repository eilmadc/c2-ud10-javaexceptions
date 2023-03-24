/**
 * C2-ud10-Ejercicio3
 */
package ejercicio3;

import java.util.Random;
import java.util.Scanner;

import exception.MiExcepcion;
import utils.ColorConsole;
import utils.Utils;

/**
 * @author elena-01
 *
 */
public class Ordenador {
	// -------------- Constantes ------------------
	final static String TITULO = "C02-UD10-EJERCICIO 3";
	final static int MAX = 500;
	final static int MIN = 1;

	// --------- Variables------------
	public Scanner sc = new Scanner(System.in);
	public MiExcepcion miexcepcion;
	public Utils utils = new utils.Utils();
	public ColorConsole cc = new utils.ColorConsole();

	int numeroRandom;
	int numVeces;

	// --------- Constructores------------

	/**
	 * Constructor por defecto Asigna por defecto un valor random entre 1 y999 a
	 * numRandom
	 */
	public Ordenador() {
		Random rnd = new Random();
		this.numeroRandom = rnd.nextInt(999);
		System.out.println("Generando numero aleatorio...");
		System.out.println("Numero random : " + numeroRandom);
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

	//Es Par o Impar
	public void esPar() {

		try {
			if (this.numeroRandom%2==0) {throw new MiExcepcion(103);	}
			else {throw new MiExcepcion(104);}
				
		} catch (MiExcepcion e) {
			System.out.println(e.getMessage());
		}

	}

}
