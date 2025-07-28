import java.util.Scanner;

public class OperadoresAtribuicaoLogicos {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in); 
		
		//Exemplo 1:
		System.out.print("Quanto é 2 + 2?");
		int result = scanner.nextInt();
		boolean isRight = result == 4;
		System.out.printf("O resultado é 4, você acertou?(%s) \n", isRight);
		
		//Exemplo 2:
		System.out.println("Quantos anos você tem?");
		var age = scanner.nextInt();
		System.out.println("Você é emancipado(True ou False)?");
		var isEmancipated = scanner.nextBoolean();
		var canDrive = age >= 18 || (isEmancipated && age >= 16);
		System.out.printf("Você pode dirigir? (%s) \n", canDrive);
		
		//Exemplo 3:
		System.out.printf("true  && true = %s \n", true && true);
		System.out.printf("false && false = %s \n", false && false);
		System.out.printf("true  && false = %s \n", true && false);
		System.out.printf("false && true = %s \n", false && true);
		System.out.printf("======================================= \n");
		System.out.printf("true  || true = %s \n", true || true);
		System.out.printf("false || false = %s \n", false || false);
		System.out.printf("true  || false = %s \n", true || false);
		System.out.printf("false || true = %s \n", false || true);
		System.out.printf("======================================= \n");
		System.out.printf("!true = %s \n", !true);
		System.out.printf("!false = %s \n", !false);
		
		scanner.close();
	}

}
