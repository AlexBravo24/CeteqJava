package com;

public class Persona {
	
	/*ABSTRACCI�N-DEFINIR LOS ATRIBUTOS Y M�TODOS QUE AYUDAN A CREAR DICHOS OBJETOS
	 * 
	 * ATRIBUTOS
	 * EJ. nombre, edad, genero, colr, etc
	 * 	 */
	//ENCAPSULAMIENTO - Proteger la informaci�n de accesos o modificaciones no autorizadas
	//default, public, protected, private
	
	private String nombre;
	private String genero;
	private static int edad=30;
	
	//M�todos constructores
	/*m�todo vaci�, nos permite crear o instanciar al objeto nis ning�n atibuto
	 * inicial
	 */
	//finciona como un comodin ya que con eso se puede iniciar 
	public Persona() {
		
	}
	
//M�TODO CON TODOS SUS ATRIBUTOS O PAR�METROS PARA INSTANCIAR CON VALORES ASIGNADOS
	public Persona(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
	}
	
	
	public Persona(String nombre) {
	super();
	this.nombre = nombre;
	}

	//m�todos Getters y Setters
	/*Proporcionan acceso a los atributos de nuestro objeto
	 * permitiendonos asignar un valor (setters) 
	 * o recuperarlo (Getters)
	 */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public static void setEdad(int edad) {
		Persona.edad = edad;
	}
	
	//m�todo ToString permite visualizar los datos a modo de string
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	
	
	
	
	

}
