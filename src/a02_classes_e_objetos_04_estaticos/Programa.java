package a02_classes_e_objetos_04_estaticos;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Total: " + Produto.getQtdTotal());
		
		System.out.println("Entre com o nome do produto: ");
		String nome = sc.next();
		System.out.println("Entre com o preço do produto: ");
		double preco = sc.nextDouble();
		System.out.println("Entre com a quantidade em estoque do produto: ");
		int qtd = sc.nextInt();

		Produto prod = new Produto(nome, preco, qtd);
		System.out.println("Dados do produto: "+ prod);
		System.out.println("Total: " + Produto.getQtdTotal());
		
		System.out.println("Entre com o nome do produto: ");
		String nome2 = sc.next();
		System.out.println("Entre com o preço do produto: ");
		double preco2 = sc.nextDouble();
		System.out.println("Entre com a quantidade em estoque do produto: ");
		int qtd2 = sc.nextInt();

		Produto prod2 = new Produto(nome2, preco2, qtd2);
		System.out.println("Dados do produto: "+ prod2);
		System.out.println("Total: " + Produto.getQtdTotal());

		System.out.println("Entre com a quantidade de produtos a ser adicionada ao estoque: ");
		prod.adicionaProdutos(sc.nextInt());

		System.out.println("Dados atualizados: "+ prod);
		System.out.println("Total: " + Produto.getQtdTotal());

		System.out.println("Entre com a quantidade de produtos a ser removida ao estoque: ");
		prod.removeProdutos(sc.nextInt());

		System.out.println("Dados atualizados: "+ prod);
		System.out.println("Total: " + Produto.getQtdTotal());
		sc.close();
	}

}
