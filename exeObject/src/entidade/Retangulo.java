package entidade;

public class Retangulo {
	
	public double largura;
	public double altura;
	
	
	public double area() {
		return largura * altura;
		
	}
	
	public double perimetro () {
		return 2 *(largura + altura);
	}
	
	public double diagonal () {
		return Math.sqrt(largura * largura + altura *altura);
	}
	
	public String toString() {
		
		return String.format("Area: %.2f", area())
			 + String.format(", Perimetro: %.2f", perimetro())
			 + String.format(", Diagonal: %.2f", diagonal());
	}

}
