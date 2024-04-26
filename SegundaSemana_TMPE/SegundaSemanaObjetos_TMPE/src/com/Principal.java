package com;

public class Principal {

	public static void main(String[] args) {
		
		//Crear nuestro primer objeto de la clase persona
		//con su constructor vacío
		//Clase instancia (variable u objeto) = new Clase ();
		
		Persona persona1 = new Persona ();
		
		//Ejemplo de crear a un segundo objeto persona
		//Pero con el constructor que me pide los atributos
		//desde un inicio
		
		//4to cambiar la edad a Juan
		Persona persona2 = new Persona ("Juan", "Masculino");
		
		//Variable para que se quede la edad para todos.
		//Persona.setEdad(50); 
		
		//Asignado valores a los atributos de mi persona1
		//que esta vacio a este momento
		
		//persona1.nombre="Alex"; -- Esto fue la forma incorrecta de asignar
		//valores a los atributos de nuestros objetos
		//hay que protegerlos con los modificadores de acceso
		
		//Establecer un valor a mi persona1 (vacio)
		//en el caso de su nombre
		persona1.setNombre("Alex");
		
		//Ejemplo del uso del método Get, para recuperar el nombre 
		//de persona1
		System.out.println(persona1.getNombre());
		
		System.out.println(persona2.getNombre());
		
		String nombrePersonaFavorita = persona2.getNombre();
		
		//Que ocurre si quiero mandar a imprimir mi objeto
		//en consola directamente
		System.out.println(persona2);
		
		//Realizar 3 clases para crear 3 diferentes objetos
		//Cada objeto que quieran modelar, debe contar 
		//con por los menos 3 atributos
		//Crean métodos constructores (vacio y con todos los parámetros)
		//Necesitan crear Getters y Setters
		//toString()
		//Una vez creada la plantilla o clase, van a instanciar sus objetos 
		//en esta misma clase principal
		//E instancian uno vacio, uno con todos los atributos
		//y los mandan a imprimir en consola
		
		//Ejemplo:
		//Celular 
		//Paso 6.
		
		Celular iPhone = new Celular ();

        Celular samsung = new Celular("Samsung", "S23", "Black", 22000.99);
        
        iPhone.setModelo("15");
        
        System.out.println(iPhone);
        
        System.out.println(samsung);
        
      //1. Objeto Coche
 	   
    	Coche Nissan = new Coche();
    	
    	Coche Kia = new Coche("Kia", "Picanto", "Rojo", 200000.50);
    	
    	Nissan.setModelo("2020");
 
	System.out.println(Nissan);
	
	System.out.println(Kia);
			
	//2. Animal
	//nombre, raza, edad 	
	Animal paloma = new Animal ();
	
	Animal gato = new Animal("Tom", "Siames", 6);
	
	paloma.setEdad(4);

	System.out.println(paloma);
	
	System.out.println(gato);
	
    
	//3.Lavadora

	Lavadora Lg = new Lavadora ();
	
	Lavadora Mabe = new Lavadora("Mabe", "LMDX6124HBAB0", "White", 20000.0);
	
	Lg.setModelo("WT25VT6HK");
	
	System.out.println(Lg);
	System.out.println(Mabe);
	
		
	
	//3ro. Voy a mandar a escribir a la persona1 que es Alex
	System.out.println(persona1);
	
	//Con modificadores Static, creamos atributos o métodos
	//de clase. Aplican para todo los objetos creados de esa clase
	//Con static aún podemos modificar el valor para todos los objetos
	//de la clase, si fuera necesario, por ejemplo, actualizar un precio.
	
	//Con static final, creamos valores inmutables y no pueden 
	//ser modificados.
	
	
	}
}

