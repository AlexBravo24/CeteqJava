package com;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		// Entrada de datos 
		//Por teclado
		
		//Utilizamos a la clase Scanner
		
//		Scanner entrada = new Scanner (System.in);
//		
//		//Una vez podemos ingresar datos por teclado
//		//Necesitamos las variables adecuadas para poder guardarlos
//		
//		int numero;
//		System.out.println("Introduce un numero:");
//		numero=entrada.nextInt(); //Entrada de numeros enteros
//		
//		System.out.println("Introduce otro numero:");
//		int numero2 = entrada.nextInt();
//		
//		System.out.println("La suma de ambos es:"+(numero+numero2));
//		
//		String nombre;
//		System.out.println("Introduce tu nombre");
//		entrada.nextLine(); //El metodo .nextLine, nos permite consumir los espacios
//		//que obviamente tambien son caracteres. En ocasiones, cuando ya utilizamos
//		//el Scanner, se queda "volando" un espacio en buffer
//		//y cuando entra en acción lo que hace es consumir ese espacion vació
//		
//		nombre=entrada.nextLine();
//		
//		System.out.println("Tu nombre es "+ nombre);
		
        //Seleccionar lo que no necesitamos ejecutar del codigo
		// CTRL+7, se comentan las lineas
		
		//Operador de modulo - Sirve para indicar el valor de residuo
		//de una divisaión
		
		int n = 10;
		
		int divisor = 3;
		//El operador modulo me devuleve el valor del residuo de la división
		int resultado1 = n%divisor;
		
		int resultado2 = n/divisor;
		
		
		System.out.println("El resultado es: "+resultado2+" El residuo es: "+resultado1);
		
		
		
		
								
		}

}
