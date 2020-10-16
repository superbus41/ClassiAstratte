package esercitazioneClassiAstratte;

public class Main {

	public static void main(String[] args) {
		
		OggettoTridimensionale cilindro = new Cilindro(10, 5),
				parallelepipedo = new Parallelepipedo(12, 8);
		
		Giochi dado = new Dado(),
				moneta = new Moneta();
		
		DadoNonAbstract dna = new DadoNonAbstract();
		MonetaNonAbstract mna = new  MonetaNonAbstract();
		
		cilindro.stampaVolume();
		parallelepipedo.stampaVolume();
		dado.Lancio();
		moneta.Lancio();
		dna.Lancio();
		mna.Lancio();
	}

}
