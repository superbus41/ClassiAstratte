package esercitazioneClassiAstratte;

public abstract class OggettoTridimensionale {
	
	float areaDiBase, altezza;
	
	public OggettoTridimensionale(float areaDiBase, float altezza) {
		this.areaDiBase = areaDiBase;
		this.altezza = altezza;
	}

	public float calcolaVolume() {
		return areaDiBase * altezza;
	};
	
	public void stampaVolume() {
		System.out.println("Volume dell'oggetto: " + calcolaVolume());
	}
}
