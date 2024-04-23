package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {

		//Uso de las clases File, FileReader yBufferredReader
		//File - identificación de la ruta de archivo
		//FileReader - nos permite ver el archivo en modo lectura
		//BufferReader - nos permite leer el contenido del
		//archivo y acceder al mismo
		
		String linea;
		
		try {
			//Ubicación de la ruta del archivo en la memoria
//			File archivo = new File("C:\\Users\\shawf\\OneDrive\\Escritorio\\papas.txt");
//			
//			//Para poder acceder a la lectura del archivo contenido
//			FileReader fr = new FileReader(archivo);
//			
//			//Se lee el contenido del archivo
//			BufferedReader buffer = new BufferedReader(fr);
//			
//			//Se manda a llamar a la primera variable ¨linea¨ para poder
//			// leerlo en string en la consola
//			linea = buffer.readLine();
//			
//			
//			//Si quiero leer todas las lineas de texto, recurrir al ciclo while
//			while((linea = buffer.readLine()) != null) {
//				System.out.println(linea);
//			}
			
//			FileWriter - ESCRITURA DE ARCHIVO
			
			String nombre = "\ngeneracion";
			
			File archivo = new File("C:\\Users\\shawf\\OneDrive\\Escritorio\\papas.txt");
			
//			Hacemos uso de la clase FileWriter para escribir información en el archivo
			FileWriter line = new FileWriter(archivo, true); //se agrega true para respetar
			//el contenido original
			
//			Utilizamos el metodo .write para escribir en el archivo el valor de nombre
			line.write(nombre);
			
			line.close();
			
		} catch (Exception e) {
			System.out.println("No sé encontro el archivo");
		}
	}

}
