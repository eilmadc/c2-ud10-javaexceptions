/**
 * C2-UD10-EJERCICIO 4
 */
package ejercicio4;


import java.util.InputMismatchException;
import java.util.Scanner;
import exception.MiExcepcion;
import utils.ColorConsole;
import utils.Utils;

/**
 * @author elena-01
 *
 */
public class Calculo {

	
	// -------------- Constantes ------------------
	final static String TITULO = "C02-UD10-EJERCICIO 4: REALIZA OPERACION";
	final static int MAX = 500;
	final static int MIN = 1;

	// --------- Variables------------
	public Scanner sc = new Scanner(System.in);
	public Utils utils = new utils.Utils();
	public ColorConsole cc = new utils.ColorConsole();
	public MiExcepcion miexcepcion = new MiExcepcion();
	
	
	private double suma;
	private double resta;
	private double multiplicacion;
	private double division;
	private double potencia;
	private double raizCuadrada;
		
	
	/**
	 * 
	 */
	public Calculo() {
 //Operacion a realizar
	}
	
	//-------------- GETTERS y SETTERS ------------------------------
	/**
	 * @return the suma
	 */
	public double getSuma() {
		return suma;
	}


	/**
	 * @param suma the suma to set
	 */
	public void setSuma(double suma) {
		this.suma = suma;
	}


	/**
	 * @return the resta
	 */
	public double getResta() {
		return resta;
	}


	/**
	 * @param resta the resta to set
	 */
	public void setResta(double resta) {
		this.resta = resta;
	}

	/**
	 * @return the multiplicacion
	 */
	public double getMultiplicacion() {
		return multiplicacion;
	}

	/**
	 * @param multiplicacion the multiplicacion to set
	 */
	public void setMultiplicacion(double multiplicacion) {
		this.multiplicacion = multiplicacion;
	}

	/**
	 * @return the division
	 */
	public double getDivision() {
		return division;
	}

	/**
	 * @param division the division to set
	 */
	public void setDivision(double division) {
		this.division = division;
	}

	/**
	 * @return the potencia
	 */
	public double getPotencia() {
		return potencia;
	}

	/**
	 * @param potencia the potencia to set
	 */
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	/**
	 * @return the raizCuadrada
	 */
	public double getRaizCuadrada() {
		return raizCuadrada;
	}

	/**
	 * @param raizCuadrada the raizCuadrada to set
	 */
	public void setRaizCuadrada(double raizCuadrada) {
		this.raizCuadrada = raizCuadrada;
	}

	//SUMA
	public void suma() {
		double suma1 = 0;
		try {
			int num1 = pideNumero();
			int num2 = pideNumero();
			suma1 = num1+num2;	
		} catch (ArithmeticException e) {
			miexcepcion.customException(e.getMessage(), e.getClass().toString());
		} catch (NullPointerException e ) {
			miexcepcion.customException(e.getMessage(), e.getClass().toString());
		} catch (RuntimeException e) {
			miexcepcion.customException(e.getMessage(), e.getClass().toString());
		}finally {
			this.suma = suma1;
		}
		System.out.println("SUMA = "+  utils.dosPos(suma));
	}
	
	//RESTA
	public void resta() {
		double resta1 = 0;
		try {
			int num1 = pideNumero();
			int num2 = pideNumero();
			resta = num1-num2;
				
		} catch (ArithmeticException e) {
			miexcepcion.customException(e.getMessage(), e.getClass().toString());
		} catch (NullPointerException e ) {
			miexcepcion.customException(e.getMessage(), e.getClass().toString());
		} catch (RuntimeException e) {
			miexcepcion.customException(e.getMessage(), e.getClass().toString());
		}finally {
			this.resta = resta1;
		}
		System.out.println("RESTA = "+  utils.dosPos(resta));
	}
	
	//MULTIPLICACION
	public void multiplicacion() {
		
		double multiplicacion1 = 0;
		try {
			int num1 = pideNumero();
			int num2 = pideNumero();
			suma = num1*num2;
				
		} catch (ArithmeticException e) {
			miexcepcion.customException(e.getMessage(), e.getClass().toString());
		} catch (NullPointerException e ) {
			miexcepcion.customException(e.getMessage(), e.getClass().toString());
		} catch (RuntimeException e) {
			miexcepcion.customException(e.getMessage(), e.getClass().toString());
		}finally {
			this.multiplicacion = multiplicacion1;
		}
		System.out.println("MULTIPLICACION = "+  utils.dosPos(multiplicacion));
	}
	
	//DIVISION
	public void divide() {
		
		double divide1 = 0;
		try {
			int num1 = pideNumero();
			int num2 = pideNumero();
			divide1 = num1/num2;
				
		} catch (ArithmeticException e) {
			miexcepcion.customException(e.getMessage(), e.getClass().toString());
		} catch (NullPointerException e ) {
			miexcepcion.customException(e.getMessage(), e.getClass().toString());
		} catch (RuntimeException e) {
			miexcepcion.customException(e.getMessage(), e.getClass().toString());
		}finally {
			this.division = divide1;
		}
		System.out.println("DIVISION = "+  utils.dosPos(division));
	}
	
	//POTENCIA
	public void potencia() {
		
		double potencia1 = 0;
		try {
			int num1 = pideNumero();
			int num2 = pideNumero(); 
			potencia1 = Math.pow(num1, num2);
		} catch (ArithmeticException e) {
			miexcepcion.customException(e.getMessage(), e.getClass().toString());
		} catch (NullPointerException e ) {
			miexcepcion.customException(e.getMessage(), e.getClass().toString());
		} catch (RuntimeException e) {
			miexcepcion.customException(e.getMessage(), e.getClass().toString());
		}finally {
			this.potencia = potencia1;
		}
		System.out.println("POTENCIA = "+  utils.dosPos(potencia));
	}

	//RAIZ CUADRADA
	public void raizCuadrada() {
		double rc1 = 0;
		try {
			int num1 = pideNumero();
			rc1 = Math.sqrt(num1);
		} catch (ArithmeticException e) {
			miexcepcion.customException(e.getMessage(), e.getClass().toString());
		} catch (NullPointerException e ) {
			miexcepcion.customException(e.getMessage(), e.getClass().toString());
		} catch (RuntimeException e) {
			miexcepcion.customException(e.getMessage(), e.getClass().toString());
		}finally {
			this.raizCuadrada = rc1;
		}
		System.out.println("RAIZ CUADRADA = "+ utils.dosPos(raizCuadrada));
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
		System.out.println("NUMERO:" + numUsuario);
		return numUsuario;
	}


}
