package com;//nombre del paquete

public class TiposDeDatos { //inicio de la clase
	
    // comentario de una sola linea
	
	/*
    * Comentarios 
    * de
    * multiples
    * lineas
    *
    */

public static void main(String [] args) {// apertura del método main
	//El método main es el punto de entrada o ejecución
	//de una clase principal o clase Java

//main + ctrl+ espacio y se genera automaticamente el método 

//TIPOS DE DATOS
//TIPOS DE DATOS PRIMITIVOS
//NUMÉRICOS ENTEROS 

 //CTRL + S para guardar los cambios en el código/clase 

	//Declararlas sin un valor numérico asignado inicialmente
   byte by;
 
 //Más adelante puedo asignarle un valor
   by = 120;

  //Declarar nuestras variables con valores
   //asignados inicialmente
   byte numero1 = -128; //1 byte - - 128 a 127
short numero2= -32768; //2bytes - -32768 a 32767
int numero3 =2147483647; //4 bytes 
long numero4 = 2147483649L; //8 Bytes - requieren el sufijo 
//de la letra "L" para contener valores más alla de los tipo 

int resultado = numero1 + numero2;

//El tipo de dato comodín o más utilizado en los enteros 
//es el tipo de dato int

//TIPOS DE DATOS NUMÉRICOS EN COMA FLOTANTE 
//(DECIMALES)
float numero5 = 3.1416F; //4bytes y necesitan el sufijo F
double numero6 = 3.141655787980; //8 bytes 

//El tipo de dato double es el dato comodín o más utilizado 
//para declarar valores decimales

//TIPOS DE DATOS PRIMITIVOS
//Booleanos
//Caracter

boolean evalua= true;//Solo admiten valores true or false
//y sirven para evaluar expresiones o condiciones 

char caracter = 'a'; //Solo puede almacenar un caracter a la vez
//entre comilla simple
 

//TIPOS DE DATOS NO PRIMITIVOS
//TIPOS DE DATO OBJETO/ESTRUCTURADOS
//TIPOS DE DATO WRAPPER
//Estos tipos de dato son clases, los vamos a identificar 
//porque el tipo de dato inicia con Mayúscula
                                                                         
//Cadena de Texto
String nombre = "Thania Monserrat"; 


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

//Integer, Shortm Double, Float, Character, Boolean....

//Darle salida a los datos en consola
System.out.println("Hola mundo"); 

//Un atajo para escribir la linea de impresion en consola 
//más rapido
//syso + ctrl + espacio
//sout + ctrl + espacio


System.out.println();
System.out.println(nombre);
System.out.println(resultado);
System.out.println(5+6); 
//Cuando queremos mostrar texto y una operacion
//Entramos en algo que se conoce como concatenación
System.out.println("La suma es: " + (5+6));
//Concatenar
System.out.println("El resultado de 46 + 4 es: " + (46+4));





}
}// cierre del método main
