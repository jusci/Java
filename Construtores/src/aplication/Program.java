package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Entre com os dados do produto:");
		System.out.print("Nome:");
	    String nome = sc.nextLine();
		System.out.print("Informe o preço do produto:");
		double preco =sc.nextDouble();
		System.out.print("Informe a quantidade no estoque:");
		int quantidade = sc.nextInt();
		
		Product product = new Product(nome, preco, quantidade);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Entre com o numero de produtos para adicionar no estoque:");
		quantidade = sc.nextInt();
		product.adicionarProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + product);

		
		System.out.println();
		System.out.print("Entre com o numero de produtos a serem removidos no estoque:");
		quantidade = sc.nextInt();
		product.removerProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		
		//System.out.println (product.nome +"," + product.preco +","+product.quantidade);
		//System.out.println(product);
		sc.close();
		

	}

}

