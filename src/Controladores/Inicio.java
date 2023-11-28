package Controladores;

import Servicios.OperativaImplementacion;
import Servicios.OperativaInterfaz;

public class Inicio 
{

	public static void main(String[] args) 
	{
     
		OperativaInterfaz oi = new OperativaImplementacion();
		int numeroAdivinar = oi.generarNumero();
		
		
		Boolean control =  false;
		int i;
		for ( i=1; i<=10; i++) 
		{
			control = oi.validarNum(numeroAdivinar);
			if(control) 
			{
				break;
			}
			
		}
		if(i > 10) {
			
			System.out.println("HAS PERDIDO");
		}
		
	}
}
