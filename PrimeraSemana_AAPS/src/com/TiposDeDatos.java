package com;// nombre del paquete

public class TiposDeDatos {// inicio de la clase
	
	// comentario de una sola l�nea
	
	/*
	 * comentarios 
	 * de 
	 * multiples 
	 * l�neas
	 * 
	 */
	public static void main(String[] args) {//apertura del m�todo main
		// el m�todo main es el punto de entrada o ejecuci�n
		// de una clase principal o clase Java
		// para llamar al m�todo main solo se escribe "main"  y se presiona ctrl+espacio
		
		// TIPOS DE DATOS PRIMITIVOS
		
		// NUMERICOS ENTEROS
		
		// Presionar ctrl+s para guardar los cambios en el c�digo o clase
		
		// Puedo declarar a las variables sin un valor num�rico asginado incialmente, por ejemplo:
		byte by;
		
		// M�s adelante puedo asginarle un valor llamandola:
		by = 120;
		
		// Tambien es posible declarar a las variables con valores asginados inicialmente:
		byte numero1 = 127; // 1 byte de memoria solo permite asignar valores de -128 hasta 127, fuera de ese rango marca error
		
		//En cambio:
		short numero2 = 32767; // short equivale a 2 bytes de memorsia solo soportan de -32768 hasta 32767, fuera de esos valores marca error
		
		//Posteriormente:
		int numero3 = 2147483647; // int equivale a 4 bytes de memoria
		
		//Por otra parte:
		long numero4 = 21474836411L; // long equivale a 8 bytes de memoria y requiere el subfijo "l" o "L" para contener valores fuera del rango que abarca int
		
		int resultado = numero1 + numero2; // el subrayado amarillo solo indica que no he utilizado una variable, por ejemplo numero3 y numero4 siguen subrayadas porque no las he usado
		
		// El tipo de dato comodin o mas utilizado en los enteros es el int
		
		// NUMERICOS EN COMA FLOTANTE
		// Aquellos que permiten almacenar valores con decimales
		
		float numero5 = 3.1416F; // float ocupa 4 bytes de almacenamiento y necesita del subfijo "f" o "F"
		
		// Tambien:
		double numero6 = 3.141655787980; // double ocupa 8 bytes  de almacenamiento
		
		// El tipo de dato double es el comdin o mas utilizado para declarar valores decimales
		
		// BOOLENOS
		// CARACTER
		
		boolean evalua = true; // boolean solo adminten true or false y sirven para evaluar expresiones o condiciones
		
		char caracter = 'a'; // char solo puede almacenar un caracter a la vez entre comillas simples
		
		// TIPOS DE DATOS NO PRIMITIVOS
		// tambien llamados tipos de dato objeto o estructurados 
		// TIPOS DE DATOS WRAPPER
		// Estos tipos de dato son clases, es posible identificarlos porque el tipo de dato incia con mayuscula 
		
		//CADENA DE TEXTO
		String nombre = "Andres Alejandro";
		
		String cadena = "Hola mundo";
		
		String chain; // el tipo de dato string admite secuencias de caracteres como simbolos, espacios, letras, numeros, etc
		
		String numeroTexto = "34"; // el numero se almacena como texto no como un valor num�rico que pueda utilizar para hacer operaciones
		
		// WRAPPER 
		// envuelven a los datos primitivos en clases para poder orotrgarse ciertos comportamientos o m�todos
		
		Byte numero11 = 127; 
		
		numero5 = 2.54F; // al haber llamado a numero5 y asignado a este un nuevo valor, de esta l�nea de c�digo en adelante numero5 tendr� este valor, en las lineas anteriores su valor es el asignado en un principio
		
		numero11.toString(); // toString convierte a cadena de texto el valor de mi tipo de dato primitivo 
		
		// Existen otros tipos de dato Wrapper como Integer, Short, Double, Float, Character, Boolean, entre otros
		
		// Para darle salida a los datos en consola:
		System.out.println("Hola mundo"); 
		
		// Un atajo para escribir la l�nea de impresi�n en consola m�s r�pido es escribir syso y ctrl+espacio, tambien sout  con ctrl+espacio
		
		System.out.println(nombre);
		
		System.out.println(resultado);
		
		System.out.println(5+6);
		
		System.out.println("La suma es:" + 5+6);// cuando se quiere mostrar texto y una operaci�n entramos en algo conocido como concatenaci�n
		
		System.out.println("La suma es:" + (5+6));// aqui ya esta bien escrito, evitando la concatenaci�n 
		
		} // cierre del m�todo main		
	
	} // cierre de la clase
