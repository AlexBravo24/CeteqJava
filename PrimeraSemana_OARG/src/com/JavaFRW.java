package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		
		// Uso de lñas clases File, FileReader y BufferesReader
		//cada una nos sirve para una tarea especifica
		//File- Identifica la ruta del archivo
		//FileReader-nor permite abrir el archivo en modo lectura
		//BufferedReader- nos permite leer el contenido
		//del archivo y acceder al mismo
		
		//Declaramos un String donde podamos guardar la informacion 
		//que vamos a leer de un archivo de prueba
		
		String linea;
		
		//Utilizar una estructura try & catch para intentar 
		//realizar la comunicación o lectura del archivo y así poder
		//controlar una excepción si esta surgiera
		
		try {//Intentar ejecutar el siguiente bloque de codigo
			
			//Reprensentación del archivo en memoria
//			File archivo = new File("C:\\Users\\Usuario\\Desktop\\archivo.txt");
//			
//			//para poder leer el archivo hacemos uso de la clase FileReader
//			FileReader fr= new FileReader(archivo);
//			
//			//Ahora si vamos a leer el contenido del archivo con BufferedReader
//			BufferedReader buffer = new BufferedReader(fr);
//			
//			//Ahora que ya podemos acceder al contenido y leerlo, lo voy a guardar 
//			//en mi String linea para poder mostralo en consola
//			
//			//linea=buffer.readLine();
//			
//			//SI quiero leer más lineas de texto, voy a recurrir al uso de un ciclo
//			
//			while ((linea=buffer.readLine())!=null) {
//				System.out.println(linea);
//			}
			
			//Escritura de archivos - FileWriter
			String nombre = "\nGENERACIÓN 162"; // \n - es introducir un salto de linea 

			File archivo = new File("C:\\Users\\Usuario\\Desktop\\fichero.txt");
			
			//Hacemos uso de la clase FIleWriter para escribir información en el archivo
			FileWriter line = new FileWriter(archivo,true); //Agrego el vcalor booleano
			//true para respetar la información contenida en nuestro archivo originalmente
			
			//Utilizamos el metodo.write para escribir en nuestro archivo el valor
			//del String nombre
			line.write(nombre);
			
			//Para confirmar la escritura, utilizamos el metodo .close();
			line.close();
			
						
		} catch (Exception e) { //Si algo falla, se controla la excepción
			System.out.println("No se encontro el archivo");
			e.printStackTrace();//Este metodo me permite ver la traza de error en consola
			                    //es decir, ver la excepción que se atrapo aquí
			
			
			
		}

	}

}
