package esercitazioneClassiAstratte;

import java.util.Random;

public class MonetaNonAbstract {
	
	public void Lancio() {
		
		int x;
		Random r = new Random();
		x = r.nextInt(2);
		
		if (x == 0)
			System.out.println("Il risultato del lancio della moneta è testa");
		else
			System.out.println("Il risultato del lancio della moneta è croce");
	}
}
