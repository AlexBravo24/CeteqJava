package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		// Uso de las clases File, File reader y butteredReader
		//CAda una nos sirve para una tarea especifica
		//File identifica la ruta de un archivi
		//File Reader nos permite abrir el archivo en modo lectura
		//BufferedReader nos permite leer el contenido del archivo y acceder al mismo
		
		//Declaramos un String donde se va a guardar la informacion
		// que vamos a leer de un archivo de prueba
		
		String linea;
		
		// usar una estructura try & catch para intentar
		//realizar la comunicacion o lectura del archivo, asi podemos
		//controlar una excepcion si esta sugiriera
		
		try { //intentar ejecutar al siguiente bloque de codigo
			
//			File archivo= new File("C:\\Users\\Lenovo\\Desktop\\fichero.txt"); //ubica al archivo
//			//clase file, representacion del archivo en memoria
//			
//			//Para poder leer el aerchivo usamos la clase fileReader
//			FileReader fr=new FileReader(archivo);
//			//Clase FileREader, prepara al archivo para el modo lectura
//			
//			//Ahora vamos a leer el contenido del archivo con BufferedReader
//			BufferedReader buffer = new BufferedReader(fr);
//			
//			//Ahora que ya podemos acceder al contenido y leerlo, lo voy a guardar 
//			//en mi string linea para poder mostrarlo finalmente
//			//linea = buffer.readLine();
//			
//			//Si quiero leer mas lineas de texto voy a recurrir a un ciclo
//			while((linea=buffer.readLine()) != null) {
//			System.out.println(linea);
			//}
			
			//Escritura de archivos FileWriter
			String nombre="\nGeneracion 2018";//\n es introducir un salto de linea
			File archivo= new File("C:\\Users\\Lenovo\\Desktop\\fichero.txt");
			//Hacemos uso de la clase file weite para escribir informacion en el archivo
			FileWriter line =new FileWriter(archivo,true);//agrego el valor boleeano
			//true para que no borre la info que ya esta en el archivo
			
			//utilizamos el metodo .write para escribir en el archivo el valor de el strong nombre
			line.write(nombre);
			
			//Para confirmar la escritura usamos el metodo .close
			line.close();
			
		} catch (Exception e) {//si algo falla, se controla la excepcion
			System.out.println("No se encontro el archivo");
			e.printStackTrace();//este metodo me permite ver la traza de error en consola
			//es decir, ver la excepcion que se atrapo aqui
		}
	}

}
