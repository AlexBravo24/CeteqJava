package com.array;

import java.util.Scanner;

public class Array5_AAPS {

	public static void main(String[] args) {
		// Crea dos arrays, uno para mostrar n productos y otro para mostrar sus respectivos precios. 
		// Muestra en consola la lista de productos y sus precios. Por lo menos 5 productos o artículos.

		String producto [] = {"jabon", "leche", "servilletas", "pasta", "huevos"};
		
		double precio [] = {15.50, 28.80, 34.50, 27.70, 58.20};
		
		System.out.println("A continuación se muestra una lista de productos con sus respectivos precios por unidad: ");
		
		for (int c = 0; c<producto.length; c++) {
			System.out.println(producto [c] + " $" + precio [c]);
		}
	}

}
