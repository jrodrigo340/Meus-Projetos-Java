import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o seu nome?: ");
        String Snome = scanner.nextLine();

        System.out.printf("Qual a sua idade %s?: ", Snome);
        int Sidade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Qual o nome do seu amigo?: ");
        String Anome = scanner.nextLine();

        System.out.printf("Qual a idade de %s?: ", Anome);
        int Aidade = scanner.nextInt();

        int diferenca = Math.abs(Sidade - Aidade);

        System.out.printf("%s tem %d anos\n", Snome, Sidade);
        System.out.printf("%s tem %d anos\n", Anome, Aidade);
        System.out.printf("A diferença de idade entre %s e %s é de %d anos.\n", Snome, Anome, diferenca);

        scanner.close();
    }
}