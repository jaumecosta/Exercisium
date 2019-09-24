package exercisium;

import java.util.Scanner;

public class handshake {

	  public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
	        System.out.println("Pon un numero");
	        int numero = scanner.nextInt();
	        String binario = "";
	        if (numero > 0) {
	            while (numero > 0) {
	                if (numero % 2 == 0) {
	                    binario = "0" + binario;
	                } else {
	                    binario = "1" + binario;
	                }
	                numero = (int) numero / 2;
	            }
	        } else if (numero == 0) {
	            binario = "0";
	        } else {
	            binario = "No se pudo convertir el numero. Ingrese solo números positivos";
	        }
	        System.out.println("El número convertido a binario es: " + binario);
	        
	        int entero = Integer.parseInt(binario);

	        if (entero >= 1 && entero <= 10){
	        	System.out.println("Wink");
	        }   
	        else if (entero >= 11 && entero <= 99){
	        	System.out.println("double Wink");
	        }
	        
	        else if (entero > 100 && entero < 999){
	        	System.out.println("close your eyes");
	        }
	        
	        else if (entero > 1000 && entero < 9999){
	        	System.out.println("jump");
	        } else {
	        	System.out.println("Reverse the order of the operations in the secret handshake.");
	        }
	    }
}