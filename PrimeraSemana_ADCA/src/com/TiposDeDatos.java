package com;//nombre del paquete

public class TiposDeDatos { //inicio de la clase
	
	//Comentario de una sola linea
	
	/*comentario
	de
	multiples
	lineas */
	public static void main(String[] args) {//apertura del metodo main
		//El metodo main es el punto de entrada o ejecucion
		//de una clase principal o clase Java
		// main + ctrl + espacio y se genera automaticamente el metodo
		//TIPOS DE DATOS PRIMITIVOS
		//NUMERICOS ENTEROS
		//CTRL + S para guardar los cambios en el codigo/clase
		
		//Declarar sin un valor numerico asignado inicialmente
		byte by;
		//Mas adelante puedo asignarle un valor
		by = 120;
		//Declarar nuestras variables con valores
		//asignados inicialmente
		byte numero1 = -128; //1 byte - -128 a 127
		short numero2 = -32768; //2 bytes -32768 a 32767
		int numero3 = 2147483647; //4 bytes
		long numero4 = 21474836411L; //8 bytes - requiere el sufijo 
		// de la letra "L" para contener valor

		int resultado = numero1 + numero2;
		//El tipo de dato comodin o mas utilizado en enteros 
		// es el tipo de dato int
		
		//TIPOS DE DATOS NUMERICOS EN COMA FLOTANTE
		//(DECIMALES)
		float numero5 = 3.1416F;//4bytes y necesitaan el sufijo "F"
		double numero6 = 3.14165521651; //8 bytes
		
		//El tipo de dato double es el dato comodin o el mas utiizado
		// para declarar valores decimales
		
		//TIPOS DE DATOS PRIMITIVOS
		//Booleanos
		//Caracter
		
		boolean evalua = true; // Solo admiten valores tue or false
		// y sirve para evaluar expresiones o condiciones
		
		char caracter = 'a'; //Solo puede almacenar un caracter simple
		// entre comillas simples
		
		//TIPOS DE DATOS NO PRIMITIVOS
		//TIPOS DE DATOS OBJETO/ESTRUCTURADOS
		//TIPOS DE DATOS WRAPPER
		//Estos tipos de datos son clases, los vamos a identificar
		//porque el tipo de dato inicia con Mayuscula
		
		//Cadena de Texto
		String nombre = "Alejandro Castellanos";
		
		String cadena = "Hola mundo";
		
		String chain;
		
		//El tipo de dato String admite secencias de carcteres
		//(simboloes, espacios, letras, numeros, etc)
		
		String numeroTexto = "34";
		
		//Tipos de datos Wrapper o envoltorio
		//Envuelven a los datos primitivos en clases para poder
		//otorgarles ciertos comportamientos o metodos
		Byte numero11 = 127;
		
		numero11.toString(); //convierte a cadena de texto
		//tipo de dato primitivo
		//Integer, Short, Double, Float, Character, Boolean...
		
		
		
		System.out.println("Hello World");
		
		//Un atajo para escribir la linea de impresion en consola
		//mas rapido es escribiendo
		//syso + ctrl + espaico
		//sout + ctrl + espaico
		System.out.println();
		System.out.println(nombre);
		System.out.println(resultado);
		System.out.println(5+6);
		System.out.println("la suma es: "+ 5+6);
		//esta ulitma se hace una concatenacion y no se realiza 
		//la operacion
		System.out.println("la suma es: "+ (5+6));
	}//cierre del metodo main

}
