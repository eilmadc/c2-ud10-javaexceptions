/**
 * C2-UD10-EJERCICIO 2
 */
package ejercicio2;

import java.util.Scanner;

import javax.swing.JOptionPane;

import exception.MiExcepcion;
import utils.ColorConsole;

/**
 * @author elena-01
 *
 */
public class Ejercicio2 {
	
	// -------------- Constantes ------------------
		final static String TITULO = "C02-UD10-Ejercicio2";
	
	// --------- Variables------------
	public Scanner sc = new Scanner(System.in);
	public MiExcepcion miexcepcion = new MiExcepcion();
	public ColorConsole cc = new utils.ColorConsole();
	
	
	//----------Métodos ----------
	public void iniciaEjercicio() {
		@SuppressWarnings("unused")
		double num;
		try {
			num = Double.parseDouble(JOptionPane.showInputDialog(null, "Escribe un mensaje o caracter diferente de un numero", TITULO , JOptionPane.QUESTION_MESSAGE));
			System.out.println("Has escrito: "+num);
		} catch (Exception e) {
			miexcepcion.customException(e.getMessage(), e.getClass().toString());
		} 
	}

}
