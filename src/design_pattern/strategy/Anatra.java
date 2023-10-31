package design_pattern.strategy;

public class Anatra {

	private ComportamentoVoloInterface comportamentoVolo;

	public void nuota() {
		System.out.println("Sono un'anatra qualsiasi e so galleggiare e nuotare");
	}

	public ComportamentoVoloInterface getComportamentoVolo() {
		return comportamentoVolo;
	}

	public void setComportamentoVolo(ComportamentoVoloInterface comportamentoVolo) {
		this.comportamentoVolo = comportamentoVolo;
	}

}
