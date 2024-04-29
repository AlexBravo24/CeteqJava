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
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	//metodos propios - son acciones o funciones que nuestro 
	//objeto va a realizar
	
	// metodos que no devuelven un tipo de dato (sin retorno)
	
	//crear un metodo que se llame dormir
	//y que mande una impresion en consola
	
	public void dormir() {
		//aqui va la logica de como se realiza esta accion
		System.out.println("Estoy durmiendo...");
		
	}
	
	// metodos propios con retorno - devuelven un valor 
	// del tipo de dato que "dicen " devolver
	
	public String saludar() {
		String saludo = "Buenos dias";
		
		return saludo;
	}
	
	// crear un metodo polimorfico, saludar,
	// puede ser con retorno o no, pero el cambio radica
	//en uqe el metodo conserva el mismo nombre
	// pero se ejecuta diferente gracias a los argumentos
	// que el metodo solicita
	
	public void saludar(String saludo) {
		System.out.println(saludo);
	}
	//sobre carga de argumentos - son los argumentos 
	//que el metodo solicita para ejecutar sus acciones
	//lo que nos permite tener sobrecarga de metodos
	//(metodos con el mismo nombre, pero que ejecutan
	//diferentes acciones)
	
	public void saludar (String saludo, String horario) {
		System.out.println(saludo + horario);
	}
	
	public void sumar (int a, int b) {
		System.out.println("la suma es: " + (a+b));
	}
	
	// ejemplo de declaracion de un metodo abstracto
	//es aquel metodo que nos dice que se va a hacer pero 
	//no como se va a hacer
	
	// una clase abstracta es ugual a una clase convencional 
	//	pero debe contener por lo menos un metodo abstracto
	//	puede tener metodos propios tambien
	
	public abstract void comer (String comida);

}
