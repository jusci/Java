
public class Aula01 {
	
	
	public static void main(String[] args){
		
		/*String nome = "Juh";
		int idade = 26;
		char genero ='F';
		double salario = 5.000;
		boolean status = true;
		
		System.out.println ("Dados");
		System.out.println ("Nome:" +nome);
		System.out.println ("idade:" + idade);
		System.out.printf ("salario:%.3f%n",salario);
		System.out.println ("status:" + status);*/
		
		//contador();
		
		compra();
		
	}
	
	public static void contador() {
		
		int contador =0;
		
		while (contador<=100) {
			
			System.out.println(contador);
			contador++;
		
		}
		
		
	}
	
	public static void compra() {
		
		int qntd = 15;
		
		if (qntd< 12) {
			
			double valor =1.30;
			
			double total = qntd*valor;
			
			System.out.println("O valor da compra é R$"+total);
			
		}
		
		else {
			
            double valor =1.00;
			
			double total = qntd*valor;
			
			System.out.println("O valor da compra é R$"+total);
			
		}
				
		
	}

}
