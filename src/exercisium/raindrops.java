package exercisium;

import java.util.Scanner;

public class raindrops {
	public static void main(String[] args) {		
	try {
	Scanner scanner = new Scanner(System.in);
    int i, numero = 0;
    System.out.println("Introduce un numero entero");
    numero = scanner.nextInt();
    	for(i=1;i<=numero;i++) {
    		if(numero%i==0) {
    			switch (i) {
				case 3:
					System.out.println("Pling");
					break;
				case 5:
					System.out.println("Plang");
					break;
				case 7:
					System.out.println("Plong");
					break;
				default:
					System.out.println("seco");
					break;
				}
    			System.out.println(i);
    		}
    	}
    	
	} catch (Exception e) {
	   System.out.println("Something went wrong.");
	} finally {
	      System.out.println("The 'try catch' is finished.");
	}
    
}
}