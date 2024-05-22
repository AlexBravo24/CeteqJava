package com;

public abstract class Persona {
	private String nombre;
	private String genero;
	private int edad;
	
public Persona() {
		
	}
	
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

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//método ToString permite visualizar los datos a modo de string

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	//Métodos propios, los que el objeto va a realizar
	//hay con y sin retorno -void-

	//Ejemplo, método llamado Dormir
	
	public void dormir () {
		System.out.println("Shh.... Estoy durmiendo");
	}
	public String saludar () {
		String saludo ="Buenos días";
		return saludo;
	}
	
	public void saludar (String saludo) {
		System.out.println(saludo);
	}
	
	public void saludar (String saludo, String horario) {
		System.out.println(saludo + horario);
	}
	
	public void sumar (int a, int b) {
		System.out.println("La suma es: " + (a+b));
	}
	
	//Abstracto- qué se hará pero no cómo
	public abstract void comer (String comida);

}
