package Arrays;

public class Arrays5_TMPE {

	public static void main(String[] args) {
		// 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
		//respectivos precios. Muestra en consola la lista de productos y sus precios.
		//Por lo menos 5 productos o artículos. 
		String despensa []={"carne", "arroz","limones","pollo"};
		 double precios[]={40,25.30,45.99,26.70};
		 System.out.println("Lista de Productos y sus precios");
		 for (int d=0;d<despensa.length;d++){
		 System.out.println(despensa[d]+ " "+ precios[d]); 
		} 
	}

}
