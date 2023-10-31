package design_pattern.observer;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class RilevatoreMeteo extends Observable{
	
	private String meteo;

	public RilevatoreMeteo() {
		addObserver(new StazioneMeteoRoma());
		addObserver(new StazioneMeteoMilano());
	}
	
	public void aggiornaMeteo(String meteo) {
		this.meteo = meteo;
		setChanged();
		notifyObservers(meteo);
	}
}
