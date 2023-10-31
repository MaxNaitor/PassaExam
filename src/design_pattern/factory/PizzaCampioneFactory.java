package design_pattern.factory;

public class PizzaCampioneFactory extends PizzaFactory{

	public Pizza creaPizza(String nome) {
		if (nome.equalsIgnoreCase("margherita")) {
			return new PizzaMargherita();
		} else if (nome.equalsIgnoreCase("speciale")) {
			return new PizzaSpecialeCampione();
		}
		System.out.println("Non facciamo la pizza " + nome);
		return null;
	}
}
