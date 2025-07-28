import java.util.Scanner;

public class EstruturaCondicional_P2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Informe um número de 1 até 7: ");
        var option = scanner.nextInt();

        var message = switch (option){
            case 1, 7  -> {
                var day = option == 1 ? "Domingo" : "Sábado";
                yield String.format("Hoje é %s, fim de semana :D", day);
            }
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Opções inválidas";
        };
        System.out.println(message);
    }    
}
