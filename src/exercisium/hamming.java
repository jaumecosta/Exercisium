package exercisium;


public class hamming {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cadena={"C", "A", "G", "T"};
		String[] aleatorio=new String[10];
		String[] aleatorio1=new String[10];
		int distancia=0;
		try {
			for(int i=0;i<10;i++) {
				aleatorio[i]=cadena[(int)(Math.random()*4)];
				aleatorio1[i]=cadena[(int)(Math.random()*4)];
				System.out.print(aleatorio[i]); 
				System.out.println(aleatorio1[i]);
				if(aleatorio[i] != aleatorio1[i]) {
					distancia++;
				}
			
		}	
			System.out.println(" La distancia de hammington es " + distancia);
	}
		catch (NumberFormatException ex) {
			ex.printStackTrace();
		}
	
   }
}

/*
package exercisium;

HAMMING ORDENADO
public class hamming_ordenador {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cadena={"C", "A", "G", "T"};
		String[] aleatorio=new String[10];
		String[] aleatorio1=new String[10];
		//int distancia=0;
	
			for(int i=0;i<10;i++) {
				aleatorio[i]=cadena[(int)(Math.random()*4)];
				System.out.print(aleatorio[i]); 
			}
			
			
			for(int j=0;j<10;j++) {
				aleatorio1[j]=cadena[(int)(Math.random()*4)];
				System.out.print(aleatorio1[j]);
				
			
	
			}
			
			//System.out.println(" La distancia de hammington es " + distancia);

	
   }
}

*/