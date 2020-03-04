
public class Caminhao {
	private char tipoc;
	
	public char getTipoc() {
		return this.tipoc;
	}
	
	public void setTipoc(char tipoc) {
		this.tipoc = tipoc;
	}

	public void tipoCaminhao(){
		
		switch (tipoc) {
		   
		   case '1':
			   
			   System.out.println("toco");
		   
		   break;
		       
		   case '2':
			   
			   System.out.println("truck");
			   
		   break;
			   
		   case '3':
			   System.out.println("carreta");
		   break;
			   
		   case '4':
			   System.out.println("Bitrem");
		   break;
			   
		   case 'r':
			   System.out.println("Carga");
		   break;
		   
		   default:
			   System.out.println ("Não existe este tipo de caminhão");
			break;  
		   }
		
		
	}
	
	
	
}
