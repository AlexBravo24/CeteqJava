package com;

public class Principal {

	public static void main(String[] args) {
		// crear el primer objeto de la clase Persona con su constructor vacío
		//CLASE var u objeto = new Clase();
		
		Persona persona1 = new Persona();
		
		//EJEMPLO PARA UN SEGUNDO OBJETO PERSONA CON EL CONSTRUCTOR CON ATRIBUTOS
		
		Persona persona2 = new Persona("Juan", "Masculino" , 30);
		
		//Asignando valores a los atributos de la persona1 que está vacía
		
		//persona1.nombre="Joaquin"; forma incorrecta de asignar valores
		//establecer un valor correctamente:
		persona1.setNombre("Joaquín");
		
		//ejemplo del uso del método get para recuperar el nombre de persona1
		System.out.println(persona1.getNombre());
		System.out.println(persona2.getNombre());
		
//		String nombrePersonaFav = persona2.getNombre();
		
		System.out.println(persona2);
		
		//Moto
		
		Moto harley = new Moto();
		Moto BMW = new Moto("BMW","Harley", "Negro", 2024);
		
		harley.setEstilo("Iron 883");
		
		System.out.println(harley);
		System.out.println(BMW);
		
		//Animal
		
		Animal perro = new Animal();
		Animal medusa = new Animal("Gigante", "No Aplica", "Gris", 15, "Sin género");
		
		perro.setRaza("Boxer");
		
		System.out.println(perro);
		System.out.println(medusa);
		
		//Zapatos
		
		Zapatos nike = new Zapatos();
		Zapatos formal = new Zapatos("Piso", "rojo", 5);
		
		nike.setTalla(3);
		
		System.out.println(nike);
		System.out.println(formal);
		
	}

}
