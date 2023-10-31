package design_pattern.singleton;

public class SingletonObject {
	
	private static SingletonObject instance = null;

	private SingletonObject() {
		
	}
	
	public static SingletonObject getInstance() {
		if (instance == null) {
			System.out.println("Creo l'oggetto");
			instance = new SingletonObject();
		}
		System.out.println("Ritorno l'oggetto già creato");
		return instance;
	}
}
