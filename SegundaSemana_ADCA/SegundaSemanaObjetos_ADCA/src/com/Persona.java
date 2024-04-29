package com;

public class Persona {
	//ABSTRACCION - DEFINIR LOS ATRIBUTOS Y METODOS
	//QUE NOS AYUDARAN A CREAR A NUESTROS OBJETOS
	
	//ATRIBUTOS
	// EJ. nombre, edad, genero,, color, nacionalidad
	//nivel educativo, etc, etc, etc...
	
	//ENCAPSULAMIENTO - Proteger la informacion de accesos o
	//modificaciones no autorizadas
	//default, public, protected, private
	
	private String nombre;
	private String genero;
	private static final int edad = 30; //valores inmutables 
	
	
	//Metodos Constructores
	
	//Metodo constructor vacio - este nos va a permitir
	//crear o instanciar a nuestro objeto sin ningun 
	//valor en sus atributos inicialmente
	//nos funciona como un "dummie" o comodin
	public Persona() {
		
	}
	
	//metodo constructor con todos los atributos o parametros
	//nos perite instancia nuestro objeto pero ya con
	//sus valores asignados en sus atributos
	
	
	public Persona(String nombre, String genero) {
		super();
		this.nombre = nombre;
		this.genero = genero;
	}

		
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	
	

	//metodos getter y setters
	//proporcionan acceso a los atributos de nuestros objeto
	//permitiendonos asignar un valor (Setters)
	//o recuperarlo (Getters)

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

	
	
	
	
	//metodo toString()
		//nos sirve para visualizar la informacion de los atributos
		//de nuestros objetos (actua como una "radiografia")



	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	
	
	

}
