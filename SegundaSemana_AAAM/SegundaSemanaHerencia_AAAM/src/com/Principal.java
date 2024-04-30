package com;

public class Principal {

	public static void main(String[] args) {
		
		//Crear una nueva persona
		//Cuando una clase se vuelve abstracta no podemos instanciarla, no podemos crear objetos de esa clase
//		Persona juan = new Persona("Juan", "Masculino", 27);
		
		//Crear un nuevo emleado
		Empleado jorge = new Empleado("Jorge", "Masculino", 33, "JRFG9776", "Desarrollador", "Matutino", 30000);
		
		//polimorfismo de asignacion, crear una "persona" (que es abstracta y teoricamente no se podria, a travez de hacerlo un "empleado" que es una clase hija
		Persona juan = new Empleado();
		
//		System.out.println(juan);
		System.out.println(jorge);
		
		
		
		
		//Crear otras dos clases, una clase padre y otra clase hija
		
//		Consola xbox = new Consola("Microsoft", "Xbox Series S", 6805);
//		ConsolaEspecificaciones playstation5 = new ConsolaEspecificaciones("Sony", "Play Station 5", 8086.64, "AMD 8x Zen 2 Cores a 3.5GHz", "36 unidades de calculo (10.28 TFLOPs) RDNA2 customizada", "16GB GDDR6/256-bit");
//
//		System.out.println(xbox);
//		System.out.println(playstation5);
		
		
		
		
		//Probar llamar el motodo dormir a tarvez de nuestra persona "Juan"
//		juan.dormir();
		
		//Probar el mismo metodo pero a travez del empeado jorge
		jorge.dormir();
		
		
		//Probando el metodo con retorno a traves de Juan
		//String hello=juan.saludar();  //Aqui podriamos guardar el "retorno" de juan.saludar en una variable en este caso "hello"
//		System.out.println(juan.saludar());
		
		
		//ver como funciona el metodo "saludar" polimorfico
		jorge.saludar("Buenas tardes");  //este metodo permite personalizar (ya que va a padir) el String
		
		
		//probar el metodo saludar polimorfico con dos argumentos
		jorge.saludar("Buenas tardes, ", "son las 12:00pm");
		
		
		//probando metodo polimorfico "sumar"
		jorge.sumar(10, 20);
		
		//Puedo llamar a jorge y utilizar el metodo abstracto "comer"
		jorge.comer("Ensalada");
		
		
		
		
		
	}

}
