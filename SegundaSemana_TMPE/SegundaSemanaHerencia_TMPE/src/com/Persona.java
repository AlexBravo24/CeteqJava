package com;

public abstract class Persona {

	private String nombre;
	private String genero;
	private int edad;
	
	public Persona () {}

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
	
	
	//24.04.24 Métodos propios -Son acciones o funciones que nuestro 
	//Objeto va a realizar
	
	//Métodos que no devuelven un tipo de dato (sin retorno)
	
	//Ejemplo, crear un método que se llame dormir
	//y que mande una impresión en consola
	
	public void dormir () {
		//Aqui va la lógica de CÓMO se realiza esta acción
		System.out.println("Estoy durmiendo...");
		
	}
	
	//Métodos propios con retorno - devuelven un valor
		//del tipo de dato que "dicen" devolver
	
	public String saludar () {
    String saludo = "Buenos días";
		return saludo;	
	}
		//Crear un método polimorfico, saludar
	//puede ser con retorno o no, pero el cambio radica
	//en el que el metodo conserva el mismo nombre
	//pero se ejecuta diferente gracias a los argumentos
	//que el método solicita
	
	public void saludar(String saludo) {
		System.out.println(saludo);
	}
	
	//Sobrecarga de argumentos - Son los argumentos
	//que el método solicita para ejecutar sus acciones
	//lo que nos permite tener sobrecarga de metodos 
	//(metodos con el mismo nombre, pero se ejecutan
	//diferentes acciones)
	public void saludar (String saludo, String horario) {
		
	System.out.println(saludo + horario);	
		}
	
	public void suma (int a, int b) {
		System.out.println("La suma es: " + (a+b));
	}
	
	//Ejemplo de declaración de un método abstracto
	//Es aquel método que nos dice que se va a hacer, pero
	//no Cómo se va a hacer
	
	//Una clase abstracta es igual a una clase convencional
	//pero debe contener por lo menos un método abstracto
	//Puede tener métodos propios también
	
	public abstract void comer (String comida);
	
}
