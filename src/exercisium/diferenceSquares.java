package exercisium;

import java.util.Scanner;

public class diferenceSquares {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Escribe un numero");
			String numusuario = scanner.nextLine(); 
			int resultado = Integer.parseInt(numusuario);
			int i, sumSQR = 0;
		    int sum = 0;
		    	for(i=1;i<=resultado;i++) {
		    		sumSQR = sumSQR + i*i;
		    		sum = sum + i;	
		    			System.out.println(sumSQR);
		    		
		    	}	
		    	int resto = sum*sum - sumSQR;
		    	System.out.println("El cuadrado de la suma " + sum*sum);
		    	System.out.println("Suma del cuadrado " + sumSQR);
		    	System.out.println("La diferencia natural es " + resto );
		    	

			}
		    
}
