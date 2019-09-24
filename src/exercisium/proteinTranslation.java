package exercisium;

import java.util.HashMap;
import java.util.Map;

public class proteinTranslation {
	public static void main(String[] main) {
	Map<String, String> lettersMap = new HashMap<String, String>();
	String cadena = new String("AUG-UUU-UCU-UAA-AUG");
	String array1[] = cadena.split("-");
	lettersMap.put("AUG", "Methionine");
	lettersMap.put("UUU", "Phenylalanine");
	lettersMap.put("UUC", "Phenylalanine");
	lettersMap.put("UUA", "Leucine");
	lettersMap.put("UUG", "Leucine");
	lettersMap.put("UCU", "Serine");
	lettersMap.put("UCC", "Serine");
	lettersMap.put("UCA", "Serine");
	lettersMap.put("UCG", "Serine");
	lettersMap.put("UAU", "Tyrosine");
	lettersMap.put("UAC", "Tyrosine");
	lettersMap.put("UGU", "Cysteine");
	lettersMap.put("UGC", "Cysteine");
	lettersMap.put("UGG", "Tryptophan");
	lettersMap.put("UAA", "STOP");
	lettersMap.put("UAG", "STOP");
	lettersMap.put("UGA", "STOP");
	for (String dividir: array1) {
		System.out.print(dividir + " ");
		
	}
	System.out.println(" ");

	for(int i = 0; i < array1.length; i++) {
		System.out.print(lettersMap.get(array1[i]) + " ");
	}

	
	
	

}


}
		





/*
 switch (dividir) {
	case "AUG":
		System.out.println("Methionine");
	case "UUU":
		System.out.println("Phenylalanine");
	case "UUC":
		System.out.println("Phenylalanine");
	case "UCU":
		System.out.println("Serine");
	case "UCC":
		System.out.println("Serine");
	case "UCA":
		System.out.println("Serine");
	case "UCG":
		System.out.println("Serine");
	case "UAU":
		System.out.println("Serine");
	case "UAC":
		System.out.println("Serine");	
	case "UGU":
		System.out.println("Serine");
	case "UGC":
		System.out.println("Serine");
	case "UGG":
		System.out.println("Tryptophan");
	case "UAA":
		System.out.println("STOP");
	case "UAG":
		System.out.println("STOP");
	case "UGA":
		System.out.println("STOP");
								
	}
 */
 