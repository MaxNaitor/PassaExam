package design_pattern.strategy;

public class AnatraVera extends Anatra {

	public AnatraVera() {
		this.setComportamentoVolo(new VoloConAli());
	}
}
