package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;

public class Programa2 {
	
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.println("Dados do Funcionario");
		System.out.print("Informe o nome do funcionario:");
		func.name = sc.nextLine();
		System.out.print("Informe o salario bruto:");
		func.salarioBruto=sc.nextDouble();
		System.out.print("Informe o valor do imposto:");
		func.imposto = sc.nextDouble();
		
		System.out.println ();
		System.out.println("Salario liquido:"+ func.salarioLiquido());
		System.out.println ();
		System.out.println ();
		System.out.println("Dados do funcionario: " + func);
		
		System.out.print("Informe a porcetangem do aumento:");
		double porcentagem = sc.nextDouble();
		func.aumentoSalario(porcentagem);
		System.out.print("Dados atualizados do funcionario: "+func);
		
		sc.close();
		
	}

}
