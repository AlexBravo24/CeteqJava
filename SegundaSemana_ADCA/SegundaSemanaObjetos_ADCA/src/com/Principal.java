package com;

public class Principal {

	public static void main(String[] args) {
		// crear nuestro primer objeto de la cclase persona
		// con su constructor vacio
		//Clase instancia (variable u objeto) = new Clase();
		
		Persona persona1 = new Persona();
		
		//ejemplo de crear a un segundo objeto Persona
		//pero con el constructor que me pide los atributos
		//desde un inicio
		Persona persona2 = new Persona("Juan", "Masculino");
		
		
		//asignando valores a los atributos de mi persona1
		//que esta vacio a este momento
		
		// persona1.nombre = "Alex"; -- forma incorrecta de asignar
		//valores a los atributos de nuestros objetos.
		// hay que protegerlos con los modificadores de acceso
		
		//establecer un valor a mi persona1 (vacio)
		//en el caso de su nombre
		persona1.setNombre("Alex");
		//ejemplo del uso del metodo get, para recuperar el nombre
		//de persona1
		System.out.println(persona1.getNombre());
		
		System.out.println(persona2.getNombre());
		
		String nombrePersonaFavorita = persona2.getNombre();
		
		//que ocurre si quiero mandar a imprimir mi objeto
		//en consoa directamente
		
		System.out.println(persona2);
		
		//van a realizar 3 clases para crear 3 difetentes objetos
		//cada objeto que quieran modelar, debe contar 
		//con por lo menos 3 atributos
		//crean metodos constructores (vacios y con todos los parametros)
		//getters y setters 
		//toString()
		//una vez creada la plantilla o clase, van ainstaciar sus objetos
		//en esta misma clase principal
		//e instancian uno vacio, uno con todos los atributos
		//y los mandan a imprimir en consola
		
		//ejemplo:
		//Celular
		
		Celular iPhone = new Celular();
		Celular samsung = new Celular("Samsung", "S23","Black", 22000.99);
		
		iPhone.setModelo("15");
		System.out.println(iPhone);
		System.out.println(samsung);
		
		//voy a mandar a imprimir a la persona1
		System.out.println(persona1);
		
		//con modificadores static, creamos atributos o metodos 
		//de clase. Aplican para todos los objetos de esa clase
		//y con static final, creamos valores inmutables y no pueden 
		//ser modificados.
		
		//con static aun podemos modificar el valor para todos los objetos
		//de la clase, si fuera necesario, ejemplo, actualizar un prrecio
	}

}
