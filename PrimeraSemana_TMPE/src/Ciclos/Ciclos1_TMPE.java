package Ciclos;

public class Ciclos1_TMPE {

public static void main(String[] args) {
	// 1.- Programa un algoritmo que realice la tabla de multiplicar del 12

	System.out.println("Tabla de multiplicar del  12");    
	int tabla = 12; 
    tabla_de_multiplicar(tabla);
}

public static void tabla_de_multiplicar(int tabla) {
    for (int x = 1; x <= 10; x++) {
        String formato = "%d x %d = %d";
        String linea = String.format(formato,tabla, x, tabla * x);
        System.out.println(linea);
    }
}
}
