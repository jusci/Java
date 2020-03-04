package entities;

public class Conta {

	private int num_conta;
	private String nome;
	private double saldo;

	
	public Conta() {
		
	}
	

	public Conta(int num_conta, String nome) {

		this.num_conta = num_conta;
		this.nome = nome;

	}
	
	public Conta(int num_conta, String nome, double depositoInicial) {

		this.num_conta = num_conta;
		this.nome = nome;
		realizarDeposito(depositoInicial);

	}
	


	public int getNum_conta () {
		return num_conta;
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
    public double realizarDeposito(double deposito) {
		
		return saldo+=deposito;
	}
    
	public double realizarSaque(double saque) {
		
		return saldo-=saque+5.00;
	}
	

	
	public String toString() {
		return "Conta:"
			   + num_conta
			   +", Nome:"
			   + nome
			   + ", Saldo:R$"
			   + String.format("%.2f",saldo);
		
	   }
	}


