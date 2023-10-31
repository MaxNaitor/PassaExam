package design_pattern.strategy;

public class AnatraDiPlastica extends Anatra{

	public AnatraDiPlastica() {
		this.setComportamentoVolo(new NonVolo());
	}

}
