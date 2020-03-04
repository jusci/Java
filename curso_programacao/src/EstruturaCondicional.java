import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		int cod_prod, qtd;
		double valor;
		
		
	
		System.out.println("Informe o codigo do produto");
		  cod_prod= sc.nextInt();
		  
		  System.out.println("Informe a quantidade do produto");
		  qtd = sc.nextInt();
		  
		
	     if (cod_prod == 1) {
	    	 
	    	 valor = qtd*4.00;
	    	 System.out.println("O valor da compra é R$" + valor);
	    	 
	     }
	     
	     else if (cod_prod == 2) {
	    	   valor = qtd*4.50;
	    	   System.out.println("O valor da compra é R$" + valor);
	       }
	    	 
	    else if (cod_prod == 3) {
		    	   valor = qtd*5.00;
		    	   System.out.println("O valor da compra é R$" + valor);
		   } 
	    	 
	    else if (cod_prod == 4) {
		    	   valor = qtd*2.00;
		    	   System.out.println("O valor da compra é R$" + valor);
		    } 
		    
		    else {
		    	valor = qtd*1.50;
		    	System.out.println("O valor da compra é R$" + valor);
		    }
	     
	
	
			sc.close();
			
		}

}
