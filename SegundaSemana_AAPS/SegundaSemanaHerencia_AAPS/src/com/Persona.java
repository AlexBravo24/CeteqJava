package com;

public abstract class Persona {

	private String nombre;
	private String genero;
	private int edad;
	
	public Persona () {
	}

	public Persona(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
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

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	// M�todos propios
	// Son acciones o funciones que nuestro m�todo va a realizar

	// M�todos que no devuelven un dato (sin retorno)
	// Ejemplo de esto; crear un m�todo llamado dormir y que mande 
	// una impreson en consola
	
	public void dormir () {
		// Aqui va la logica de como se realiza esta acci�n
		System.out.println("Estoy durmiendo...");
	}
	
	// Metodos propios con retorno
	// Devuelven un valor del tipo de dato que dicen devolver
	
	public String saludar () {
		String saludo = "Buenos d�as";
		return saludo;
	}
	
	// Crear un m�todo polimorfico "saludar" que puede ser con retorno o no, 
	// pero el cambio radica en que el m�todo conserva el mismo nombre
	// pero se ejecuta diferente gracias a los argumentos que el m�todo
	// solicita
	
	public void saludar (String saludo) {
		System.out.println(saludo);
	}
	
	// Sobrecarga de argumentos
	// Son los argumentos que el m�todo solicita para ejectuar sus acciones,
	// lo que nos permite tener sobrecarga de m�todos (metodos con el mismp nombre
	// pero se ejecutan diferentes acciones)
	public void saludar (String saludo, String horario) {
		System.out.println(saludo + horario);
	}
	
	public void sumar (int a, int b) {
		System.out.println("La suma es: " + (a+b));
	}
	
	// Ejemplo de delcaraci�n m�todo abrastracto
	// El m�todo asbtracto es aquel que nos dice que se va a hacer pero que no nos dice 
	// como se va a hacer
	
	public abstract void comer (String comida);
	
}
