package com;

public class Principal {

	public static void main(String[] args) {
		
//		Cientificas calcs= new Cientificas();
//		calcs.sumar(0, 0);
//		calcs.sumar(0, 0, 0);
//		
//		calcs.restar(0, 0);
//		calcs.restar(0, 0, 0);
//		
//		calcs.dividir(0, 0);
//		calcs.dividir(0, 0, 0);
//		
//		calcs.multiplicar(0, 0);
//		calcs.multiplicar(0, 0, 0);
				
		Cientifica calc = new Cientifica("Casio","Gris","Bateria","LED");
		System.out.println(calc);
		
		 calc.sumar(5, 2);
		 calc.sumar(3, 7, 1);
		 
		 calc.restar(7, 1);
		 calc.restar(29, 5, 8);
		 
		 calc.dividir(9, 3);
		 calc.dividir(18,2,3);
		 
		 calc.multiplicar(3, 4);
		 calc.multiplicar(2, 9, 3);
		 calc.tomarTemperatura();
		 
		 //De dónde toman coportamientos nuestras clases u objetos?
		 /*metodos propios
		  * de clases heredandalas o clases abstractas
		  * de interfaces 
		  */

	}

}
