package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		// uso de las clases File, FileReader y BufferedReader
		//cada una nos sirve para una tarea especifica
		//File - identifica la ruta del archivo
		//FileReader nos permite abrir el archivo en modo lectura
		//BufferedReader - nos permite leer el contenido del archivo
		//y acceder al mismo
		
		//declaramos un String donde podamos guarda la informaicon
		//que vamos a leer de un archivo de prueva
		String linea;
		
		//utilizar una estructura try & catch para intentar
		//realizar la conmunicacion o lectura del archivo y asi poder
		//controlar una excepcion si esta surgiera
		
		try { //intentar ejecutar el siguiente bloque de codigo
			//clase file - representacion del arvhico en memoria
//			File archivo = new File("C:\\Users\\acast\\OneDrive\\Desktop\\fichero.txt");
//			//para pode leer el archivo hacemos uso de la clase FileReader
//			FileReader fr = new FileReader(archivo);
//			
//			//ahora si vamos a leer el contenido del archivo con BufferedReader
//			BufferedReader buffer = new BufferedReader(fr);
//			
//			//Ahora que ya podemos acceder al contenido y leerlo, lo voy a guardar
//			//en mi String linea para poder mostralo finalmente en consola
//			//linea = buffer.readLine();
//			
//			//si quiero leer mas lineas de texto voy a recurrir al uso de un 
//			//ciclo
//			while((linea = buffer.readLine()) != null) {
//				
//				System.out.println(linea);				
//			}
			
			//escritura de archivos - FileWriter
			
			String nombre = "\nGENERACION 157"; //  \n - es introducir un salto de linea
			
			File archivo = new File("C:\\Users\\acast\\OneDrive\\Desktop\\fichero.txt");
			
			//Hacemos uso de la clase FileWriter para escribir informacion en el archivo
			FileWriter line = new FileWriter(archivo, true); // agrego el valor booleano true para respetar
			//la informacion contenida en nuestro archivo otiginalmente
			
			// utilizamos el metodo .write para escribir en nuestro  archivo el valor del string nombre
			line.write(nombre);
			
			//para confirmar la escritura, utilizamos el metodo .close()
			
			line.close();
			
					
			
		} catch (Exception e) { //si algo falla, se controla la excepcion
			// TODO: handle exception
			System.out.println("No se encontro el archivo");
			e.printStackTrace();//este metodo me permite ver la traza de error en consola
								// es decir ver la exepcion que se atrapo aqui
			
		}

	}

}
