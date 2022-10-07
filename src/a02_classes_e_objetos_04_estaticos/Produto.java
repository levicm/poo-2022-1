package a02_classes_e_objetos_04_estaticos;

public class Produto {
	static private int qtdTotal = 0;
	
	private String nome;
	private double preco;
	private int qtd;
	
	public static int getQtdTotal() {
		return qtdTotal;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public Produto(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
		qtdTotal += qtd;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		qtdTotal -= this.qtd;
		qtdTotal += qtd;

		this.qtd = qtd;
	}
	
	public void adicionaProdutos(int qtd) {
		this.qtd += qtd;
		qtdTotal += qtd;
	}
	
	public void removeProdutos(int qtd) {
		this.qtd -= qtd;
		qtdTotal -= qtd;
	}
	
	@Override
	public String toString() {
		return nome + ", $" + preco + ", QTD: " + qtd + ", Total: $" + (preco * qtd);
	}

}
