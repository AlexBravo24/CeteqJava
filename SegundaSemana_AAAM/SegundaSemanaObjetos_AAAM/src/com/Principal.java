package com;

public class Principal {

	public static void main(String[] args) {
		
		//Crear primer objeto de la clase Persona con su constructor vacío
		//Clase instancia (variable u objeto) = new Clase();
		Persona persona1 = new Persona();
		
		
		
		//Ejemplo de crear a un segundo objeto Persona pero con el constructor que me pide
		//los atributos desde un inicio
		Persona persona2 = new Persona("Juan", "Masculino");  //en la clase principal SI se puede modificar 
																  //el atributo "edad" aun cuando tenga el comando "static"
		
//		Persona.setEdad(50); //con este setter en la clase principal, puedo cambiar el atributo edad para todos los objetos AUN cuando 
							 //el atributo de los objetos esta por default en 30 por el comando "static"
		
		
		//Asignando valores a los atributos de la persona1 que está vacio hasta el momento
//		persona1.nombre="Alex";   //forma incorrecta de asignar valores a los atributos de nuestros objetos
		                          // hay que protejerlos con los modificadores de acceso
		
		
		
		//Establecer un valor a la persona1 (vacia)
		//en el caso del nombre:
		persona1.setNombre("Alex");
		
		
		
		
		//Ejemplo del uso del metodo get para recuperar el nombre de persona1 y persona2
		System.out.println(persona1.getNombre());
		System.out.println(persona2.getNombre());
		
		String nombrePersonaFavorita = persona2.getNombre();
		
		
		
		
		//Si quiero mandar a imprimir el objeto directamente sin metodo ToString, esto ocurre: com.Persona@15db9742
		System.out.println(persona2);
		
		
		
		//Voy a mandar a imprimir la persona Alex, ahora por el comando "static" ya muestra la edad por defecto de 30
		System.out.println(persona1);
		
		//Con modificadores static, creamos atributos o metodos de clase, aplican para todos los objetos creados desde esa clase (aun se puede modificar)
		//Con static final creamos valores inmutables y no pueden ser modificados
		
		
		
		
		
		//Realizar 3 clases para crear diferentes objetos, cada objeto a modelar debe contar con por lo menos tres atributos
		//crear metodos constructores (vacio y con todos los parametros, getters y setters y toString
		//una vez creada la plantilla o clase,, instanciar los objetos en esta misma clase principal, uno vacio, uno con 
		//todos los atributos y mandar a imprimir en consola.
		
		
//		//Objeto Motocicletas
//		Motocicletas moto1 = new Motocicletas();
//		
//		Motocicletas moto2 = new Motocicletas("Italika FT200", "200 CC", 25000);
//		
//		moto1.setModelo("CMD Comando 400CC");
//		
//		System.out.println(moto1);
//		System.out.println(moto2);
//		
//		
//		
//		//Objeto Carros		
//		Carros carro1 = new Carros();
//		
//		Carros carro2 = new Carros("Aveo 2024", "Vino", 284400);
//		
//		carro1.setModelo("Mercedes A-Class A220");
//		
//		System.out.println(carro1);
//		System.out.println(carro2);
//		
//		
//		
//		//Objeto Cigarros
//		Cigarros cajetilla1 = new Cigarros();
//		
//		Cigarros cajetilla2 = new Cigarros("PallMall Classic", 25, 57);
//		
//		cajetilla1.setMarca("Marlboro");
//		
//		System.out.println(cajetilla1);
//		System.out.println(cajetilla2);
		
		
		
	}

}
