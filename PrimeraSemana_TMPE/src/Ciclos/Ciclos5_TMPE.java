package Ciclos;

public class Ciclos5_TMPE {

	public static void main(String[] args) {
		// 5. Una persona desea invertir $1000.00 en un banco,
		//el cual le otorga un 2% de inter�s mensual.
		//�Cu�l ser� la cantidad de dinero que esta persona
		//tendr� al cabo de un a�o si todo el dinero lo reinvierte? 
		
		   
		        double principal = 1000; // Monto de inversi�n
		        double intereses = 0.02; // Inter�s mensual

		        for (int monto = 1; monto <= 12; monto++) {
		            double interes = principal * intereses; // Calcular inter�s mensual
		            principal += interes; // Suma el monto de inversi�n m�s el interes mensual
		        }

		        System.out.println("El monto total en un a�o es: " + principal);
		    }
		

	}


