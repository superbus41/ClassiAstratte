package esercitazioneClassiAstratte;

import java.util.Random;

public class DadoNonAbstract {
	
	public void Lancio() {
		Random r = new Random();
		System.out.println("Risultato del lancio del dado: " + (r.nextInt(6) + 1));
	}

}
