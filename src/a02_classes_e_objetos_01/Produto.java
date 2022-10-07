package a02_classes_e_objetos_01;

public class Produto {
	private String nome;
	private double preco;
	private int qtd;
	
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
		this.qtd = qtd;
	}
	
	public void adicionaProdutos(int qtd) {
		this.qtd += qtd;
	}
	
	public void removeProdutos(int qtd) {
		this.qtd -= qtd;
	}
	
	@Override
	public String toString() {
		return nome + ", $" + preco + ", QTD: " + qtd + ", Total: $" + (preco * qtd);
	}

}
