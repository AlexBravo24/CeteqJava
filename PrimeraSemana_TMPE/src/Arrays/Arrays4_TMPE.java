package Arrays;

public class Arrays4_TMPE {

	public static void main(String[] args) {
		// 4. Dado un array de números de 5 posiciones con los siguientes valores:
		//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
		//los valores invertidos, es decir, que el segundo array deberá tener los valores
		//{5,4,3,2,1}.
		 int[] numeros={1,2,3,4,5};
	        
	       
		 int[] numeros1=new int[numeros.length];
	        
	      
	        
	       
	        for(int i=(numeros.length-1),j=0;i>=0;i--,j++){
	            numeros1[j]=i+1;
	          System.out.println(numeros1[j]);
	        
	        }
	        

	}

}
