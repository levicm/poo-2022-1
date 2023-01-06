package a10_padroes_strategy_01;

import java.math.BigDecimal;

public class Programa {

	public static void main(String[] args) {
		Orcamento orcamento1 = new Orcamento(new BigDecimal("100"));
		CalculadoraImpostos calc1 = new CalculadoraImpostos(orcamento1);
		System.out.println(calc1.calcular(TipoImposto.ICMS));
		System.out.println(calc1.calcular(TipoImposto.ISS));
		
		Orcamento orcamento2 = new Orcamento(new BigDecimal("400"));
		CalculadoraImpostos calc2 = new CalculadoraImpostos(orcamento2);
		System.out.println(calc2.calcular(TipoImposto.ICMS));
		System.out.println(calc2.calcular(TipoImposto.ISS));
	}

}
