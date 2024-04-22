package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		
		// USO DE LAS CLASES: FILE, FILE READER Y BUFFERREADER
		// Cada una sirve para una tarea específica
		// File: identifica la ruta del archivo
		// FileReader: permite abrir el archivo en modo lectura
		// BufferReader: permite leer el contenido del archivo y acceder al mismo
		
		// Declaro un String donde pueda guardar la infromación que se leera de un archivo de prueba
		
		String linea;
		
		// Utilizar la estructura TRY&CATCH para intentar realizar
		// la comuniación o lectura del archivo y asi poder controlar una excepción
		// si este surgiera
		
		try { // Aqui se intenta ejectur el siguiente bloque de código
			
			// Clase File: es la respresentación del archivo en la memoria
//			File archivo = new File("C:\\Users\\andre\\OneDrive\\Escritorio\\.errorcreado.fichero.txt");
//			
//			// Para poder leer el archivo se hace uso de la clase FileReader
//			FileReader fr = new FileReader(archivo);
//			
//			// Ahora si vamos a leer el contenido del archivo con BufferReader
//			BufferedReader buffer = new BufferedReader(fr);
//			
//			// Ya que se pudo acceder al contenido y leerlo, será guardado en el "String linea"
//			// para poder mostrarlo en consola
//			// linea = buffer.readLine();
//			
//			// PARENTESIS: Si quiero leer más lineas de texto voy a recurrir al uso de un ciclo
//			while ((linea = buffer.readLine()) !=null) {
//				System.out.println(linea);
//			}

			//Entonces mando a imprimir en consola el valor de "linea"
			//System.out.println(linea);
			
			//Escritura de archivos: FileWriter
			File archivo = new File("C:\\Users\\andre\\OneDrive\\Escritorio\\fichero.txt");
			
			String nombre = "\nGeneración 157"; // "\n" sirve para introducir un salto de línea
			
			// Hacemos uso de la clar FileWriter para escribir información en el archivo
			FileWriter line = new FileWriter(archivo, true); // Agrego el valor booleano para respetar
			// la información contenida originalmente en nuestro archivo
			
			// Utilizamos el método .write para escribir el valor del "String nombre"
			line.write(nombre);
			
			// Para confirmar la escritura, utilizamos el metodo .close()
			line.close();
			
		} catch (Exception e) { // Aquí si algo falla se controla la excepción
			
			System.out.println("El archivo no fue encontrado");
			e.printStackTrace(); //Este método permite ver la trza de erro en consola, es decir,
			// ver la excepción que se atrapó
	
		}
		//Un error podria ser haber nombrado la ruta al declararla al principio
	}

}
