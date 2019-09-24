package exercisium;

import java.util.Scanner;

public class two_fer {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in); 
	    String userName;
		System.out.println("Introduce tu nombre:");
		userName = scanner.nextLine();   //El scanner se aplica en la siguiene linia
		System.out.println("One for " + userName + " one for me");
	}
}
