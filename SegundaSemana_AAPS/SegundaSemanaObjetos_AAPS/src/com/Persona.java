package com;

public class Persona {

	// Primer pilar de la programaci�n orientada a objetos: Abstracci�n
	// La abastracci�n sirve para definir atributos y metodos que nos ayudaran 
	// a crear nuestros objetos
	
	//Atributos
	// Ejemplos: nombre, edad, genero, color, nacionalidad, nivel educativo, etc.
	
	// Segundo pilar de la programaci�n orientada a objetos: Encapsulamiento
	// El encapsulamiento es el que proteger la infromaci�n de accesos o 
	// modificaciones no autorizadas 
	// Para ello exsiten los modificacdores de acceso: default, public, protected, private. 
	
	
	private String nombre;
	private String genero;
	private static final int edad = 30; // o sin asignar solo: "privae int eddad;"
	
	// Metodos constructores
	
	// M�todo constructor vac�o: este nos permite crear o instanciar
	// a nuestro objeto sin ningun valor en sus atributos aun
	// Puede fungir como un comod�ns
	
	public Persona() {
		
	}

	//M�todo constructor con todos los parametros: permite instanciar 
	//a nuestro objeto  pero ya con sus valores asignados en sus atributos
	
	
	public Persona(String nombre, String genero) {
		super();
		this.nombre = nombre;
		this.genero = genero;
	}
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	// Metodos Getters y Setters
	//Proporcionan acceso a los atributos de nuestro objeto
	// permitiendonos asginar un valor en el caso de los Setters
	// o recuperarlo en el caso de los Getters
	
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

	//M�todo toString()
		// Sirve para visualiZar la infromaci�n de los atributos de 
		// nuestros objetos (actua como una radiografia)
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	
}
