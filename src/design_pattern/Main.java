package design_pattern;

import design_pattern.decorator.AutomobileSportiva;
import design_pattern.decorator.AutomobileUtilitaria;
import design_pattern.decorator.CHR;
import design_pattern.decorator.Ferrari;
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
		decoratorPattern();
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
	
	public static void decoratorPattern() {
		AutomobileSportiva ferrari = new AutomobileSportiva(new Ferrari()) {
		};
		AutomobileUtilitaria chr = new AutomobileUtilitaria(new CHR()) {
		}; 
		
		ferrari.guida();
		chr.guida();
	}
}
