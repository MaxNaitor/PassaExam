package design_pattern;

import design_pattern.observer.RilevatoreMeteo;
import design_pattern.strategy.AnatraDiPlastica;
import design_pattern.strategy.AnatraVera;

public class Main {

	public static void main(String[] args) {
//		strategyPattern();
		observerPattern();
	}

	public static void strategyPattern() {
		AnatraDiPlastica plastica = new AnatraDiPlastica();
		AnatraVera vera = new AnatraVera();

		plastica.nuota();
		vera.nuota();

		plastica.getComportamentoVolo().vola();
		vera.getComportamentoVolo().vola();
	}
	
	public static void observerPattern() {
		RilevatoreMeteo rilevatoreMeteo = new RilevatoreMeteo();
		rilevatoreMeteo.aggiornaMeteo("Nuvoloso");
		rilevatoreMeteo.aggiornaMeteo("Soleggiato");
	}
}
