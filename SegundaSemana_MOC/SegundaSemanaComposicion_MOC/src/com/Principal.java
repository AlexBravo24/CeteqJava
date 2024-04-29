package com;

public class Principal {

	public static void main(String[] args) {
		// Antes de crear el celular, debemos crear los objetos
		//que formaran parte de los celulares
		
		Camara canon=new Camara("Cannon", 2, 48);
		Procesador snap=new Procesador("Amlogic", "Snapdragon", 3.5);
		Ram kingston=new Ram("Kingston", "DDR5",8);
		
		//Ahora ya se puede crear el celular y le pasamos valores de
		//camara, procesador y ram
		
		Celular motorola= new Celular("Motorola", "Z2","Negro", canon, snap, kingston);
		
		//Mandar a imprimir en consola nuestro celular
		System.out.println(motorola);
		
		Pantalla pant1=new Pantalla("LED","LED",65);
		Procesador1 x1=new Procesador1("Sony", "X1", 2.0);
		Conectividad con=new Conectividad("Bluetooth", 3, "Si");
		
		Television samsung = new Television("Samsung","Negro",65.0,pant1,x1,con);
		System.out.println(samsung);
		
		
		
		
		
	}

}
