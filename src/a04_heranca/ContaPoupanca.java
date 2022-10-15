package a04_heranca;

public final class ContaPoupanca extends Conta {

	private double taxaCorrecao;
	
	public ContaPoupanca(int numero, String titular, double taxaCorrecao) {
		super(numero, titular);
		this.taxaCorrecao = taxaCorrecao;
	}
	
	public double getTaxaCorrecao() {
		return taxaCorrecao;
	}
	
	public void setTaxaCorrecao(double taxaCorrecao) {
		this.taxaCorrecao = taxaCorrecao;
	}

	@Override
	public void encerrar() {
		// TODO Auto-generated method stub
	}
}
