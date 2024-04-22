package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		
		/*USO DE LAS CLASES FILE, FILEREADER Y BUFFEREDREADER
		 * file- identifica la ruta del archivo
		 * FileReader - nos permite abrir el archivo en modo lectura
		 * BufferedReader - nos permite leer el contenido del archivo 
		 */
		
		/*Declaramos un String donde gusardar la informai�n 
		 * de un archivo de prueba
		 */
		String linea;
		
		/*Utilizar una estructura try & catch para intentar 
		 * realizar la comunicaci�n o lectura del archivo y as� poder 
		 * controlar una excepci�n si �sta surgiera
		 */
		
		try {
			
//			//representaci�n del archivo en memoria
//			File archivo =new File("C:\\Users\\Usuario\\Desktop\\fichero.txt");
//			
//			// para poderl leerlo se usa la reader
//			FileReader fr =new FileReader(archivo);
//			
//			//para leer el contenido
//			BufferedReader buffer = new BufferedReader (fr);
//			
//			//ya que accedimos al contenido ya se puede asignar para usarse
////			linea = buffer.readLine();
//			
//			//para leer m�s l�neas de txto se usa un ciclo
//			while((linea=buffer.readLine()) !=null) {
//				System.out.println(linea);
//			}
			
			//escritura de archivos - FileWriter
			
			String nombre = "\n Generaci�n 157";
			
			File archivo =new File("C:\\Users\\Usuario\\Desktop\\fichero.txt");
			
			FileWriter line = new FileWriter(archivo, true);
			
			line.write(nombre);
			line.close();
						
		}catch (Exception e) {
			System.out.println("No se encontr� el archivo");
			e.printStackTrace();
			//permite ver el error en consola osea el valor guardado en e
		}

	}

}
