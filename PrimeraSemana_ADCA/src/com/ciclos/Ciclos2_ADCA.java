package com.ciclos;

import java.util.Scanner;

public class Ciclos2_ADCA {
	public static void main(String[] args) {
	       

        int i; //Multiplicando
        int j; //Multiplicador
        int k; //donde empieza la iteracion 
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el Multiplicando");
        i = entrada.nextInt();
        System.out.println("Introduzca el Multiplicador");
        j = entrada.nextInt();
        System.out.println("Introduzca hasta que valor quiere la tabla");
        k = entrada.nextInt();
        while(j <= k){
            
            System.out.println(j + " x " + i + " = " + (i * j));
            j++;
            
        }

        
    }

}
