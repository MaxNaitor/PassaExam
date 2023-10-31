package design_pattern.decorator;

public abstract class AutomobileSportiva extends Automobile {

	protected Automobile automobile;
	
	public AutomobileSportiva() {}

	public AutomobileSportiva(Automobile automobile) {
		super();
		this.automobile = automobile;
	}

	@Override
	public void guida() {
		automobile.guida();
		System.out.println("Velocità raggiunta: 250km/h");
	}

}
