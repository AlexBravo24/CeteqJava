package com.arrays;

public class Arrays5_MDOC {

	public static void main(String[] args) {
		
		System.out.println("Este programa muestra una lista de productos con sus precios"
				+ " a partir de dos arrays.");
		
		
		String[] productos = {"Galletas", "Leche", "Chocolate", "Huevo", "jabón"};
		double[] precios = {89.90, 29.30, 3.50, 49.99, 9.50};

		
		System.out.println("Lista de productos y sus precios:");
		for (int i = 0; i < productos.length; i++) {
		System.out.println(productos[i] + " - $" + precios[i]);
		}
		
	}

}
