package design_pattern.observer;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class StazioneMeteoMilano implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Stazione di Milano: " + (String) arg);
	}
}
