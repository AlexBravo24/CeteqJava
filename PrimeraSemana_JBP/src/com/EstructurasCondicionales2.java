package com;

public class EstructurasCondicionales2 {

	public static void main(String[] args) {
		
		
		int x = 10;
		if (x<10) { //si (esto  es verdad) {ejecuta lo siguiente
			System.out.println("si");
		}else {//De otro modo ejecuta lo siguiente 
			System.out.println("no");
			
		}
		
		//OPERADORES L�GICOS AND. OR, NOT, DIFERENTE DE, IGUALDAD
		//CONDICIONES COMPUESTAS 
		//AND -&&- DEVUELVE EL VALOR TRUE  CUANDO SE CUMPLEN TODAS LAS CONDICIONES
		
//		if (x<11 && x>8 && x==9) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
		
		//DIFERENTE DE ! = - COMPARA LOS VALORES Y DEVUELVE TRUE SI ESTOS VALORES SON DIFERENTES
//		System.out.println("RESULTADO OPERADOR L�GICO DIFERENTE");
//		
//		if (x!= 20) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
	
		//IGUALDAD  = compara si los valores son iguales y devuelve true  cuando esto se cumpla
		
//        System.out.println("RESULTADO OPERADOR L�GICO IGUALDAD");
//		
//		if (x== 10) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
		
		//NOT   ! NIEGA UNA CONDICI�N O M�S BIEN, CAMBIA EL VALOR DE TRUE O FALSE 
		
//        System.out.println("RESULTADO OPERADOR L�GICO NOT");
//		
//		if (!(x== 10)) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
		
		//ESTRUCTURA IF- ELSE ANIDADO O CONCATENADO
		
		
		System.out.println("Estructufa else-if anidado");
		
		int dia = 5;
		
		if (dia == 1){
			System.out.println("Lunes");
			
		}else if (dia ==2) {
			System.out.println("Martes");
		}else if (dia ==3) {
			System.out.println("Miercoles");
		}else if (dia ==4) {
			System.out.println("Jueves");
		}else if (dia ==5) {
			System.out.println("Viernes");
		}else  {
			System.out.println("Error de d�a");
		}
		
		//ESTRUCTURA DE DECISI�N SWITCH-CASE
		
		switch (dia) {
		case  1:
			System.out.println("Lunes");
			break;
		case  2:
			System.out.println("Martes");
			break;
		case  3:
			System.out.println("Miercoles");
			break;
		case  4:
			System.out.println("Jueves");
			break;
		case  5:
			System.out.println("Viernes");
			break;
			default:
			System.out.println("Eror de d�a");
			break;
		}
		
		
		
		
		
	}

}
