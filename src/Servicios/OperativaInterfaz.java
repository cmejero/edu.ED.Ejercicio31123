package Servicios;

/**
 * Catálogo de métodos que gestionan la operativa del juego
 * @author CMR -28-11-23
 */
public interface OperativaInterfaz {

	/**
	 * Genera un número aleatorio a partir de la clase Math
	 * @return un número aleatorio entre el 1 y el 100
	 * @author CMR -28-11-23
	 */
	public int generarNumero();
	
	/**
	 * 
	 * @param numeroAdivinar es el numero aleatorio creado anteriormente
	 * @return true si se ha acertado y false si no.
	 */
	public boolean validarNum(int numeroAdivinar);
}
