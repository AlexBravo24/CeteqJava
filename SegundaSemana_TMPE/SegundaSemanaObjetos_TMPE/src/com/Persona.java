package com;

public class Persona {

	//ABSTRACCIÓN - DEFINIR LOS ATRIBUTOS Y MÉTODOS
	//QUE NOS AYUDARÁN A CREAR A NUESTROS OBJETOS
	
	//ATRIBUTOS
	//EJ. nombre, edad, género, color, nacionalidad
	//nivelEducativo, etc, etc, etc......
	
	//ENCAPSULAMIENTO - Proteger la información de accesos o 
	//modificaciones no autorizadas 
	//default, public, protected, private 
	
	private String nombre;
	private String género;
	private static final int edad = 30; //4to (agregar final crear valores constantes o valores inmutables
	
	//1.Métodos Constructores
	
	//Método constructor vacío - este nos va a permitir
    //crear o instanciar a nuestro objeto sin ningún
	//valor en sus atributos inicialmente
	//Nos funciona como un "dummie" o comodín 
	
	public Persona () {
		
	}

    //Método constructor con todos los atributos o parámetros
	//Nos permite instanciar a nuestro objeto pero ya con 
	//sus valores asignados en sus atributos Nota: Para ponerlo es dar clic derecho, sección source
	//generate constructor using fields
	
	//5to paso dar clic derecho (SOURCE) - Generate Constructor Using Fields
	
	public Persona(String nombre, String género) {
		super();
		this.nombre = nombre;
		this.género = género;
	}


	//Nota: puedes tener también un constructor nombre, dando clic derecho (Source)
	//Generate Constructor Using Fields (en la tabla sólo marcar nombre)
	
    public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	
	//Para realizar lo siguiente dar clic derecho, source 
	//y dar en generate getter and setters
	//Métodos Getters y Setters
	//Proporcionan acceso a los atributos de nuestro objeto
	//permitiéndonos asignar un valor (setters)
	//o recuperarlo (Getters)
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGénero() {
		return género;
	}

	public void setGénero(String género) {
		this.género = género;
	}

	public int getEdad() {
		return edad;
	}
	
	//6to paso dar clic derecho de la edad clic (SOURCE) Generate Getters and Setter
//Pero no ocurre nada
	
	//7to.
	
	
	
	
	
	
	
	//Método toString ()
	//Nos sirve para visualizar la información de los atributos 
	//de nuestros objetos (actua como una "radiografia")
    //Dar clic derecho (Source) y Generate to String()
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", género=" + género + ", edad=" + edad + "]";
	}

	//2do. Ahora como la variable es estática, dar clic derecho (Source)
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

