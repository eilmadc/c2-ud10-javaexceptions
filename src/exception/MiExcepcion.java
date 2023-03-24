/**
 * 
 */
package exception;

/**
 * @author elena-01
 *
 */
@SuppressWarnings("serial")
public class MiExcepcion extends Exception{

	// codigo de la excepcion
	private int codigoExcepcion;
	
	//Constructor por defecto
	public MiExcepcion() {
		super();
	}

	// Constructor
	public MiExcepcion(int codigoError) {
		super();
		this.codigoExcepcion = codigoError;
	}

	// Metodo para mostrar mensaje customizado
	@Override
	public String getMessage()  {
		
		String mensaje = "";
		
		switch(codigoExcepcion) {
		case 102:
			mensaje = "Exception 002: ";
			break;
		case 103:
			mensaje = "Exception 003: El número indicado es Par.";
			break;
		case 104:
			mensaje = "Exception 004: El número indicado es Impar.";
			break;
		}
		
		return mensaje;
	}
	
	//Excepcion customizada
	public void customException(String mensaje, String objeto) {
		System.out.println(mensaje + "\nExcepcion capturada con -->" + mensaje + " : " +
				"Esto es un objeto " + objeto
				 +"\nPrograma Terminado" );
	}

}
