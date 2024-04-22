package com;

public class TiposDeDatos {
	
	//comentarios xD
	/*coments
	 * dos
	 * tres
	 * xD
	 * tipos de datos
	 * primitivos
	 * enteros
	 */
	
	public static void main (String [] args) {
		
		byte by; //se pueden declarar para llamar adelante ya sea con valor o sin valor
		byte numero1 =127;//se puede declarar con un valor inicial
		//no se puede repetir el nombre de las variables aunque sean declaradas dif.
		by=120; //se puede asignar cuando ya fue declarada sin volverla a declarar
		short numero2 = -32768; //el subrayado amarillo no es un error, es una advertencia de falta de uso de variable
		int numero3 =2147483647;
		long numero4 = 8529638565552L; //requieren el sufijo L para que el valor sea válido
		long pruve = 2L; //EN CUESTIÓN DE MEMORIA NO SE RECOMIENDA PARA NÚMEROS CHICOS, NO LO VALE
		long yop =by*pruve;
		
		//TIPOS DE DATOS NUMÉRICOS EN COMA FLOTANTE
		
		float numero5 = 3.1416f; //del mismo modo usa el"f"para funcionar
		/* para considerar el espaco en la memoria, sobre todo si es un espacio
		 * delimitado se debe considerar los tipos de datos primitivos que se 
		 * declaran, ya que ocupan el espacio de 1 a 8 bytes según su valor
		 */
		
		/* El dato estandar para enteros es el int
		 *  y para decimales el double
		 */
		
		double numero6 = 3.1415655787980;
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * Booleanos
		 * Caracter
		 */
		
		boolean evalua = true;
		/*sólo admite v o f y sirve para evaluar 
		 * expresiones o condiciones
		 */
		
		char caracter = '$';
		/*sólo permite almacenar un caracter a las vez
		 * entre comilla simple
		 */
		
		/*TIPOS DE DATOS NO PRIMITIVOS
		 * tipos de dato objeto/estructurados
		 * tipos de datowrapper
		 * son clases, por lo que el tipo de dato inica con mayúscula
		 */

		//CADENA DE TEXTO
		String nombre = "Deb";
		
		String cadena = "El famoso Hola mundo";
		
		String chain;
		/*se pueden declarar como variables vacías
		 * admite secuencias de caracteres (simbolos, espacios, letras, #, etc)
		 * Si se declara como texto un número sólo se guarda como texto
		 */
		
		String numeroTexto = "34";
		
		/*TIPOS DE DATO WRAPPER O ENVOLTORIO
		 * envuelven a los datos primitivos en clases para darles 
		 * ciertos comportamientos o métodos
		 */
		Byte numero11 =127; //ese sí se puede orientar a objetos
		
		numero5 = 2.54f; //Es posible cambiar el valor de una variable directamente cuando ya ha sido declarada antes
		
		// numero5. al ser un primitivo no pasa nada
		numero11.toString(); //al ser un wrapper se puede malear, cambiar y orientar a objetos
		
		
		//SALIDA DE DATOS EN CONSOLA
		
		System.out.println("hola mundo es total");
		System.out.println("todos lo usan, ridículo");
		
		System.out.println(); //SYSO +CTRL+SPACE
		System.out.println(nombre); //SOUT +CTRL+SPACE
		
		System.out.println("PARA MEZCLAR UNO CON OTRO: + " + nombre);
		
		System.out.println("PARA MEZCLAR UNO CON OTRO: " + (numero1*by));
		
		
		
		
	}
	

}
