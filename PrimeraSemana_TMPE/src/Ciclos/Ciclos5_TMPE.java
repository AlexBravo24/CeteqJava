package Ciclos;

public class Ciclos5_TMPE {

	public static void main(String[] args) {
		// 5. Una persona desea invertir $1000.00 en un banco,
		//el cual le otorga un 2% de interés mensual.
		//¿Cuál será la cantidad de dinero que esta persona
		//tendrá al cabo de un año si todo el dinero lo reinvierte? 
		
		   
		        double principal = 1000; // Monto de inversión
		        double intereses = 0.02; // Interés mensual

		        for (int monto = 1; monto <= 12; monto++) {
		            double interes = principal * intereses; // Calcular interés mensual
		            principal += interes; // Suma el monto de inversión más el interes mensual
		        }

		        System.out.println("El monto total en un año es: " + principal);
		    }
		

	}


