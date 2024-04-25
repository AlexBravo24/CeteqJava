
public class Arraysde2Dimenciones {

	public static void main(String[] args) {
		//Array bidimensional
		//nos permite almacenar datos de forma tabular
		//pasando a un concepto de "tabla"
		//permitiendo tener datos en filas y columnas
		
		//Declarar un array de dos dimensiones con su tamaño inicial
		int [] []	matriz = new int [3][3];
		//Quedando de la siguiente manera y en las posiciones:
		//[0,0] [0,1] [0,2]
		//[1,0] 1,1[] 1,2[]
		//[2,0] [2,1] [2,2]
		matriz[0] [0] = 1;
		matriz[0] [1] = 2;
		matriz[0] [2] = 3;
		
		matriz[1] [0] = 4;
		matriz[1] [1] = 5;
		matriz[1] [2] = 6;
		
		matriz[2] [0] = 1;
		matriz[2] [1] = 2;
		matriz[2] [2] = 3;
		
		//Declarando una matriz o array bidimensional con valores asignados
		//desde el inicio
		
		int [] [] matriz2= {{1,2,3},{4,5,6},{7,8,9}};
		//Para recorrer este array necesitamos de dos ciclos for, uno anidado
		//dentro del otro
		 
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println();//Al agregar este salto de linea podemos verlo 
			//en forma del array de matriz
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print(matriz2[i][j]+" ");
			}
		}
		System.out.println("");
		
		//Para almacenar diferentes tipos de datos en un array podemos
		//usar la clase object que nos permite usar mas de un tipo de dato
		
		Object [] array = {1,'a',"Vince",3.1416};
		for (Object i :array ) {
			System.out.println(i);
		}
		
		
	}

}
 