package com;//Nombre del paquete

public class TiposDeDatos {//Inicio de la clase
//ESTO ES UN COMENTARIO (DE UNA SOLA LINEA)
	
/*
 * Esto sirve para hacer comentarios de multiples lineas
 * Si precionamos enter nos crea mas lineas 
 */
	

public static void main(String[] args) {
//El metodo main es el punto de entrada o ejecucion de una clase principal o clase java
//Para generar automaticamente es: main + ctrl + espacio
	
/*
 * Tipos de datos
 * Tipos de datos primitivos
 * Numericos enteros
 * para guardar cambios en codigo/clase: CTRL + S
 */
	//Declaracion de variable sin valor numerico asignado inicialmente
	byte by;
	
	//Se le puede asignaar mas adelante el valor
	by = 120;
	
	//Declarar nuestras variables con valores asignados desde el inicio
	byte N1 = 127;//1 byte :-128 a 127
	short N2 = 32767;//2 bytes -32768 a 32767
	int N3  = 2147483647;//4 bytes
	long N4 = 2147483647911L;//8 bytes Requieren el sufijo de la letra
	//L para contener valores mas alla de los tipos int
	// EL TIPO DE DATO int ES EL DATO MAS UTILIZADO
	int resultado = N1 + N2;
	
	//Las variables se ponen en amarillo para avisarte que no se estan utilizando, entonces podrias plantearte si usarlas o no
	
	
	//TIPOS DE DATOS FLOTANTES (DECIMALES)
	float N5 = 3.1416f;//4 Bytes y se necesita el sufijo f
	double N6 = 3.14159800;//8 Bytes
	//El tipo de dato double es el dato comodin o más utilizado para declarar valores decimales
	
	//TIPOS DE DATOS PRIMITIVOS
	
	//Booleanos 
	//Caracter
	boolean Evalua = true;//Sirve para evaluar expresiones o condiciones ya sean true or false
	char Caracter= 'a';//Solo almacena un caracter a la vez y solo funciona con comilla simple
	
	//Tipos de datos NO PRIMITIVOS
	//Tambien conocidos como TIPOS DE DATO OBJETO/ESTRUCTURADOS Y WRAPPER
	//Estos tipos de datos son clases, los vamos a identificar porque
	//el tipo de dato inicia con mayuscula
	
	//Cadena de texto (str)
	String Nombre = "Vince Gomez"; 
	String Apellido = "Gomez Dominguez";
	String cadena;
	
	//En el string cadena podemos asignar un valor mas adelante
	cadena = "Primer str";
	//El tipo de dato String admite secuencias de caracteres
	//(Simbolos,espacios, letras, numeros, etc)
	String NumeroEnTexto = "27";
	//este tipo de dato para poder sumarlo debemos de convertirlo en un dato numerico
	
	//Tipos de dato Wrapper o envoltorio
	//Estos envuelven a los datos primitivos en clases para 
	//poder otorgarles ciertos comportamientos o metodos
	Byte N7 = 25;
	
	N7.toString();//Al hacer esto cambiamos el valor de numero a string
	//esto es gracias a que escribiendo Byte en lugar de byte se convierte 
	//en un Wrapper agregandole caracteristicas adicionales y lograr hacer esto
	
	
	//Darle salida a los datos en consola
	System.out.println("Hola mundo");
	//Para escribirlo mas rapido escribimos Sout/syso + ctrl + espacio
	System.out.println(cadena);
	//El tipo de dato primitivo inicia con minuscula y despues la variable
	System.out.println(Nombre +" "+ Apellido);
	System.out.println(resultado);
	
	//Para evitar que numeros se concatenen como en el siguiente ejemplo
	System.out.println("Suma de 5+5:"+5+5);
	//debemos establecer la suma entre parentesis o la operacion para evitar 
	//que esto nos suceda, como el siguiente ejemplo
	System.out.println("Suma de 5+5:" +(5+5));
}//Cierre del metodo main
}//Cierre de clase
