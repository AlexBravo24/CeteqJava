package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		
		// Uso de las clases File, FieReader y BufferReader
		//File - identifica la ruta del archvo
		//FileReader - permite abrir el archivo en modmo lectura
		//BufferedReader - permie leer el contenido del archivo y acceder al mismo
		
		//Declaramos un string donde podamos guardar la informacion que vamos a leer de un archivo de prueba
		String linea;
	
		//Utilizar na estructura try & catch para intentar realizar la comunicacion olectura del archivo 
		//y asi poder controlar una excepcion si esta surgiera
		
		try {//intenta ejecutar el siguiente bloque de codigo
			//Clase file - Representacion del archivo en memoria
//			File archivo = new File("C:\\Users\\Ariel\\Desktop\\fichero.txt");
			
			//para poder leer el archivo usamos la claseFileReader
//			FileReader fr = new FileReader(archivo);
			
			//Se lee el contenido del archivo con BufferedReader
//			BufferedReader buffer = new BufferedReader(fr);
			
			//Ahora que ya se pede acceder al contenido y leerlo, lo voy a guardar en i String
			//linea para poderlo mostrar en consola
			//linea = buffer.readLine();
			
			//si quiero leer mas lineas de texto debemos recorrer a un ciclo
//			while ((linea = buffer.readLine()) !=null) {
//			System.out.println(linea);
//			}
			
			//Escritura de archivos - File Writer
			String nombre = "\nGenereacion 158"; // "\n" al inicio de string sirve para hacer un salto de linea
			                                     // si no se pone, junta todo
					
			File archivo = new File("C:\\Users\\Ariel\\Desktop\\fichero.txt");
			
			//Hacemos uso de la clase FileWriter para escribir info en el archivo
			FileWriter line = new FileWriter(archivo, true); //Agrego el valor booleano true para respetar la info contenida en el archivo original
			
			//Utilizamos el metodo .write ára escribir en nuestro archivo el valor del String nombre
			line.write(nombre);
			
			//Para confirar la escritura utilizamos el etodo .close() (si no se hace borra todo en el archivo)
			line.close();
			
								
		} catch (Exception e) {//si algo falla se controla la excepción
			System.out.println("No se encontró el archivo");
			
			e.printStackTrace(); //Este metodo me permite ver la traza de error en consola, es decir
			                     //ver la excepcion que se atrapo aqui
			
		}
		
		
	}

}
