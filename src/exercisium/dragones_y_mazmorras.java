package exercisium;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class dragones_y_mazmorras {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner personaje = new Scanner(System.in);
		System.out.println("Inroduce el nombre de tu personage");
		String nombrePersonaje = personaje.nextLine();
		System.out.println("Nombre del personaje:" + nombrePersonaje + "\n");
		Random myRandom=new Random();
		ArrayList<String> habilidad = new ArrayList<String>();
		habilidad.add("fuerza");
		habilidad.add("destreza");
		habilidad.add("constitucion");
		habilidad.add("inteligencia");
		habilidad.add("sabiduria");
		habilidad.add("carisma");
		for (int i = 0; i<6; i++) {

		int Lanzamiento1 = myRandom.nextInt(6) + 1;
		int Lanzamiento2 = myRandom.nextInt(6) + 1;
		int Lanzamiento3 = myRandom.nextInt(6) + 1;
		int Lanzamiento4 = myRandom.nextInt(6) + 1;
		int suma = (Lanzamiento1 + Lanzamiento2 + Lanzamiento3);
		int suma1 = (Lanzamiento2 + Lanzamiento3 + Lanzamiento4);
		int suma2 = (Lanzamiento3 + Lanzamiento1 + Lanzamiento4);
		int suma3 = (Lanzamiento4 + Lanzamiento2 + Lanzamiento1);
		System.out.println("Primer lanzamiento");
		System.out.println(Lanzamiento1); //Da un numero aleaorio del 1 al 10;
		System.out.println("Segundo lanzamiento");
		System.out.println(Lanzamiento2); //Da un numero aleaorio del 1 al 10;
		System.out.println("Tercer lanzamiento");
		System.out.println(Lanzamiento3); //Da un numero aleaorio del 1 al 10;
		System.out.println("Cuarto lanzamiento");
		System.out.println(Lanzamiento4); //Da un numero aleaorio del 1 al 10;
		if(Lanzamiento4 <= Lanzamiento1 && Lanzamiento4 <= Lanzamiento2  && Lanzamiento4 <= Lanzamiento3) {
			System.out.print("El resultado es " + suma + " "  + habilidad.get(i) + " para " + nombrePersonaje + "\n"+ "\n" );
		} else if(Lanzamiento3 <= Lanzamiento1 && Lanzamiento3 <= Lanzamiento2  && Lanzamiento3 <= Lanzamiento4) {
			System.out.print("El resultado es " + suma3 + " "  + habilidad.get(i) + " para " + nombrePersonaje + "\n"+ "\n");
		}
			else if(Lanzamiento2 <= Lanzamiento1 && Lanzamiento2 <= Lanzamiento1  && Lanzamiento2 <= Lanzamiento3) {
				System.out.print("El resultado es " + suma1 + " "  + habilidad.get(i) + " para " + nombrePersonaje + "\n"+ "\n");
		
		}else if(Lanzamiento1 <= Lanzamiento4 && Lanzamiento1 <= Lanzamiento2  && Lanzamiento1 <= Lanzamiento3) {
			System.out.print("El resultado es " + suma2 + " " + habilidad.get(i)+ " para " + nombrePersonaje + "\n" + "\n");
			
		
		}
		
		switch (habilidad.get(i)) {
		case "fuerza":
			if(Lanzamiento4 <= Lanzamiento1 && Lanzamiento4 <= Lanzamiento2  && Lanzamiento4 <= Lanzamiento3) {
				int Calculo = suma - 10 / 2;
				System.out.print("La fuerza total de " + nombrePersonaje + " es " + Calculo + "\n");
			}
			else if(Lanzamiento3 <= Lanzamiento1 && Lanzamiento3 <= Lanzamiento2  && Lanzamiento3 <= Lanzamiento4) {
				int Calculo = suma3 - 10 / 2;
				System.out.print("La fuerza total de " + nombrePersonaje + " es " + Calculo + "\n");
			}
				else if(Lanzamiento2 <= Lanzamiento1 && Lanzamiento2 <= Lanzamiento1  && Lanzamiento2 <= Lanzamiento3) {
					int Calculo = suma1 - 10 / 2;
					System.out.print("La fuerza total de " + nombrePersonaje + " es " + Calculo + "\n");
			
			}else if(Lanzamiento1 <= Lanzamiento4 && Lanzamiento1 <= Lanzamiento2  && Lanzamiento1 <= Lanzamiento3) {
				int Calculo = suma2 - 10 / 2;
				System.out.print("La fuerza total de " + nombrePersonaje + " es " + Calculo + "\n");
				
			
			}		case "destreza":
			if(Lanzamiento4 <= Lanzamiento1 && Lanzamiento4 <= Lanzamiento2  && Lanzamiento4 <= Lanzamiento3) {
				int Calculo = suma - 10 / 2;
				System.out.print("La destreza total de " + nombrePersonaje + " es " + Calculo + "\n");
			}
			else if(Lanzamiento3 <= Lanzamiento1 && Lanzamiento3 <= Lanzamiento2  && Lanzamiento3 <= Lanzamiento4) {
				int Calculo = suma3 - 10 / 2;
				System.out.print("La destreza total de " + nombrePersonaje + " es " + Calculo + "\n");
			}
				else if(Lanzamiento2 <= Lanzamiento1 && Lanzamiento2 <= Lanzamiento1  && Lanzamiento2 <= Lanzamiento3) {
					int Calculo = suma1 - 10 / 2;
					System.out.print("La destreza total de " + nombrePersonaje + " es " + Calculo + "\n");
			
			}else if(Lanzamiento1 <= Lanzamiento4 && Lanzamiento1 <= Lanzamiento2  && Lanzamiento1 <= Lanzamiento3) {
				int Calculo = suma2 - 10 / 2;
				System.out.print("La destreza total de " + nombrePersonaje + " es " + Calculo + "\n");
				
			
			}		case "constitucion":
			if(Lanzamiento4 <= Lanzamiento1 && Lanzamiento4 <= Lanzamiento2  && Lanzamiento4 <= Lanzamiento3) {
				int Calculo = suma - 10 / 2;
				System.out.print("La constitucion total de " + nombrePersonaje + " es " + Calculo + "\n");
			}
			else if(Lanzamiento3 <= Lanzamiento1 && Lanzamiento3 <= Lanzamiento2  && Lanzamiento3 <= Lanzamiento4) {
				int Calculo = suma3 - 10 / 2;
				System.out.print("La constitucion total de " + nombrePersonaje + " es " + Calculo + "\n");
			}
				else if(Lanzamiento2 <= Lanzamiento1 && Lanzamiento2 <= Lanzamiento1  && Lanzamiento2 <= Lanzamiento3) {
					int Calculo = suma1 - 10 / 2;
					System.out.print("La constitucion total de " + nombrePersonaje + " es " + Calculo + "\n");
			
			}else if(Lanzamiento1 <= Lanzamiento4 && Lanzamiento1 <= Lanzamiento2  && Lanzamiento1 <= Lanzamiento3) {
				int Calculo = suma2 - 10 / 2;
				System.out.print("La constitucion total de " + nombrePersonaje + " es " + Calculo + "\n");
				
			
			}
		case "inteligencia":
			if(Lanzamiento4 <= Lanzamiento1 && Lanzamiento4 <= Lanzamiento2  && Lanzamiento4 <= Lanzamiento3) {
				int Calculo = suma - 10 / 2;
				System.out.print("La inteligencia total de " + nombrePersonaje + " es " + Calculo + "\n");
			}
			else if(Lanzamiento3 <= Lanzamiento1 && Lanzamiento3 <= Lanzamiento2  && Lanzamiento3 <= Lanzamiento4) {
				int Calculo = suma3 - 10 / 2;
				System.out.print("La inteligencia total de " + nombrePersonaje + " es " + Calculo + "\n");
			}
				else if(Lanzamiento2 <= Lanzamiento1 && Lanzamiento2 <= Lanzamiento1  && Lanzamiento2 <= Lanzamiento3) {
					int Calculo = suma1 - 10 / 2;
					System.out.print("La inteligencia total de " + nombrePersonaje + " es " + Calculo + "\n");
			
			}else if(Lanzamiento1 <= Lanzamiento4 && Lanzamiento1 <= Lanzamiento2  && Lanzamiento1 <= Lanzamiento3) {
				int Calculo = suma2 - 10 / 2;
				System.out.print("La inteligencia total de " + nombrePersonaje + " es " + Calculo + "\n");
				
			
			}		case "sabiduria":
				if(Lanzamiento4 <= Lanzamiento1 && Lanzamiento4 <= Lanzamiento2  && Lanzamiento4 <= Lanzamiento3) {
					int Calculo = suma - 10 / 2;
					System.out.print("La sabiduria total de " + nombrePersonaje + " es " + Calculo + "\n");
				}
				else if(Lanzamiento3 <= Lanzamiento1 && Lanzamiento3 <= Lanzamiento2  && Lanzamiento3 <= Lanzamiento4) {
					int Calculo = suma3 - 10 / 2;
					System.out.print("La sabiduria total de " + nombrePersonaje + " es " + Calculo + "\n");
				}
					else if(Lanzamiento2 <= Lanzamiento1 && Lanzamiento2 <= Lanzamiento1  && Lanzamiento2 <= Lanzamiento3) {
						int Calculo = suma1 - 10 / 2;
						System.out.print("La sabiduria total de " + nombrePersonaje + " es " + Calculo + "\n");
				
				}else if(Lanzamiento1 <= Lanzamiento4 && Lanzamiento1 <= Lanzamiento2  && Lanzamiento1 <= Lanzamiento3) {
					int Calculo = suma2 - 10 / 2;
					System.out.print("La sabiduria total de " + nombrePersonaje + " es " + Calculo + "\n");
					
				
				}		case "carisma":
					if(Lanzamiento4 <= Lanzamiento1 && Lanzamiento4 <= Lanzamiento2  && Lanzamiento4 <= Lanzamiento3) {
						int Calculo = suma - 10 / 2;
						System.out.print("La carisma total de " + nombrePersonaje + " es " + Calculo + "\n");
					}
					else if(Lanzamiento3 <= Lanzamiento1 && Lanzamiento3 <= Lanzamiento2  && Lanzamiento3 <= Lanzamiento4) {
						int Calculo = suma3 - 10 / 2;
						System.out.print("La carisma total de " + nombrePersonaje + " es " + Calculo + "\n");
					}
						else if(Lanzamiento2 <= Lanzamiento1 && Lanzamiento2 <= Lanzamiento1  && Lanzamiento2 <= Lanzamiento3) {
							int Calculo = suma1 - 10 / 2;
							System.out.print("La carisma total de " + nombrePersonaje + " es " + Calculo + "\n");
					
					}else if(Lanzamiento1 <= Lanzamiento4 && Lanzamiento1 <= Lanzamiento2  && Lanzamiento1 <= Lanzamiento3) {
						int Calculo = suma2 - 10 / 2;
						System.out.print("La carisma total de " + nombrePersonaje + " es " + Calculo + "\n");
						
					
					}
			
		}
		}
		
		
		
		} catch(Exception e) {
			System.out.println("Something went wrong.");
		} finally {
		      System.out.println("The 'try catch' is finished.");
	    }
		
		
		
}
}