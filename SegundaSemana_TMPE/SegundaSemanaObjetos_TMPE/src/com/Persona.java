package com;

public class Persona {

	//ABSTRACCI�N - DEFINIR LOS ATRIBUTOS Y M�TODOS
	//QUE NOS AYUDAR�N A CREAR A NUESTROS OBJETOS
	
	//ATRIBUTOS
	//EJ. nombre, edad, g�nero, color, nacionalidad
	//nivelEducativo, etc, etc, etc......
	
	//ENCAPSULAMIENTO - Proteger la informaci�n de accesos o 
	//modificaciones no autorizadas 
	//default, public, protected, private 
	
	private String nombre;
	private String g�nero;
	private static final int edad = 30; //4to (agregar final crear valores constantes o valores inmutables
	
	//1.M�todos Constructores
	
	//M�todo constructor vac�o - este nos va a permitir
    //crear o instanciar a nuestro objeto sin ning�n
	//valor en sus atributos inicialmente
	//Nos funciona como un "dummie" o comod�n 
	
	public Persona () {
		
	}

    //M�todo constructor con todos los atributos o par�metros
	//Nos permite instanciar a nuestro objeto pero ya con 
	//sus valores asignados en sus atributos Nota: Para ponerlo es dar clic derecho, secci�n source
	//generate constructor using fields
	
	//5to paso dar clic derecho (SOURCE) - Generate Constructor Using Fields
	
	public Persona(String nombre, String g�nero) {
		super();
		this.nombre = nombre;
		this.g�nero = g�nero;
	}


	//Nota: puedes tener tambi�n un constructor nombre, dando clic derecho (Source)
	//Generate Constructor Using Fields (en la tabla s�lo marcar nombre)
	
    public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	
	//Para realizar lo siguiente dar clic derecho, source 
	//y dar en generate getter and setters
	//M�todos Getters y Setters
	//Proporcionan acceso a los atributos de nuestro objeto
	//permiti�ndonos asignar un valor (setters)
	//o recuperarlo (Getters)
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getG�nero() {
		return g�nero;
	}

	public void setG�nero(String g�nero) {
		this.g�nero = g�nero;
	}

	public int getEdad() {
		return edad;
	}
	
	//6to paso dar clic derecho de la edad clic (SOURCE) Generate Getters and Setter
//Pero no ocurre nada
	
	//7to.
	
	
	
	
	
	
	
	//M�todo toString ()
	//Nos sirve para visualizar la informaci�n de los atributos 
	//de nuestros objetos (actua como una "radiografia")
    //Dar clic derecho (Source) y Generate to String()
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", g�nero=" + g�nero + ", edad=" + edad + "]";
	}

	//2do. Ahora como la variable es est�tica, dar clic derecho (Source)
		//Generate Getters and Setters


	
	//ESTE PASO ES HACERLO EN PRINCIPAL
//	Celular iPhone = new Celular ();
////
//    Celular samsung = new Celular("Samsung", "S23", "Black", 22000.99);
//    
//    iPhone.setModelo("15");
//    
//    System.out.println(iPhone);
//    
//    System.out.println(samsung);
	
}

