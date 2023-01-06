package a10_padroes_strategy_01;

import java.math.BigDecimal;

public class CalculadoraImpostos {

	private Orcamento orcamento;

	public CalculadoraImpostos(Orcamento orcamento) {
		this.orcamento = orcamento;
	}

	public BigDecimal calcular(TipoImposto tipo) {
		// Lógica
		if (tipo == TipoImposto.ICMS) {
			return orcamento.getValor().multiply(new BigDecimal("0.17"));
		} else if (tipo == TipoImposto.ISS) {
			return orcamento.getValor().multiply(new BigDecimal("0.06"));
		} else {
			return BigDecimal.ZERO;
		}
	}

}
