package Servicios;

import java.util.Scanner;

/**
 * Implementación de la interfaz operativa
 * @author CMR - 28-11-23
 */
public class OperativaImplementacion implements OperativaInterfaz
{
	public int generarNumero() {
		
		double aleatorio = Math.random()*100;
		int aleatorioEntero = (int)aleatorio;
		
		return aleatorioEntero;
	}

	@Override
	public boolean validarNum(int numeroAdivinar) {
		
		Scanner sc = new Scanner(System.in);
		Boolean control= false;
		System.out.println("Intenta adivinar el número (enteros): ");
		int numeroUsuario= sc.nextInt();
		
		if(numeroUsuario == numeroAdivinar) {
			System.out.println("HAS ACERTADO");
			control = true;		
		}
		else if(numeroUsuario < numeroAdivinar) {
			System.out.println("El numero a adivinar es mayor");
		}
		else {
			System.out.println("El número a adivinar es menor");
			control = false;
		}
		return control;
	}
	
	
}
