package com;

public class CicloOBucle {
public static void main(String[] args) {
	//CICLOS O BUCLES
	//Son estructuras que nos van a permitir repetir sentencias o procesos

	//While(mientras) - indeterminado - mientras se cumple una condicion
	int x =0;
	System.out.println("Probando el ciclo while");
	while (x<=5) {
	//Mientras se cumpla esta condicion ejecutamos este bloque de codigo
	System.out.println("Primer Wile " + x);
//	x= x+1;//De esta manera aumentamos la variable para que esta pueda finalizar
	x++;//Tambien podemos hacerlo de esta manera incrementando la variable
	
	}
	
	//Do while
	//Ejecuta el codigo una vez y despues de esto pregunta si se sigue realizando
	//de esta forma aseguramos que si la condicion puede no llegar a cumplirse el 
	//programa se ejecuta 1 vez
	System.out.println("Probando el ciclo Do While");
	do {//Haz o ejecuta el siguiente codigo
		System.out.println("Probando el ciclo Do While");
	} while (x==10);
	
	
	//For - ciclo determinado
	//Es el mas utilizado
	//Es similar al while pero de una sola linea
	//para (estas condiciones) realizar lo siguiente
	//para (una variable con un valor; una condicion; un incremento)
	System.out.println("Ciclo for");
	for(int i=1;i<=5;i++) {
		System.out.println("Probando el ciclo for " + i);
	}



}
}
