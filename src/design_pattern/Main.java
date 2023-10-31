package design_pattern;

import design_pattern.factory.Pizza;
import design_pattern.factory.PizzaCampioneFactory;
import design_pattern.factory.PizzaFactory;
import design_pattern.factory.Pizzeria;
import design_pattern.observer.RilevatoreMeteo;
import design_pattern.singleton.SingletonObject;
import design_pattern.strategy.AnatraDiPlastica;
import design_pattern.strategy.AnatraVera;

public class Main {

	public static void main(String[] args) {
		singletonPattern();
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
	
	public static void factoryPattern() {
		Pizzeria laLanterna = new Pizzeria(new PizzaFactory());
		Pizzeria ilCampione = new Pizzeria(new PizzaCampioneFactory());
		
		Pizza margheritaLanterna = laLanterna.ordinaPizza("margherita");
		Pizza margheritaCampione = ilCampione.ordinaPizza("margherita");
		
		margheritaLanterna.mangia();
		margheritaCampione.mangia();
		
		Pizza specialeLanterna = laLanterna.ordinaPizza("speciale");
		Pizza specialeCampione = ilCampione.ordinaPizza("speciale");
		
		specialeCampione.mangia();
	}
	
	public static void singletonPattern(){
		SingletonObject singleton = SingletonObject.getInstance();
		singleton = SingletonObject.getInstance();
	}
}
