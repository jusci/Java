import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * String product1 = "Computer"; String product2 = "Office desk";
		 * 
		 * int age = 30; int code = 5290; char gender = 'F';
		 * 
		 * 
		 * double price1 = 2100.0; double price = 650.50; double measure = 53.234567;
		 * 
		 * 
		 * System.out.println("Products:");
		 * System.out.printf("%s, which price is $%.2f%n",product1,price1);
		 * Locale.setDefault(Locale.US);
		 * 
		 * System.out.printf("Record: %d years old, code %d and gender: %c%n",
		 * age,code,gender);
		 * 
		 * System.out.printf("Measue with eigth decimal places:%.8f%n",measure);
		 * 
		 * System.out.printf("Rouded (three decimal places):%.3f%n",measure);
		 * System.out.printf("US decimal point:%.3f%n",measure);
		 */

		Scanner sc = new Scanner(System.in);// string

		String x;
		int y;
		double z;
		char c;
		String frase;
		

		/*System.out.println("Digite uma string:");
		x = sc.next();
		System.out.println("Vc digitou:" + x);

		System.out.println("Digite um inteiro:");
		y = sc.nextInt();
		System.out.println("Vc digitou:" + y);

		System.out.println("Digite um double:");
		z = sc.nextDouble();
		System.out.println("Vc digitou:" + z);

		System.out.println("Digite um char:");
		c = sc.next().charAt(0);//pega o primeiro caractere da sua string
		System.out.println("Vc digitou:" + c);*/
		
		System.out.println("Digite uma frase:");
		frase=sc.nextLine();
		System.out.println("isso foi exemplo de uma quebra pendente");

		sc.close();

	}

}
