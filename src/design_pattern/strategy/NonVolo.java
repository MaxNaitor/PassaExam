package design_pattern.strategy;

public class NonVolo implements ComportamentoVoloInterface {

	@Override
	public void vola() {
		System.out.println("non volo");
	}

}
