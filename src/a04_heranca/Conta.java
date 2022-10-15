package a04_heranca;

public abstract class Conta {
	private int numero;
	private String titular;
	protected Double saldo;

	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0.0;
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void saque(Double valor) {
		saldo = saldo - valor;
	}

	public void deposito(Double valor) {
		saldo = saldo + valor;
	}
	
	public abstract void encerrar();
	
	@Override
	public String toString() {
		return numero + " - " + titular + " R$ " + saldo;
	}
}
