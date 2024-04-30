package com;

public class Persona {

	//ABSTRACCION - DEFINIR LOS ATRIBUTOS Y METODOS QUE NOS AYUDARÁN A CREAR A NUESTROS OBJETOS
	
	//Encapsulamiento - Proteger la info de accesos o modificaciones no autorizadas (default, public, protected, private)
	
	
	private String nombre;
	private String genero;
	private static final int edad =30; //el comando "static" hace que todos los objetos tengan 
								 //el mismo valor, en este caso, todas las
								 //personas tendrán 30 años (se tiene que modificar el setter al usarlo)
							     //Con el comando "static final" ahora será inmodificable para todos los objetos, (de nuevo muestra error 
								 //en el setter, esto por que ya no se necesita llamarlo, ya está permanente 
	
	
	//MÉTODOS CONSTRUCTORES
	
	
	
	//Metodo constructor vacio - nos permite crear o instanciar al 
	//objeto sin ningun valor en sus atributos inicialmente
	//Este metodo constructor sirve como comodín ya qu enos permite asignarle atributos
	  //mas tarde
	public Persona() {
		
	}

	
	
	
	//Metodo constructor con todos los parametros - nos permite crear un objeto con todos
	//los atributos iniciales
	//Click derecho + source + Generate constructor Using Fields
//	public Persona(String nombre, String genero, int edad) {
//		super();
//		this.nombre = nombre;
//		this.genero = genero;
//		this.edad = edad;  
//	}   
	 //Estos atributos marcaran error si se utiliza el comando "static final" asi que se crean otros)
		
	public Persona(String nombre, String genero) {
		super();
		this.nombre = nombre;
		this.genero = genero;
	}
	
	
	
	//Se pueden generar constructores con NO todos los atributos)
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	
	



	//Metodos Getters y Setters - proporcionan acceso a los atributos del objeto permitiendo asignar 
	//un valor en el caso de los setters o recuperarlo en el caso de los getters 
	//(Click derecho + source + generate getters and setters + seleccionar los que se utilizaran)
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

	
	//public static void setEdad(int edad) {
	//	Persona.edad = edad;    //Este setter es diferente debido al comando "static"
								//en el atributo "edad"
	//}                         // este setter tambien maracara erro si utilizamos el comando "static final" en edad




	//Metodo ToString (click derecho + source + GeneratetoString()
	//Sirve para visualizar la info de los atributos de los objetos (actua como una radiografia)
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	
	
	
	
	
}
