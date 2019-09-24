package exercisium;

import java.util.HashMap;

public class rna_transcription {

	public static void main(String[] args) {
		HashMap<String, String> nucleo = new HashMap<String, String>();
		nucleo.put("C", "G");
		nucleo.put("G", "C");
		nucleo.put("T", "A");
		nucleo.put("A", "U");
		
		for (String i : nucleo.keySet()) {   //Key set devuelve los valores del Hash Map
			System.out.println(i + "->" + nucleo.get(i));
		}
		

   }
}
	


