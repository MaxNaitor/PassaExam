package design_pattern.factory;

public class Pizzeria {

	PizzaFactory factory = new PizzaFactory();

	public Pizzeria(PizzaFactory factory) {
		super();
		this.factory = factory;
	}
	
	public Pizza ordinaPizza(String nome) {
		return factory.creaPizza(nome);
	}

}
