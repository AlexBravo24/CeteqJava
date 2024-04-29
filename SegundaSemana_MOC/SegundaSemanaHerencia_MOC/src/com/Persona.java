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
		//metodo con retorno
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	//Metodos propios- acciones o funciones que nuestro objeto va a realizar
	//Metodos que no regresan un valor                                               
	
	//Ejemplo crear un metodo que se llame dormir
	//y que mande una impresion en consola
	
	public void dormir() {
		//Aqui va la logica, cómo se realiza la accion
		System.out.println("Estoy durmiendo...");
	}
	
	//Metodos propios con retorno- devuelven un valor 
	//del tipo de dato que "dicen" devolver
	
	public String saludar () {
		String saludo ="Buenos días";
		return saludo;
	}
	
	//Creacion de un metodo polimorfico saludar
	//Puede ser con retorno o no, pero el cambio radica
	//en que el metodo conserva el mismo nombre
	//pero se ejecuta diferente gracias a los argumentos
	//que el metodo solicita
	
	public void saludar (String saludo) {
		System.out.println(saludo);
	}
	//Sobrecarga de argumentos-Son los argumentos
	//que el metodo solicita para ejecutar sus acciones
	//lo qye nos permite tener sobrecarfa de metodos 
	//(metodos con el mismo nombre, pero que se ejecutan
	//diferentes acciones)
	public void saludar(String saludo, String horario) {
		System.out.println(saludo+horario);
	}
	
	public void sumar(int a, int b) {
		System.out.println("La suma es: "+ (a+b));
	}
	
	//Ejemplo de declaración de un método abstracto
	//Es aquel que nos dice qué se va a hacer pero no cómo se va a hacer
	
	//Una clase abstracta es igual a una clase convencional
	//Pero debe contener por o menos un metodo abstracto
	//Puede tener metodos propops también
	
	public abstract void comer (String comida);
	

}
