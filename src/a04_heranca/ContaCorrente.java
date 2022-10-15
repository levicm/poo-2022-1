package a04_heranca;

public class ContaCorrente extends Conta {

	private Double limiteEspecial;
	
	public ContaCorrente(int numero, String titular) {
		super(numero, titular);
		this.limiteEspecial = 0.0;
	}

	public ContaCorrente(int numero, String titular, Double limiteEspecial) {
		super(numero, titular);
		this.limiteEspecial = limiteEspecial;
	}
	
	public Double getLimiteEspecial() {
		return limiteEspecial;
	}
	
	public void setLimiteEspecial(Double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	
	@Override
	public final void saque(Double valor) {
		// Saque do valor solicitado
		super.saque(valor);
		// Mais o saque da taxa
		super.saque(5.0);
	}

	@Override
	public void encerrar() {
		// TODO Auto-generated method stub
		
	}
}
