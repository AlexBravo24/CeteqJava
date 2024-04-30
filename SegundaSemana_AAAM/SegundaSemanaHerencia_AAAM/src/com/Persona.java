package com;

public abstract class Persona {

	private String nombre;
	private String genero;
	private int edad;
	
	public Persona() {}

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
	
	
	//Metodos propios,, acciones o funciones que el objeto va a realizar
	
	
	//Metodos que no devuelven un tipo de dato (sin retorno) 
	//Ejemplo, crear un metodo que se llame dormir y que mande una impresion en consola
	public void  dormir() {  //La palabra reservada void no tiene retorno
		//aqui va la logica de COMO se realiza esta accion
		System.out.println("Ta mimido...");
	}
	
	
	//Metodo propio con retorno, duelven un valor del tipo de dato que "dicen" devolver
	public String saludar() {
		String saludo = "Buenos días";
		return saludo; //se puede utilizar "return null" para que no regrese nada o marque error en lo que se decide que va a retornar
	}
	
	//Crear metodo polimorfico saludar, puede ser con retorno o no pero el cambio radica en que el metodo conserva el mismo nombre 
	//pero se ejecuta diferente gracias a los argumentos que el metodo solicita
	
	public void saludar(String saludo) {
		System.out.println(saludo);
	}
	
	
	//Sobrecarga de argumenos, son los argumentos que el metodo solicita para ejecutar sus acciones, en este caso uno mas, lo que nos permite tener sobrecarga de metodos
	//(metodos con el mismo nombre pero que ejecutan diferentes acciones)
	public void saludar(String saludo, String horario) {
		System.out.println(saludo + horario);
	}
	
	public void sumar (int a, int b) {
		System.out.println("la suma es: " + (a+b));
	}
	
	
	
	//elemplo de declaracion de un metodo abstracto
	//Es aquel metodo que nos que nos dice QUE se va a hacer pero no COMO se va a hacer
	//una clase abstracta es igual a una clase cnvencional pero debe tener por lo menos un metodo abstracto, puede tener metodos propios tambien
	public abstract void comer (String comida);
	
	
}
