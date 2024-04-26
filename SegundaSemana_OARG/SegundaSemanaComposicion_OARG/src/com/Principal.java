package com;

public class Principal {

	public static void main(String[] args) {
		
	//Antes de crear nuestro celular, debemos crear los objetos que formaran parte de los celulares
		
	  Camara canon = new Camara("Canon", 2 , 48);
	  
	  Procesador snap = new Procesador("AmLogic","SnapDragon",3.5);
	  
	  Ram kingston = new Ram ("Kingston","DDR5",8);
	  
	  
	  //Ahora si ya podemos crear nuestro celular y le pasamos los valores de la camara, procesador y ram
	  
	 Celular motorola = new Celular("Motorola","Z2","Negro",canon,kingston, snap);
	 
	 //Mandar a imrpimir en consola nuestro celular
	 
	  System.out.println(motorola);
	  
	  
	  //CRear un objeto que se componga de por lo menos otros 3 
	  //EJ. una computadora con atributos propios como color, marca, modelo
	  //y que se compone de procesador, almacenamiento y ram
	 System.out.println(); 
	
     Estereo sony = new Estereo("Sony","DSX-A410BT",1484);
     Llantas michellin = new Llantas("Michellin","R26",30);
     Interiores piel = new Interiores ("Negro","Piel",2);
     
     Autos bmw = new Autos ("BMW","320i","Rojo",sony,michellin,piel);
     
     System.out.println(bmw);
     
     
	  
	  
	  

	}

}
