package exercisium;

import java.util.Scanner;

public class SpaceAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double tierra = 365.25;
	double mercurio = 0.2408467;
	double venus = 0.61519726 ;
	double marte = 1.8808158;
	double jupiter = 11.862615;
	double saturno = 29.447498;
	double urano = 84.016846;
	double neptuno = 164.79132;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Introduce tu edad");
	int edad = scanner.nextInt();
	System.out.println("En la " +  edad * tierra * 24 * 60 * 60 + " Segundos en el planeta tierra");
	System.out.println("En la " + edad * mercurio * 24 * 60 * 60 + " Segundos en el planeta mercurio");
	System.out.println("En la " + edad * venus * 24 * 60 * 60 + " Segundos en el planeta venus");
	System.out.println("En la " + edad * marte * 24 * 60 * 60 + " Segundos en el planeta marte");
	System.out.println("En la " + edad * jupiter * 24 * 60 * 60 + " Segundos en el planeta jupiter");
	System.out.println("En la " + edad * saturno * 24 * 60 * 60 + " Segundos en el planeta saturno");
	System.out.println("En la " + edad * urano * 24 * 60 * 60 + " Segundos en el planeta urano");
	System.out.println("En la " + edad * neptuno * 24 * 60 * 60 + " Segundos en el planeta neptuno");

	}

}
