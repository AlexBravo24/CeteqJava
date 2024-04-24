package com.arrays;

public class Arrays5_ADCA {
	//Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
	//respectivos precios. Muestra en consola la lista de productos y sus precios. 
	//Por lo menos 5 productos o artículos.
	
	
    
   public static void main(String[] args) {
	   String[] productos = {"Camisa", "Pantalón", "Zapatos", "Bolso", "Reloj"};

	    // Array de precios
	    double[] precios = {20.0, 30.0, 50.0, 25.0, 100.0};

	    // Mostrar en consola la lista de productos y sus precios
	   
	   System.out.println("lista de productos y precios: ");
	 for(int i = 0; i < productos.length; i++) {
	 System.out.println(productos[i] + ": $" + precios[i]);
	 

	    }
	   
	   
	
}


}




