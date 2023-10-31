package design_pattern.decorator;

public abstract class AutomobileUtilitaria extends Automobile {

	protected Automobile automobile;
	
	public AutomobileUtilitaria() {}

	public AutomobileUtilitaria(Automobile automobile) {
		super();
		this.automobile = automobile;
	}

	@Override
	public void guida() {
		automobile.guida();
		System.out.println("Velocità raggiunta: 130km/h");
	}

}
