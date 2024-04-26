package com;

public class Persona {
	
	//ABSTRACI�N - DEFINIR LOS ATRIBUTOS Y METODS 
	//QUE NOS AYUDARAN A CREAR A MUESTROS OBJETOS
	
	//ATRIBUTOS
	//EJ. nombre, edad, genero, color, nacionalidad, nivel educativo, etc.
	
	//ENCAPSULAMIENTO - Proteger la infotmaci�n de accesos o modificaciones no autorizadas 
	//default, public, protected, private
	
	private String nombre;
	private String genero;
	private static final int edad = 30;  //Se crean valores constantes o valores inmutables
	
	
	//M�todos Constructores
	
	//M�todo constructor vac�o - este nos va a permitir crear o instanciar a nuestro objeto 
	//sin ningun atributo a�n
	
	//FUNCIONA COMO UN "dummie" O COMODIN
	
	public Persona() {
		
	}

	//M�todo constructor con todos los atributos o parametros
	//Nos permite instanciar a nuestro objeto pero ya con sus valores asignados en sus atributos
	public Persona(String nombre, String genero) {
		super();
		this.nombre = nombre;
		this.genero = genero;
	}

	
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	//M�todos Getters y Setters
	//Proporcionan acceso a los atributos de nuestro objeto 
	//permitiendonos asignar un valor (Setters)
	//O recuperarlo (Getters)
	
	
	
	

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



	//M�todo toString();
	//Nos sirve parta vizualizare la informacion de los atributos 
	//de nuestros objetos (actua como una "radiografia")
	
	@Override   //Significa que se va a sobreescribir 
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	 
	
	
	

}
