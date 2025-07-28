import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual o tamanho da base do rentangulo?: ");
		float base = scanner.nextFloat();
		System.out.print("Qual a altura do retangulo?: ");
		float altura = scanner.nextFloat();
		float area = base * altura;
		System.out.printf("O tamanho da é: %s", area);
	}
}
