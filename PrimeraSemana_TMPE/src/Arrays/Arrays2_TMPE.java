package Arrays;

public class Arrays2_TMPE {

	public static void main(String[] args) {
		// 2. Crea un array de números de 100 posiciones, que contendrá los números del
		//1 al 100. Obtén la suma de todos ellos y la media.

int [] numeros = new int [100];
		
		int suma = 0;
		double media;
		
		for (int i = 0 ; i < numeros.length; i++) {
			numeros[i]=i+1;
			suma+=numeros[i];
		}
		
		media= (double) suma/numeros.length;
		
		System.out.println("La suma en general de los numeros del 1 al 100 es " + suma);
		System.out.println("El valor de la media es " + media);

	}

}
