package com.arrays;

public class Arrays5_MOC {

	public static void main(String[] args) {
		// Crea dos arrays, uno para mostrar n productos y otro para mostrar sus respectivos precios. 
		//Muestra en consola la lista de productos y sus precios. Por lo menos 5 productos o artículos.
	String [] productos= {"teclado", "Mouse", "Monitor", "cpu","impresora","camara"};
	int[] precios={100,50,500,600,250,156};
	for (int i = 0; i < precios.length; i++) {
		System.out.println("El precio de  "+productos[i]+" es de: $"+precios[i]);
	}
	}

}
