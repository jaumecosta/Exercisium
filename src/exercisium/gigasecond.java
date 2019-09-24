package exercisium;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class gigasecond {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Calendar calendario = new GregorianCalendar();   //Muesra el calendario Gregoriano
		int hora =calendario.get(Calendar.HOUR_OF_DAY); //Muesta el tiempo en hora
		int minutos = calendario.get(Calendar.MINUTE);  //Muesta el tiempo en minutos
		int segundos = calendario.get(Calendar.SECOND); //Muesta el tiempo en segundos
			long tiempoInicio = System.currentTimeMillis(); //Devuelve el tiempo en milisegundos
		
				System.out.println("Son las " + hora + "h " + minutos + "m " + segundos + "s");
				Thread.sleep(2000);
				System.out.println("Milisegundos son " + tiempoInicio);


	}

}
