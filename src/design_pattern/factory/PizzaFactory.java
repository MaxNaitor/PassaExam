package design_pattern.factory;

public class PizzaFactory {
	public Pizza creaPizza(String nome) {
		if (nome.equalsIgnoreCase("margherita")) {
			return new PizzaMargherita();
		}
		System.out.println("Non facciamo la pizza " + nome);
		return null;
	}
}
