package exercisium;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class scrabble {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	System.out.println("BIENVENIDO A SCRABBLE");
	System.out.println("JUGADOR 1 ESCRIBA UNA PALABRA");
	String cadena = scanner.nextLine().toUpperCase();	
	System.out.println("JUGADOR 2 ESCRIBA UNA PALABRA");
	String cadena2 = scanner.nextLine().toUpperCase();	

	
	
	HashMap<String, Integer> scrabel = new HashMap<String, Integer>();	
	scrabel.put("A", 1);
	scrabel.put("E", 1);
	scrabel.put("I", 1);
	scrabel.put("O", 1);
	scrabel.put("U", 1);
	scrabel.put("L", 1);
	scrabel.put("N", 1);
	scrabel.put("R", 1);
	scrabel.put("S", 1);
	scrabel.put("T", 1);
	scrabel.put("D", 2);
	scrabel.put("G", 2);
	scrabel.put("B", 3);
	scrabel.put("C", 3);
	scrabel.put("M", 3);
	scrabel.put("P", 3);
	scrabel.put("F", 4);
	scrabel.put("H", 4);
	scrabel.put("V", 4);
	scrabel.put("W", 4);
	scrabel.put("Y", 4);
	scrabel.put("K", 5);
	scrabel.put("J", 8);
	scrabel.put("X", 8);
	scrabel.put("Q", 10);
	scrabel.put("Z", 10);
	int sumatorio = 0;
	int sumatorio1 = 0;

try {
	for(int i = 0; i < cadena.length(); i++) {		
            System.out.print(cadena.charAt(i));
            String s = Character.toString(cadena.charAt(i));
            sumatorio += scrabel.get(s).intValue();
          


	}
	System.out.print(" Sumatorio: " + sumatorio + " puntos para el JUGADOR 1 ");
	System.out.println(" ");

	for(int i = 0; i < cadena2.length(); i++) {		
	  System.out.print(cadena2.charAt(i));
      String S = Character.toString(cadena2.charAt(i));
      sumatorio1 += scrabel.get(S).intValue();
	}
	System.out.print(" Sumatorio: " + sumatorio1 + " puntos para el JUGADOR 2 ");
	System.out.println(" ");

	
	if( sumatorio > sumatorio1) {
		System.out.println("JUGADOR 1 GANA");
	} 
	else if( sumatorio < sumatorio1) {
		System.out.println("JUGADOR 2 GANA");
	} else {
		System.out.println("EMPATE");
	}
	
	}catch (Exception e) {
	      System.out.println("Something went wrong.");
	    }
	
	}
}
