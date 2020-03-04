package entidade;

public class Aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	public double calcularMedia() {
		
		return nota1 + nota2 + nota3;
	}
	
	public double contagemPontos(){
		
		if (calcularMedia() < 60.0) {
			 
			return 60.0 - calcularMedia();	
			
		}
		
		else {
			
			return 0.0;
		}
		
		
	}
	
	 

}
