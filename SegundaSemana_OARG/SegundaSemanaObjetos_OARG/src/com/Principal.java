package com;

public class Principal {

	public static void main(String[] args) {
		// Crear nuestro primer objeto de la clase persona con su contructor vacío 
		
		
		Persona persona1 = new Persona();
		
		//Ejemplo de crear a un segundo objeto Persona
		//pero con el constructor que me pide los atributos desde un inicio
		
		Persona persona2 = new Persona("Juan", "Masculino");
		
		// Persona.setEdad(50);
		
		
		//Asignando valores a los atributos de mi persona 1 
		//que esta vacio a este momento 
		
		// persona1.nombre="Obed"; -- FORMA INCORRECTA DE ASINAR VALORES A LOS ATRIBUTOS DE NUESTROS OBJETOS 
		//HAY QUE PROTEGERLOS CON LOS MODIFICADORES DE ACCESO
		
		//Establecer un valor a mi persona1 (vacío)
		//en el caso de su nombre
		
		persona1.setNombre("Obed");
		
		//Ejemplo del uso del metodo get, para recuperar el nombre de persona1
		
		System.out.println(persona1.getNombre());
		
		System.out.println(persona2.getNombre());

        String nombrePersonaFavorita = persona2.getNombre();
        
        //Que ocurre si quiero mandar a imprimir mi objeto en consola directamente
        
        System.out.println(persona2);
        
        //VOy a mandar a imprimir  a la persona1
        System.out.println(persona1);
        
        //COn modificadores Static creamos atributos o métodos de clase
        //Aplica para todos los objetos creados en esa clase
        //Con static aun se puede modificar el valort para todos los objetos de la clase si fueran necesarios, ejemplo, un precio
        //con static final, creamos valores inmutables y no pueden ser modificados
        
 
        
        
        
 /*Van a realizar 3 clases para crear 3 diferentes objetos
  * cada objeto que quieran modelar, debe contar con por lo menos 3 atributos
  * Crean métodos constructores (cavío y con todos los parametros) 
  * Getters y Setters
  * toString()
  * Una vez creada la plantilla o clasew, van a instanciar sus objetos en esta calse principal
  * E instancian unavacía, uno con todos los atributos
  * y los mandan a imprimir en consola
  */
     System.out.println();
     
 //*******************AUTOS***************************************//       
       System.out.println("*********AUTOS*********");
       System.out.println();
       Autos mazda  = new Autos();
       Autos bmw = new Autos ("BMW", "Blanco",500000.00);
       
       mazda.setColor("Rojo");
       
       System.out.println(mazda);
       System.out.println(bmw);
       
//*****************CONSOLAS*************************************//       
     System.out.println();       
     System.out.println("*********CONSOLAS*********");
     System.out.println();
     Consola ps5 = new Consola();
     Consola xbox = new Consola ("Series x","Negro",20000.99);
       
     ps5.setModelo("PS5 Slim");
     
     System.out.println(xbox);
     System.out.println(ps5);
     
//****************PERROS**************************************//
     System.out.println();
     System.out.println("*********PERROS*********");
     System.out.println();
     Perros chihuahua = new Perros();
     Perros salchicha = new Perros("Salchicha","Mediano","Cafe");
     
     chihuahua.setRaza("Chihuahua");

     System.out.println(chihuahua);
     System.out.println(salchicha);
     
     
     
     
       
       
       
       
       
    	   
        
        
        
        
	}

}
