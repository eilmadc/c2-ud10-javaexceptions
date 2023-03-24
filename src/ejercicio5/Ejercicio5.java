/**
 * C2-UD10-EJERCICIO 5
 */
package ejercicio5;

import java.util.Scanner;

import utils.ColorConsole;
import utils.Utils;

/**
 * @author elena-01
 *
 */
public class Ejercicio5 {

	// -------------- Constantes ------------------
	final static String TITULO = "C02-UD10-Ejercicio5";

	// --------- Variables------------
	Scanner sc = new Scanner(System.in);
	Utils utils = new utils.Utils();
	ColorConsole cc = new utils.ColorConsole();

	Password password;

	// ----------Métodos ----------
	public void iniciaEjercicio() {

		int size;
		// Pide tamaño al usuario
		size = utils.pideInt("Introduce el numero de contraseñas", TITULO);
		System.out.println("El numero de contraseñas a generar es :" + size);

		// Crear array Password con tamaño que se le pide al usuario
		Password Passwords[] = new Password[size];
		
		//Crear array de booleanos
		boolean fuertes[] = new boolean[size];
		
		
		//Crear lingitud passwords
		int sizePass = 25;

		// Crear bucle que cree un objeto para cada posicion del array
		for (int i = 0; i < size; i++) {
			//objetos password
			Passwords[i] = new Password(sizePass);
			fuertes[i] = Passwords[i].esFuerte();
			System.out.println((Passwords[i].getPassword()) + " "+ fuertes[i]);
		}

	}

}
