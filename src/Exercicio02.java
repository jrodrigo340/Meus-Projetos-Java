import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual o tamanho do primeiro lado?: ");
		var lado1 = scanner.nextInt();
		System.out.print("Qual o tamanho do segundo lado?: ");
		var lado2 = scanner.nextInt();
		var area = lado1 * lado2;
		System.out.printf("A soma de ambos os lados da %s \n", area);
	}
}
