package com.poo1;

public class Principal {
	
	public static void main(String[] args) {
		
		FavPlayers ohtani = new FavPlayers();
		
		FavPlayers delacruz = new FavPlayers("Elly de la cruz", "Reds", 44, 7, 0.295);

		ohtani.setEquipo("LA Dodgers");
		
		
		Bebidas yakult = new Bebidas("manzana", 7.4, 80, "plastico");
		Bebidas cocaCola = new Bebidas();
		
		cocaCola.setSabor("Cola");
		
		TarjetasBancarias coppel = new TarjetasBancarias();
		TarjetasBancarias santander = new TarjetasBancarias("Santander", "Rojo", "Master Card", "8658 4573 1985 1065");
		
		coppel.setBanco("coppel");
				
		System.out.println(ohtani);
		System.out.println(delacruz);
		System.out.println(cocaCola);
		System.out.println(yakult);
		System.out.println(coppel);
		System.out.println(santander);
		
	}
	
	
	
}
