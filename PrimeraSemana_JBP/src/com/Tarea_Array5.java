package com;

public class Tarea_Array5 {

	public static void main(String[] args) {
		
		String[] productos = new String [5];
		int [] precios = new int [5];
		productos[0] = "verduras" ;
		productos[1] = "Detergente";
		productos[2] = "Carnes";
		productos[3] = "Lacteos";
	    productos[4] = "Papel";
		
	    precios[0] = 50;
	    precios[1] = 35;
	    precios[2] = 90;
	    precios[3] = 60;
	    precios[4] = 40;
		
 for (int i =  0; i<productos.length; i++) {
			
			System.out.println("El artículo " +productos[i]+ " vale "+precios[i]);
		}
	   
		
		
		

	}

}
