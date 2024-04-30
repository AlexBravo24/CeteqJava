package com;

public class Principal {

	public static void main(String[] args) {
	
		//Antes de crear nuestro celular debemos crear los objetos que formaran parte de los celulares o celular
		
		Camara canon = new Camara ("Canon", 2, 48);
		
		Procesador snap = new Procesador("AmLogic", "SnapDragon", 3.5);
		
		Ram kingston = new Ram("Kingston", "DDR5", 8);
		
		//ya podemos crear nuestro celular y le pasamos los valores de la camara, procesador y ram
		
		Celular motorola = new Celular("Motorola", "Z2", "Negro", canon, snap, kingston);
		
		System.out.println(motorola);
		
		
		//Crear objeto compuesto de otros objetos
		
		Cilindraje cilft200 = new Cilindraje(196, 1, "17 HP");
		
		Rendimiento renft200 = new Rendimiento("gasolina", 418.5, "15.5 L");
		
		Llanta llanft200 = new Llanta(2, "2.75 - R18", "3.25 - R18");
		
		Motocicleta ft200 = new Motocicleta("Italika", "FT200", "Rojo", cilft200, renft200, llanft200);
		
		System.out.println(ft200);
		
		
		

	}

}
