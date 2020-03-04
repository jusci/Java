package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		Retangulo retangulo = new Retangulo ();
		
		System.out.println("Informe a largura do triangulo:");
		retangulo.largura = sc.nextDouble();
		
		
		System.out.println("Informe a altura do triangulo:");
		retangulo.altura = sc.nextDouble();
		
		
		System.out.println("Dados do trinagulo "+retangulo);
	
		
		sc.close();
		

	}

}
