package com.condicionales;

import java.util.Scanner;

public class Condicionales8_MOC {
public static void main(String[] args) {

	Scanner entrada=new Scanner (System.in);
	System.out.println("Ingresa el valor obtenido tras lanzar el dado");
	int vdado=entrada.nextInt();
	String n1="uno";
	String n2="dos";
	String n3="tres";
	String n4="cuatro";
	String n5="cinco";
	String n6="seis";
	if(vdado==1) {
		System.out.println("El numero de la cara opuesta es 6 y se compone por " + n6.length() + " letras");
			}
	else if(vdado==2) {
		System.out.println("El numero de la cara opuesta es 5 y se compone por " + n5.length() + " letras");	}
	else if(vdado==3) {
		System.out.println("El numero de la cara opuesta es 4 y se compone por " + n4.length() + " letras");	}
	else if(vdado==4) {
		System.out.println("El numero de la cara opuesta es 3 y se compone por " + n3.length() + " letras");	}
	else if(vdado==5) {
		System.out.println("El numero de la cara opuesta es 2 y se compone por " + n2.length() + " letras");	}
	else if(vdado==6) {
		System.out.println("El numero de la cara opuesta es 1 y se compone por " + n1.length() + " letras");	}
	else {
		System.out.println("ERROR, número incorrecto");
	}
}
}
