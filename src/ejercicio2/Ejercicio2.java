/**
 * C2-UD10-EJERCICIO 2
 */
package ejercicio2;

import java.util.Scanner;

import javax.swing.JOptionPane;

import utils.ColorConsole;
import utils.Utils;

/**
 * @author elena-01
 *
 */
public class Ejercicio2 {
	
	// -------------- Constantes ------------------
		final static String TITULO = "C02-UD10-Ejercicio2";
	
	// --------- Variables------------
	public Scanner sc = new Scanner(System.in);
	public Utils utils = new utils.Utils();
	public ColorConsole cc = new utils.ColorConsole();
	
	
	//----------Métodos ----------
	public void iniciaEjercicio() {
		double num;
		try {
			num = Double.parseDouble(JOptionPane.showInputDialog(null, "ESTO es una PRUEBA DE EXCEPCION", TITULO , JOptionPane.QUESTION_MESSAGE));
		} catch (Exception e) {
			utils.customException(e.getMessage(), e.getClass().toString());
		} 
	}

}
