package com;

public class Principal {

	public static void main(String[] args) {
		// TVamos a probar crear una nueva persona 
		//CUando una clase se vuelve abstracta, no podemos instanciartla
		//Es decir no podemos crear objetos de esa clase 
		/// Persona juan=new Persona("Juan","Masculino",26);
		
		//Vamos a probar a crear un nuevo empledado
		
		Empleado jorge = new Empleado("Jorge", "Masculino" , 33, "ROGO980129", "Desarrollador", "Matutino", 30000);
		
		//Polimorfismo de asiganción 
		Persona juan = new Empleado();
		
		
		System.out.println(juan);
		System.out.println(jorge);
		
		  ///String informacion = juan.toString();
		  ///System.out.println(informacion);
		  
		  //probar el metodo dormir a traves de nuestra persona juan 
		  ///juan.dormir();
		  
		  //Probar el mismo metodo pero a travez de nuestro empleado jorge
		  jorge.dormir();
		  
		  //Probando el metodo con retorno saludar a traves de juan
		  //String hello = juan.saludar();
		  ///System.out.println(juan.saludar());
		
		  
		  //Vamos a ver como funciona el metodo saludar polimorfico
		  jorge.saludar("Hola Generación Ceteq");
		  
		  //Probart el metodo saludar que pide 2 argumentos
		  jorge.saludar("Buenas tardes,", " son las 12:00pm");
		  
		  jorge.sumar(21, 7);
		  
		 //Puedo llamar a jorge y utilizar el metodo comer 
		  jorge.comer("Ensalada");
	
		  jorge.checarEntrada();
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		//Crear otras 2 clases, una que sea la clase padre y otra que sea la clase hija
		//Ej. Persona, que herede a estudiante
		//Matricula, Turno, Horario, Grado
		
		System.out.println();
		
	     Mascota salchicha = new Mascota("Salchicha","Chico",5);
	     
	     Animal gato = new Animal ("Siamés","Chico",3,"Gato","Blanco y negro",4);
	     
	     
	     System.out.println(salchicha);
	     System.out.println(gato);
	     
	   
	     

	}

}
