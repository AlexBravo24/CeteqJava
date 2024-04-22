package com.ciclos;

public class Ciclo5_OARG {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
		// de interés mensual. ¿Cuál será la cantidad de dinero que esta persona
		// tendrá al cabo de un año si todo el dinero lo reinvierte?
		
		//Declaro variables
		double n=1000; //Dinero invertido
		int mes=1; //VAriable base de un mes
		
		
		while (mes<=12) { //Ciclo While limitado hasta 12
			n=n*1.02; //Operación para calcular los ingresos
			mes++; //operacion para aumentar los meses de uno en uno 
		}
        System.out.println("El ingreso total al cabo de un año es de: "+n+ " $"); //Salida de resultado del programa
        
	}

}
