package com;

public class TiposDeDatos {
	public static void main (String  [] args) {
		
		byte by;
		by=120;
		
		byte numero1 =-128;
		short numero2 = -30000;
		int numero3 = 2147483647; //ES EL TIPO DE DATO COMODÍN O MÁS UTILIZADO EN LOS ENTEROS 
		long numero4 = 2147483649L;
		
		int resultado  = numero1 + numero2;
		 //tipos de datos numéricos 
		//decimales
		
		float numero5 = 3.1416F; //FLOAT OCUPAN 4 BITS DE ALMACENAMIENTO Y NECESITAN SUFIJO F
		double numero6 = 3.14165; //no requiere un sufijo y tiene 8 byts
		//para declarar valores en decimales
		
		 //TIPOS DE DATOS PRIMITIVOS
		
		//BOOLEANOS
		//CARACTER
		boolean  evalua  = true; //para valores true o false y sirve para evaluar expresiones o condiciones
		char caracter  = 'a'; //solo almacena un caracter a la vez 
		  
		//TIPOS DE DATOS PRIMITIVOS
		//TIPOS DE DATOS OBJETO/ESTRUCTURADOS
		//El tipo de dato empieza con mayúscula
		
		String nombre = "Judith Bueno"; //El tipo de string admite secuencias de caracteres como simbolos, espacios numeros
		String cadena = "Hola mundo";
		String chain;
		
		String numeroTexto = "34";
		
		//TIPOS DE DATOS WRAPPER O ENVOLTORIO, se encargan de envolver los datos para poder otorgarles comportamientos o métodos
		
		Byte numero11 = 127;
		numero11.toString(); //lo convierte en tipo de dato primitivo
		
		
		//SALIDA A LOS DATOS DE CONSOLA
		System.out.println("Hola mundo");
				
		System.out.println();
		
		System.out.println(nombre);
		
		System.out.println(resultado);
		System.out.println(5 + 6);
		System.out.println("La sumas es : "+(5+6)); //cuando queremos mostrar texto y resultado = concatenacion
		
		
				
		
		
	
	}

}
