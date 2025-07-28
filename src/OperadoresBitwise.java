import java.util.Scanner;

public class OperadoresBitwise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro (a): ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro (b): ");
        int b = scanner.nextInt();

        System.out.println("\nValores em binário:");
        System.out.println("a = " + a + " (bin: " + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (bin: " + Integer.toBinaryString(b) + ")\n");

        System.out.println("a & b = " + (a & b) + " (bin: " + Integer.toBinaryString(a & b) + ")");
        System.out.println("a | b = " + (a | b) + " (bin: " + Integer.toBinaryString(a | b) + ")");
        System.out.println("a ^ b = " + (a ^ b) + " (bin: " + Integer.toBinaryString(a ^ b) + ")");
        System.out.println("~a = " + (~a) + " (bin: " + Integer.toBinaryString(~a) + ")");
        System.out.println("a << 1 = " + (a << 1) + " (bin: " + Integer.toBinaryString(a << 1) + ")");
        System.out.println("a >> 1 = " + (a >> 1) + " (bin: " + Integer.toBinaryString(a >> 1) + ")");

        scanner.close();
    }
}
