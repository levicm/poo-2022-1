package a10_padroes_strategy_02;

import java.math.BigDecimal;

public class CalculadoraImpostos {

	private Orcamento orcamento;

	public CalculadoraImpostos(Orcamento orcamento) {
		this.orcamento = orcamento;
	}

	public BigDecimal calcular(Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}
