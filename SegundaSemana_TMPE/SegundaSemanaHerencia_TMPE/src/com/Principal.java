package com;

public class Principal {

	public static void main(String[] args) {
	
		// Vamos a probar crear una nueva persona
		//Cuando una clase se vuelve abstracta, no podemos instanciarla
		// es decir, no podemos crear objetos de esa clase 
		//Persona juan = new Persona ("Juan", "Masculino", 27);
		
		//Vamos a crear un nuevo empleado
		Empleado jorge = new Empleado ("Jorge", "Masculino", 33,"JRGF9776", "Desarrollador", "Matutino", 30000);
	
		//Polimorfismo de asignaci�n
//		Persona juan = new Empleado();
		
		//System.out.println(juan);
		
		System.out.println(jorge);
		
//		String informacion = juan.toString ();
//		
//		System.out.println(informacion);
		
		
		//Crear otras dos clases, una que se la clase Padre
		//y otra que sea la clase hija 
		//Ej. Persona, que herede a Estudiante 
		//matricula, turno, horario, grado
		//Ej. Vehiculo (marca, tipo, paisOrigen)
		//Carro, Barco, 
		
		
		//Ejercicio herencia
		
	Transporte Coche = new Transporte("2024", "Negro", 120.0, "XYZ-84691E");
	
	Coche Ibiza = new Coche("2024", "Rojo", 190.0, "XYZ-4891A", 4, 195.0, 3);
	
		System.out.println(Coche);
		System.out.println(Ibiza);
		
		
		//3.POO M�todos propios
		
		//Probar llamar el m�todo dormir a trav�s de nuestra persona Juan
		
		//juan.dormir();
		
		//Probar el mismo m�todo pero a trav�s de
		//nuestro empleado jorge
        jorge.dormir();
		
        //Probando el m�todo con retorno saludar
        //a trav�s de juan
       // String hello = juan.saludar();
      
       // System.out.println(juan.saludar());
       //juan.saludar();
        
        //Ver como funciona el m�todo saludar polimorfico   
	    jorge.saludar("Buenas tardes");
	    
	    //Probar el m�todo saludar que pide dos
	    //argumentos
	    jorge.saludar("Buenas tardes", " Son las 12:00pm");
	    
	    jorge.suma(21, 7);
	    
	    //Puedo llamar a Jorge y utilizar el m�todo comer
	    jorge.comer (" Ensalada ");
	}


	
	
	
	
	
	
}
