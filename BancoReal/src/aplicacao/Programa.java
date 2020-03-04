package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;



public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.println("Banco Financeiro");
		System.out.println("Entre com os dados para o cadastro");
		System.out.print("Informe o n�mero da conta:");
		int num_conta = sc.nextInt();
		System.out.print("Informe o nome do titular da conta:");
		sc.nextLine();
		String nome = sc.nextLine();
		
		
		
		
		System.out.print("Deseja realizar um deposito?(y/n)");
		char opcao = sc.next().charAt(0);
		
		if (opcao == 'y') {
			
			System.out.println("Informe o valor do deposito inicial:");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(num_conta, nome, depositoInicial);		
	}	
	
		else {
			conta = new Conta(num_conta, nome);// sobrecarga
			
		}
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta.toString());
		System.out.println();
		
		System.out.println("Informe o valor do deposito");
		double deposito = sc.nextDouble();
		conta.realizarDeposito(deposito);
		System.out.println("Dados da conta atualizado:");
		System.out.println(conta.toString());
		System.out.println();
		
		
		
		System.out.println("Informe o valor do saque:");
		double saque = sc.nextDouble();
		conta.realizarSaque(saque);
		System.out.println("Dados da conta atualizado:");
		System.out.println(conta.toString());
		System.out.println();
		
		
		
		
		sc.close();
		
	}

}
