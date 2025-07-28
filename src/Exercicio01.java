import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in); 
		
		System.out.print("Qual o seu nome?: ");
		String nome = scanner.nextLine();
		System.out.print("Qual a seu ano de nascimento?: ");
		var idade = scanner.nextInt();
		System.out.printf("Seja bem-vindo, %s, você tem %s anos.\n", nome, 2025 - idade);

	}

}
