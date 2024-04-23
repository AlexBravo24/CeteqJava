package com.arrays;

public class Arrays5_SHF {

	public static void main(String[] args) {

//		5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
//		respectivos precios. Muestra en consola la lista de productos y sus precios. 
//		Por lo menos 5 productos o artículos. 
		
		String[] productos = {"tenis", "calcetines", "jeans", "camisa", "short"};
		
		double[] precios = {1000.50, 50.20, 600.50, 500.99, 300.06};
		
		for(int i = 0; i < productos.length; i++) {
			System.out.println(productos[i] + " : " + precios[i]);
		}	
	}
}
