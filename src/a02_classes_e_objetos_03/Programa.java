package a02_classes_e_objetos_03;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome do produto: ");
		String nome = sc.next();
		System.out.println("Entre com o preço do produto: ");
		double preco = sc.nextDouble();
		System.out.println("Entre com a quantidade em estoque do produto: ");
		int qtd = sc.nextInt();

		Produto prod = new Produto(nome, preco, qtd);
		System.out.println("Dados do produto: "+ prod);
		
		System.out.println("Entre com a quantidade de produtos a ser adicionada ao estoque: ");
		prod.adicionaProdutos(sc.nextInt());

		System.out.println("Dados atualizados: "+ prod);

		System.out.println("Entre com a quantidade de produtos a ser removida ao estoque: ");
		prod.removeProdutos(sc.nextInt());

		System.out.println("Dados atualizados: "+ prod);
		sc.close();
	}

}
