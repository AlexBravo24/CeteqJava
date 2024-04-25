package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
//	Uso de las clases File, FileReader y BufferedReader
//	File - Identifica la ruta del archivo
//	FileReader - Nos permite abrir el archivo en modo lectura
//	BufferedReader - Nos permite leer el contenido del archivo y acceder al mismo

//	Para esto declaramos un String donde guardemos la infromacion a leer el archivo
//	de prueba
	String linea;
		
//	Utilizar una estructura try & catch para intentar realizar
//	la comunicacion o lectura del archivo y asi poder controlar
//	una excepcion si esta surgiera
try {//Intentar ejecutar el siguiente bloque de codigo
	//CLASE FILA - REPRESENTACION DEL ARCHIVO EN MEMORIA
	File archivo = new File("C:\\Users\\VAxel\\OneDrive\\Escritorio\\fichero.txt");
	//PARA LEER EL ARCHIVO USAMOS LA CLASE FileReader
//	FileReader fr = new FileReader(archivo);
	//Ahora leemos el archivo con BufferedReader
//	BufferedReader buffer = new BufferedReader(fr);
//	Ahora ya podemos acceder al contenido y leerlo, lo guardare en la
//	variable linea para mostrarlo finalmente en consola
//	linea=buffer.readLine();
//	Si quiero leer mas de una linea de texto se necesita usar un ciclo
//	while((linea = buffer.readLine())!=null) {
//		System.out.println(linea);
	//}
	
	//Escritura de archivos - FileWriter
	String nombre = "\nEl primer Hola Mundo por Vince";//la \n significa salto de linea desde el string
	//Usamos la clase FileWriter para escribir informacion en el archivo
	FileWriter line = new FileWriter(archivo,true);//Agregamos el valor booleano 
	//true para respetar la informacion que este ya tiene
	
	//Utilizamos el metodo .write para escribir en nuestro archivo el valor
	//del String nombre
	line.write(nombre);
	//Para confirmar la escritura usamos el metodo .close
	line.close();
} catch (Exception e) {//Si algo falla, se controla la excepcion
	System.out.println("No se encontro el archivo");
	e.printStackTrace();//Este metodo nos permite ver la tasa de error en consola
	//es decir, ver la excepcion que se atrapo aqui en e

}
		
		
		
		 
	}

}
