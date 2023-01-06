package a10_padroes_strategy_02;

import java.math.BigDecimal;

public interface Imposto {

	public BigDecimal calcular(Orcamento orcamento);
}
