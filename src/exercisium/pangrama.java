package exercisium;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class pangrama {
		public static void main(String args[]){
			String pangrama = "the quick brown fox jumps over the lazy dog";
		    boolean[] alphaList = new boolean[26];
			int index = 0;
		    int contador = 1;

			for(int i = 0; i < pangrama.length(); i++) {
				if (pangrama.charAt(i) >= 'a' && pangrama.charAt(i) <= 'z') {
		            index = pangrama.charAt(i) - 'a'; 

				} 
		         alphaList[index] = true; 

			}
			 for (int i = 0; i <= 25; i++) {
		         if (alphaList[i] == false)
		            contador = 0;
		      }
		
			
			 System.out.println(pangrama);
		      if (contador == 1)
		         System.out.println("Es un pangrama.");
		      else
		         System.out.println("No es pagrama.");
		   }
			
			
				
		}
	
