package com; //Nombre del paquete

public class TiposDeDatos { //Inicio de la clase
	
	//Comentario de una sola linea
    /*
     * Comentraios
     * de
     * multiples 
     * lineas
     * 
     */
	
    public static void main(String[] args) {//Apertura del metodo main
		//El metodo main es el punto de entrada o ejecución 
    	//de una clase principal o clase Java
    	
    	//main + ctrl + espacio y se genera automaticamente el metodo
    	
    	//TIPOS DE DATOS
    	//TIPOS DE DATOS PRIMITIVOS
    	//NUMERICOS ENTEROS
    	
    	//CTRL + S PARA GUARDAR LOS CAMBIOS EN EL CODIGO / CLASE

    	//Declaralas sin un valor numerico asigando inicialmente
    	byte by;
    	
    	//Más adelante puedo asignarle un valor
    	by=120;
    	
    	//Declarar nuestras variables con valores 
    	//asignados inicialmente
    	byte numero1 = -128; // 1 byte - -128 a 127
    	short numero2 = -32768; //2 bytes -32768 a 32767
    	int numero3 = 2147483647; //4 bytes 
    	long numero4 = 2147483649L; //8 bytes - requieren el sufijo de la letra L
    	                            //para contener valores más alla de los tipo int
    	
    	int resultado = numero1 + numero2;
    	
    	//El tipo de dato comodín o más utilizado en los enteros
    	//es el tipo de dato int
    	
    	//TIPOS DE DATOS NUMERICOS EN COMA FLOTANTE
    	//(DECIAMLES)
    	float numero5 = 3.1416F; //4 bytes y necesitan el sufijo F
    	double numero6 = 31416; //8 bytes 
    	
    	//El tipo de dato doble es el datrop comodin o más utilizado para declarar 
    	//valores decimales
    	
    	//TIPOS DE DATOS PRIMITIVOS
    	//Booleanos
    	//Caracter
    	
    	boolean evalua = true; //Solo admiten valores true or false
    	// y sirven para evaluarar expresiones o condiciones
    	
    	char caracter = 'a'; //Solo puede almacenar un caracter a la vez 
    	//entre comilla simple
    	
    	//TIPOS DE DATOS NO PRIMITIVOS
    	//TIPOS DE DATO OBJETO / ESTRUCTURADOS
    	//TIPOS DE DATO WRAPPER
    	//Estos tipos de dato son clases, los vamos a indentificar 
    	//Porque el tipo de dato inicia con Mayúscula
    	
    	//Cadena de texto
    	String nombre = "Obed Armando"; 
    	
    	String cadena = "Hola mundo";
    	
    	String chain; 
    	
    	//El tipo dato string admite secuencias de caracteres
    	//(simbolos, espacios, letrsa, numeros, etc)
    	
    	String numeroTexto = "34";
    	
    	//Tipos de dato Wrapper o envoltorio
    	//Envuelven a los datos primitovos en clases para poder otrogarles 
    	//ciertos comportamientos o métodos
    	
    	Byte numero11 = 127; 
    	
    	numero11.toString(); //Convierte a cadena de texto el valor de mi
    	//tipo de dato primitivo
    	
    	//Integer, Short, Double, Float, Character, Boolean...
    	
    	//Darle Salida a los datos en consola
        System.out.println("Hola mundo");
       
        //Atajo para escribir la linea de impresion en consola más rapido
        //syso + ctrl + espacio
       //sout + ctrl + espacio
        
        System.out.println();

        System.out.println(nombre);
        
        System.out.println(resultado);
        
        System.out.println(5+6);
        
        //Cuando queremos mostrar texto y una operación entramos en alfo que se conoce
        //como concatenación
        System.out.println("La suma de 46 + 4 es: "+(46+4));
        
        
        
                             
       	}//Cierre del metodo main
	
	
} //Cierre de la clase
