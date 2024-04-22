package com; //Nombre del paquete

public class TiposDeDatos { //Inicio de la clase

	//Los comentarios se añaden con dos diagonales
	/*
	 * Comentarios
	 * de
	 * multiples
	 * líneas  /* 
	 */
	public static void main(String[] args) {//apertura del metodo
		//El metodo main es el punto de entrada o ejecucion
		//de una clase principal o java
		
		//main+ctrl+espacio y se genera en automatico el codigo
		// ctrl+s Para guardar cualquier cambio
		
		//Tipos de datos
		//Tipos de datos primitivos
		//<<Números enteros>>
		
		//Declararlas sin un valor numerico asignado inicialmente
		byte by;
		//Más adelante puedo darle un valor
		by=120;
		
		/*Tambien podemos declarar las variables con valores
		 * asignados inicialmente
		 */
		byte numero1 =127; //1 byte -128 a 127
		short numero2 = 30000;//2 byte -32768 a 32767
		int numero3=2147483647; //4 byte -2147483648 a 2147483647
		long numero4= 2147483649L;// 8 bytes requieren el sufijo 
		// de la letra "L" para contener valores mas alla de los tipo int
		int resultado=numero1 + numero2;
		//El tipo de dato más utilixado en los enteros es int
		
		
		//<<Tipos de datos numericos en coma flotante, decimales>>
		float numero5=3.1416F; //4bytes Necesita el sufijo de la lentra "F"
		double numero6=3.141644787980; //8 bytes
		//El tipo de dato double es el dato comodin o mas utilizado
		//para declarar valores decimales
		
		//<<Tipos de datos primitivos>>
		//Booleanos
		//Caracter
		
		boolean evalua=true; //solo admiten valores true or false
		// y sirven para evaluar expresiones o condiciones
		
		char caracter='&';//Solo puede almacenar un caracter a la vez
		//entre comilla simple
		
		//TIPOS DE DATOS NO PRIMITIVOS
		//Tipos de dato objeto//Estructurados
		//Tipos de dato wapper
		//Estos tipos de dato son clases, los vamos a indentificar
		//porque el tipo de dato inicia con mayuscula
		
		//Cadena de texto
		String nombre= "Maryjose Ortega Castillo";
		String cadena= "Hola mundo";
		String chain;
		// El tipo de dato Srting admite secuencias de caracteres
		//(Simbolos, espacios, letras, numeros, etc)
		
		//Tipos de dato Wrapper o envoltorio
		/*
		 * Envuelven a los datos primitivos en clases para poder
		 * otorgarles ciertos comportamientos o metodos
		 */
		Byte numero11=127;
		
		numero11.toString(); // convierte en cadena de texto el valor del
		//tipo primitivo
		
		//Integer, Short, Double, Float, Character, Boolean
		
		//Darle salida a los datos en consola
		System.out.println("Hola mundo");
		
		//Un atajo para escribir la linea de impresion en consola
		//mas rapido
		//syso+ctrl+espacio
		//sout+ctrl+espacio
		System.out.println();
		System.out.println(nombre);
		System.out.println(resultado);
	
		//Cuando queremos mostrar texto en una operacion
		//entramos en algo que se llama concatenacion
		System.out.println("la suma es:"+ 5+6);
		//Para que haga la operacion se ponen parentesis
		System.out.println("la suma es:"+ (5+6));
		
		
	}//Cierre del metodo main
	
	
} //Cierre de la clase
