package com;

public class Principal {

	public static void main(String[] args) {
		
		Camara canon = new Camara("Canon", 2, 48);
		
		Procesador snap = new Procesador("AmLogic", "Snapdragon", 3.5);
		
		Ram kingston =new Ram ("Kingston", "DDR5", 8);
		
		Celular motorola = new Celular ("Motorola", "Z2", "Negro", canon, snap, kingston);
		
		System.out.println(motorola);
		
		//
		
		Llantas ll = new Llantas ("Michellin", "Pista", 140.70);
		
		Rendimiento ren = new Rendimiento (3,4);
		
		Cilindraje cc = new Cilindraje ("Baja Cilindrada", 125);
		
		Moto harley = new Moto ("Harley Davidson", "Iron883", "Negro", ll, cc, ren);
		
		System.out.println(harley);


	}

}
