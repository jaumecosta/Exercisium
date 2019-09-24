package exercisium;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class perfectNumeros {
	public static void main(String[] args) {		
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
    int i, numero, sum = 0;
    System.out.println("Introduce un numero entero");
    numero = scanner.nextInt();
    	for(i=1;i<numero;i++) {
    		if(numero%i==0) {
    			sum = sum + i;
    			System.out.println(i);
    		}
    	}	
    	if (sum == numero) {
    		System.out.println("El numero es perfecto");
    	} else if (sum > numero){
    		System.out.println("El numero es abundante");
    	} else {
    		System.out.println("El numero es deficiente");
    	}
		
	}
    
}
