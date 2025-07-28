import java.util.Scanner;

public class OperadoresAritmeticos {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double numero1 = scanner.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double numero2 = scanner.nextDouble();
		
		double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
		
        double divisao = (numero2 != 0) ? (numero1 / numero2) : Double.NaN;
        
        System.out.println("\nResultados:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);

        if (numero2 != 0) {
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("Divisão: Erro - divisão por zero!");
        }

        scanner.close();
	}

}
