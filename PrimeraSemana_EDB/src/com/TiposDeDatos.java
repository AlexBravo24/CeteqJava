package com; //nombre del paquete

public class TiposDeDatos { //inicio de la clase
	
	// Comentario de una sola linea
	
	/*
	 * comentarios
	 * de
	 * multiples
	 * lineas
	 * 
	 */
	
	public static void main(String[] args) {//apertura del metodo main
		//El metodo main es el punto de entrada o ejecucion 
		//de una clase principal o clase java
		
		// main + espacio y se genera automaticamente el metodo
		
		//TIPOS DE DATOS
		//TIPOS DE DATOS PRIMITIVOS 
		//NUMERICOS ENTEROS
		
		// Declararlas sin un valor numerico asignado inicialmente
		byte by; 
		
		//Más adelante puedo asignarle un valor
		by = 120;
		
		//Declarar nuestras variables con valores
		// asignados inicialmente
		byte numero1 = 127; //1 byte  -128 a 127
		short numero2 = 30000; //2 bytes -32768 a 32767
		int numero3 = 2147483647; //4 bytes
		long numero4 = 2147483649L; //8 bytes -requiere el sufijo 
		// de la letra "L" para contener valores mas alla de los tipo int
		
		int resultado = numero1 + numero2;
		
		//El tipo de dato comodín o más utilizado en los enteros
		//es el tipo de dato int
		
		//TIPOS DE DATIS NUMÉRICOS EN COMA FLOTANTES
		//(DECIMALES)
		float numero5 = 3.1416F; //4 bytes y necesitan el sufijo F
		double numero6 = 3.141655787980; //8 bytes
		
		//El tipo de dato double es el dato comodín o más utilizado
		//para declarar valores decimales
		
		
		//TIPOS DE DATOS PRIMITIVOS 
		//Booleanos
		//Caracter 
		
		boolean evalua = true; //Solo admiten valores true or false
		//y sirven para evaluar expresiones o condiciones 
		
		char caracter = 'a'; //Solo puede almacenar un caracter a la vez
		//entre comilla simple
		
		
		
		//TIPOS DE DATOS NO PRIMITIVOS 
		//TIPOS DE DATO OBJETO/ESTRUCTURADOS
		//TIPOS DE DATO WRAPPER
		//Estos tipos de dato son clases, los vamos a identificar
		//porque el tipo de dato inicia con Mayúscula
		
		//Cadena de Texto
		String nombre = "Esteban Dorantes"; 
		
		String cadena = "Hola mundo"; 
		
		String chain;
		
		//El tipo de dato String admite secuencias de caracteres
		//(simbolos, espacios, letras, numeros, etc)
		String numeroTexto = "34";
		
		
		//Tipos de dato Wrapper o envoltorio
		//Envuelven a los datos primitivos en clases para poder otorgarles
		//ciertos comportamientos o métodos
		Byte numero11 = 127; 
		
		numero11.toString(); //Convierte a cadena de texto el valor de mi
		//tipo de dato primitivo
		
		//Integer, Short, Double, Float, Character, Boolean....
		
		
		//Darle salida a los datos en consola
		System.out.println("Hola mundo");
		
		//Un atajo para escribir la linea de impresion en 
		//consola mas rapido
		//syso + ctrl + espacio
		//sout + ctrl + espacio
		System.out.println();
		
		System.out.println(nombre);
		
		System.out.println(resultado);
		
		System.out.println(5+6);
		
		//Cuando queremos mostrar texto y una operación 
		//Entramos en algo que se conoce como concatenación
		System.out.println("La suma es:" + (5+6));		

		
		
	}// cierre del metodo main
	
	
}// cierre de la clase
