package com;

public class Principal {

	public static void main(String[] args) {
		// Crear nuestro primer objeto de la clase persona con su 
		//constructor vacio
		//Clase instancia (variable u objeto) =new clase();
		Persona persona1=new Persona();
		
		//Crecar un segundo objeto persona con el contrstructor que me pide los atributis
		// desde el inicio
		Persona persona2 = new Persona("Juan", "Masculino");//una vez que se añade el argumento final
		//ya no se incluye el valor de edad en la definicion de la variable
		//Persona.setEdad(50); //todas las personas tendran ese argumento en edad
		//las variables de tipo estatico aun son modificables
		
		//Asignando valores a los atributos de mi persona 1 que esta vacio en este momento
		//persona1.nombre="Alex"; Forma incorrecta de aseginar valores a los atributos de nuestros objetos
		//hay que protegerlos con los modificacdores de acceso
		
		//Establecer un valor a mi persona en el caso de su nobre
		persona1.setNombre("Alex");
		
		//Ejemplo del uso del metodo get, parra recuperar el nombre de persona 1
		System.out.println(persona1.getNombre());
		
		System.out.println(persona2.getNombre());
		
		String nombrepersonafac=persona1.getNombre();
		
		//que ocurre si quiero mandar a imprimir el objeto directamente en consola
		System.out.println(persona1);
		
		//con modificadores static, creamos atributos o metodos de clases
		//aplican para todos los objetos creados de esa clase
		//con static aun podemos modificar el valor para todos los objetos de la clase
		//si fuera necesario, ejemplo actualizar un valor
		
		//con static final creamos valores inmutables que no pueden ser cambiados
		
		//Realizar 3 clases para crear tres diferentes objetos
		//cada objeto debe contar con 3 atributos
		//crean los metodos constructores (vacio y con todos los parametros)
		//getters y setters
		//tostring
		//una vez creada la plantilla o clase, van a instanciar sus objetos en esta clase principal
		//e instancian uno vacio, uno con todos los atributos
		//y los mandan a imprimir en consola
		
		//ejemplo:
		//celular
		// clase animal
		Animal perro=new Animal();
		Animal oso=new Animal("Pardo", 15, "omnívoros ");
		
 		perro.setAlimentacion("omnívoro ");
 		
		System.out.println(perro);
		System.out.println(oso);
		
		//clase trabajador
		Trabajador trabajador1=new Trabajador();
		Trabajador trabajador2=new Trabajador("Contabilidad",10000,1);
		
		trabajador1.setArea("Produccion");
		
		System.out.println(trabajador1);
		System.out.println(trabajador2);
		
		//clase computadora
		Computadora computadora1=new Computadora();
		Computadora computadora2=new Computadora("Lenovo","Negro",1500);
		
		computadora1.setMarca("Hp");
		
		System.out.println(computadora1);
		System.out.println(computadora2);
	}

}
