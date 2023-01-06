package a10_padroes_strategy_02;

import java.math.BigDecimal;

public class ICMS implements Imposto {

	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.17"));
	}
}
