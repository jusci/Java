package entities;

public class Product {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Product () {
		// construtor padr�o
	}
	
	
	public Product (String nome, double preco, int quantidade) { // construtor com 3 parametros 
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;	
	}
	
	
	public Product (String nome, double preco) { // sobrecarga construtor
		this.nome = nome;
		this.preco = preco;
	}
	
	
	public String getNome() { // recupera o valor informado
		return nome;
	}
	
	public void setNome( String nome) { // insere valor ao atributo do objeto 
		this.nome = nome;
	}
	
	
	public double getPreco() {
		return preco;
		
	}
	
    public void setPreco(double preco) { 
	 
	 this.preco= preco;
 }
	public int getQuantidade() {
		return quantidade;
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

