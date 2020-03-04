package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Aluno;

public class Programa3 {

	public static void main ( String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println ("Dados do aluno");
		System.out.print("Informe o nome do Aluno: ");
		aluno.nome = sc.nextLine();
		System.out.println("Informe as notas do aluno:");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
	
		
	System.out.printf("Media Final %.2f%n", aluno.calcularMedia());	
		
	  if(aluno.calcularMedia() < 60.00) {
		  System.out.println("Reprovado");
		  System.out.printf("Faltam %.2f Pontos%n" , aluno.contagemPontos());
	  }
	  
	  else {
		  System.out.println("Aprovado");
	  }
		
		sc.close();	
	}
}
