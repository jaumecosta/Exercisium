package exercisium;

public class reserve_string {
	public static void main(String[] args) {
		String palabra = "supercalifragilisticoespialidoso";
		StringBuilder stringBuilder = new StringBuilder(palabra); //Almacena cadenas de caracteres
		String revertudo = stringBuilder.reverse().toString();   //El to string hay que ponerlo para convertir el stringBuilder a String
		System.out.println();
		System.out.println("Cadena invertida " + revertudo);
	} 
}
