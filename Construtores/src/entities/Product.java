package entities;

public class Product {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	
	public Product (String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;	
	}
	
	public double totalValorNoEstoque() {
		
		return preco * quantidade;
		
	}
	
	public void adicionarProduto(int quantidade) {
		
		this.quantidade += quantidade;
		
	}
	
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
		
	}
	
	public String toString() {
		return nome
				+ ", R$"
				+ String.format("%.2f", preco)
				+ ", "
				+ quantidade
				+ " units,Total:$ "
				+ String.format("%.2f", totalValorNoEstoque());
	}

}

