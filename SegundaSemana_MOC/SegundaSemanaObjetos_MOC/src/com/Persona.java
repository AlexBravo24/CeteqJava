package com;

public class Persona {
	//Abstraccion, definir los atributos y metodos que nos ayudan
	// a crear nuestros objetos
	
	//Atributos
	//Ej. nombre, edad, genero, color nacionalidad,etc,etc
	
	//Persona con 3 atributos, definicion de ellos:
	//Encapsulamiento- Proteger la informacion de accesos o moedificaciones no autorizadas
	//default, public, protected, private
	
	private String nombre;
	private String genero;
	private static final int edad=30;
	// si querenos que todos los valores de la clase tengan el mismo valor en un argumento
	//añadimos static
	//final nos da un valor inmutable
	
	
	//Metodos constructores
	//Metodo constructor vacio, que permite crear o instanciar al 
	//objeto sin nungun valor en sus atributos aun
	
	public Persona() {
		
	}
	//Metodo constructor cons todos los atributos o parametros 
	//nos permite instanciasr a nuestro objeto pero ya con sus valores
	//asignados en sus atributos
	

	
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	//Metodos getters y setters
	//Proporcionan acceso a los atributos de nuestro objeto
	//permitiendonos asignar un valor en el cado setters o recuperar los con getters

	public Persona(String nombre, String genero) {
		super();
		this.nombre = nombre;
		this.genero = genero;
	}




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


	//Metodo to string()
	//Sirve para visualizar la informacion de los atributos de nuestros objetos
	//actua como radiogrfafia
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	//Metodo constructor que ya contiene datos
	
	
	
	
}
