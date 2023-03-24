/**
 * C2-UD10-EJERCICIO 4
 */
package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;
import utils.Utils;

/**
 * @author elena-01
 *
 */
public class Ejercicio4 {

	// -------------- Constantes ------------------
	final  String TITULO = "C02-UD10-Ejercicio4";

	// --------- Variables------------
	private Scanner sc = new Scanner(System.in);
	private Utils utils = new utils.Utils();

	// ----------Métodos ----------
	public void iniciaEjercicio() {
		// Muestra titulo
		utils.mostrarTitulo(TITULO);
		comenzarCalculadora();
	}

	public void comenzarCalculadora() {
		pideCalculo();		
	}
	
	// Pide Calculo al usuario
	 public int pideCalculo() {
		int calculo = 0;
		// Pedir calculo por pantalla 
		try {
			System.out.println("\n¿Que operacion quieres realizar? +"
					+ "\n1 - SUMA"
					+ "\n2 - RESTA"
					+ "\n3 - MULTIPLICACION"
					+ "\n4 - DIVISION"
					+ "\n5 - POTENCIA"
					+ "\n6 - raizCuadrada"
					+ "\nElige opcion: 1 a 6"
					);
			calculo = sc.nextInt();
			System.out.println("Operación elegida: "+ calculo);
			verificaOpcionPrincipal(calculo);
		} catch (InputMismatchException e) {
			utils.mostrarMensajeDialog( e.toString(), TITULO);
		}
		return calculo;
	}

	// Verifica Opcion del menu
	/**
	 * @param opcion
	 */
	public void verificaOpcionPrincipal(int opcion) {
		Calculo calc = new Calculo();
		String respuesta = "si";
		do {

			switch (opcion) {
			case 1:
				// SUMA
				calc.suma();
				break;
			case 2:
				// RESTA
				calc.resta();
				break;
			case 3:
				// MULTIPLICACION
				calc.multiplicacion();

				break;
			case 4:
				// DIVISION
				calc.divide();
				break;
			case 5:
				// POTENCIA
				calc.potencia();
				break;
			case 6:
				// RAIZ CUADRADA
				calc.raizCuadrada();
				break;
			default:
				break;
			}

			if (respuesta.equals("si")) {
				pideCalculo();
			}
			//Pregunta al usuario sdi quiere continuar
			respuesta = utils.pideString("¿Deseas continuar?(si,no);", "MENU PRINCIPAL UD10");
			System.out.println(respuesta);
		} while (respuesta == "si");

	}
}
