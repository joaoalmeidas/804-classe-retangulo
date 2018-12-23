import java.util.Scanner;

public class RetanguloTeste {

	public static void main(String[] args) {
		
		Retangulo semArgumentos = new Retangulo();
		Retangulo comArgumentos = new Retangulo(8, 4);
		Retangulo argumentoForaDosLmites = new Retangulo(-1, 21);
		
		Scanner input  = new Scanner(System.in);
		
		double altura, largura;
		
		System.out.println("Ret�ngulos Teste:");
		
		System.out.printf("Constru��o ret�ngulo sem argumentos:\n�rea : %.1f\nPerimetro: %.1f\nLargura: %.1f\nAltura: %.1f\n\n", 
				semArgumentos.calculaArea(), semArgumentos.calculaPerimetro(), semArgumentos.getLargura(), 
				semArgumentos.getAltura());
		
		System.out.printf("Constru��o ret�ngulo com argumentos:\n�rea : %.1f\nPerimetro: %.1f\nLargura: %.1f\nAltura: %.1f\n\n", 
				comArgumentos.calculaArea(), comArgumentos.calculaPerimetro(), comArgumentos.getLargura(), 
				comArgumentos.getAltura());
		
		System.out.printf("Constru��o ret�ngulo com argumentos fora do limite:\n�rea : %.1f\nPerimetro: %.1f\nLargura: %.1f\nAltura: %.1f\n\n", 
				argumentoForaDosLmites.calculaArea(), argumentoForaDosLmites.calculaPerimetro(), argumentoForaDosLmites.getLargura(), 
				argumentoForaDosLmites.getAltura());
		
		System.out.printf("Insira a altura do ret�ngulo:");
		altura = input.nextDouble();
		
		System.out.printf("Insira a largura do ret�ngulo:");
		largura = input.nextDouble();
		
		Retangulo retanguloUsuario = new Retangulo(altura, largura);
		
		System.out.printf("Constru��o ret�ngulo com argumentos passados pelo usu�rio:\n�rea : %.1f\nPerimetro: %.1f\nLargura: %.1f\nAltura: %.1f\n\n", 
				retanguloUsuario.calculaArea(), retanguloUsuario.calculaPerimetro(), retanguloUsuario.getLargura(), 
				retanguloUsuario.getAltura());
		
	}

}
