package design_pattern.observer;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class StazioneMeteoRoma implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Stazione di Roma: " + (String) arg);
	}

}
