package exercisium;

import java.util.Scanner;

public class acronimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Conversor de frase en acronimos");
		String cadena = scanner.nextLine();
		for(int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) >= 'A' && cadena.charAt(i) <= 'Z') {
				System.out.print(cadena.charAt(i));

			} 
	}

}
}