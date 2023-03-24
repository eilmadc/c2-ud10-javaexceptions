/**
 * C2-UD10-EJERCICIO 5
 */
package ejercicio5;

/**
 * @author elena-01
 *
 */
public class Password {

	// ------------------- Constantes ---------------
	final static int SIZE = 8;
	final static String LETRAS_MAY = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	final static String LETRAS_MIN = "abcdefghijklmnopqrstuvwxyz";
	final static String NUMEROS = "0123456789";

	// ------------------- Atributos ---------------
	private int longitud;
	private String password;

	// ------------------- Constructores ---------------

	/**
	 * Constructor por defecto con la medida predefinida
	 */
	public Password() {
		this.longitud = SIZE;
		generarPassword(SIZE);

	}

	/**
	 * Constructor por defecto con la medida pasada por el usuario
	 */
	public Password(int size) {
		this.longitud = size;
		generarPassword(size);
	}

	// ------------------- Getters y Setters ---------------

	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;

	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	// ------------------- Metodos ---------------
	// Comprueba si es una contraseña fuerte, mediante chequeo de caracteres
	public boolean esFuerte() {

		// Debe tener 2 MAY - 1 min - 5 numeros
		int may=0;
		int min=0;
		int num=0;
		boolean fuerte;

		//Contamos mayucculas, minusculs y numeros
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if (c >='A' && c<= 'Z') may++;
			else if (c >='a' && c<= 'z') min++;
			else if (c >='0' && c<= '9') num++;
		}

		//System.out.println(may +" "+ min +" "+ num);
		//Comprobamos si se cumplen los requisitos
		if (num>4 && min>0 && may>1 ) {
			fuerte = true;
		}else {
			fuerte = false;
		}
		 return  fuerte;
	}

	// Genera password con la lonitud establecida

	public void generarPassword(int size) {

		// Concatenacion de caracterews válidos.
		String caracteresValidos = LETRAS_MAY + LETRAS_MIN + NUMEROS;
		// Generamos contraseña
		for (int i = 0; i < size; i++) {
			// Generamos caracteres random de caracteresValidos y lo añadimos a la
			// contraseña
			password += (caracteresValidos.charAt((int) (Math.random() * caracteresValidos.length())));
		}
	}
}
