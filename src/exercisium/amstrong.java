package exercisium;

import java.util.Scanner;

public class amstrong {

	public static void main(String[] args) {
	      int contador = 0, a, temp;
	      
	      int cifra = 153;
	      int numero = cifra;
	      temp = numero;
	      while (numero > 0) {
	         a = numero % 10;
	         numero = numero / 10;
	         contador = contador + (a * a * a);
	      }
	      if (temp == contador)
	         System.out.println(cifra + " es un numero Amstrong");
	      else
	         System.out.println(cifra + " no es un numero Amstrong");
	   }
	

}



//int i = 0;
//int total = Integer.toString(numero).length();  //Conar los caracteres de cada numero
//System.out.println(total);
//while (i <= 10) {
//System.out.println(numero);

//}