import java.util.Scanner;

public class EstruturaCondicional_P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Informe seu nome: ");
    var name = scanner.next();
    System.out.print("Informe sua idade: ");
    int age = scanner.nextInt();
    System.out.print("Você é emancipado? (s/n): ");
    var isEmancipated = scanner.next().equalsIgnoreCase("s");

    var canDrive = (age >=18) || (age >= 16 && isEmancipated);
    var message = canDrive ?
            name + ", você pode dirigir! \n":
            name + ", você não pode dirigir";

    System.out.println(message);
    System.out.println("Fim da execusão");

    }
}
