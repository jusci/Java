
public class FuncoesString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG  ";
		String s1=original.toLowerCase();//converte caixa alta em miniscula
		String s2=original.toUpperCase();//converte caixa baixa em maiuscula
		String s3=original.trim();//elimina os espa�os nas extremidades
		String s4=original.substring(2);//imprimi a partir de uma determinada posi��o
		String s5=original.substring(2, 9);
		String s6=original.replace('a', 'x');
		String s7=original.replace("abc","xy");
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
				
		
//		System.out.println("Original: " +original);
//		System.out.println(s1  + "Exemplo uma conversa�o em minusculo");
//		System.out.println(s2  + "Exemplo uma conversa�o em maiusculo");
//		System.out.println(s3  +   "---");
//		System.out.println(s4);
//		System.out.println(s5);
//		System.out.println(s6);
//		System.out.println(s7);

	}

}
