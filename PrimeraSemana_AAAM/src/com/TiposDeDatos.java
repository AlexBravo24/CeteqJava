package com; //nombre del paquete

public class TiposDeDatos { //inicio de la clase

	// Comentario de una sola linea
	
	/*
	 * Comentarios
	 * de
	 * multiples
	 * lineas
	 */
	
	public static void main(String[] args) { //apertura del metodo main
		//El metodo main es el punto de entrada o ejecucion de una clase principal o clase java 
	
	
	//main + ctrl + espacio y se genera automaticamente el metodo main
	
	//TIPOS DE DATOS
	//TIPOS DE DATOS PRIMITIVOS
	//NUMERICOS ENTEROS
	
	//declararla sin un valor numerico asignado
	byte by;
	
	//mas adelante asignarle un valor
	by= 120;
	
	byte numero1 = -128; //declarar variable con valor asignado inicial 1 byte - -128 a 127
	short numero2 = -32768; //2 bytes - -32768 a  32767
	int numero3 = 2147483647; //4 bytes
	long numero4 = 21474836479L; //8 bytes - requiere el sufijo de la letra "L" al final
	                             //para contener valores mas alla de int
	
	int resultado = numero1 + numero2;
	
	//El tipo de dato comodin o mas utilizado en los enteros es el tipo de dato "int"
	
	//TIPOS DE DATOS NUMERICOS EN COMA FLOTANTE
	//(DECIMALES)
	float numero5 = 3.1416F; //4 bytes y necesitan el sufijo "F" para almacenar el valor
	double numero6 = 3.141655787980; //8 bytes, no necesita sufijo
	
	//el tipo de dato double es el dato comodin para valores decimales
	
	//TIPOS DE DATOS PRIMITIVOS
	boolean evalua = true; //Solo admiten valores true o false y sirven para evaluar expresiones
	                       //o condiciones
	char caracter = '$'; // Solo puede almacenar un caratcer a la vez entre comilla simple
	
	//TIPOS DE DATOS NO PRIMITIVOS
	//TIPOS DE DATO OBJETO, ESTRUCTURADO
	//TIPOS DE DATOS WRAPPER
	//Estos tipos de datos son clases, los idenmtificamos porque inicia con mayuscula
	
	//Cadena de texto
	String nombre = "Ariel Alejandro Aguilar Martinez";
	String cadena = "Hola mundo";
	String unassigned;
	//admite secuencias de caracteres (simbolos, espacios, letras, numeros, etc)
	String numText = "34";
	
	//Wrapper o envoltorio envuelven a los datos primitivos en clases para otorgarles ciertos
	//comportamientos o metodos
	Byte numero11 = 127;
	
	numero5 = 2.54F; //aqui le cambiamos valor a numero5
	
	numero11.toString(); //convierte a cadena de texto el valor de mi tipo de dato primitivo
	
	//Darle salida a los datos en consola
	
	System.out.println("Hola mundo");
	
	System.out.println(nombre);
	
	//Cuando queremos mostrar texto y una operacion concatena los numeros
	System.out.println("La asuma es: " + 5+6);
	
	//poniendo entre parentesis los valores numericos, realiza la operacion
	System.out.println("La suma es: " + (5+6));
	
	//syso + ctrl + espacio 
	//sout + ctrl + espacio, Ambos son atajos para system.out.println() 
	
	} //cierre del metodo main
	
	
	
} //cierre de la clase
