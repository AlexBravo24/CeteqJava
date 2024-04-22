package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ENTRADA DE DATOS POR TECLADO
		
		//Clase Scanner
		
		Scanner entrada = new Scanner(System.in);
		//Una vez podemos ingresar datos por teclado, necesitamos las variables para guardarlos
		int numero;
		System.out.println("Introduce un numero"); //solicitamos a usuario que introduzca un num en consla
		numero = entrada.nextInt(); //guarda el numro introducido en la variable
		
		System.out.println("introduce otro numero");
		int numero2 = entrada.nextInt();
		
		System.out.println("la suma de ambos es " + (numero + numero2)); //realiza e impime la suma de numero + numero2
		
		String nombre;
		System.out.println("introduce tu nombre:");
		entrada.nextLine(); //El metodo nextLine nos permite consumir los espacios que obviamente tambien son caracteres
		//en ocasiones cuando ya utilizamos el scanner, se queda "volando" un espacio en el buffer y
		//cuando entra en acción consume ese espacio vacío
		nombre = entrada.nextLine(); 
				
		System.out.println("tu nombre es: " + nombre);
		
		//Si selecessionas lineas y presionas ctrl + 7 los vuelve comentarios, si volvemos a seleccionar y
		//presionar ctrl + 7 elimina que sean comentarios
		
		//si al inicio de las lineas qe no queremos usar ponemos " /* " todo lo siguiente sera tomado
		//como comentario, cerramos comentario con " */ "
		
		
		//Lineas para division
		int n = 10;
		int divisor = 2;
		int resultado = n/divisor;
		System.out.println("el resultado de la division es " + resultado);
		
		//Operador de modulo - sirve para indicar el valor de residuo de una división (%)
		int n1 = 43;
		int divisor1 = 5;
		int residuo = n1%divisor1;
		System.out.println("el residuo es " + residuo);
		
		
		
		
		
	}

}
