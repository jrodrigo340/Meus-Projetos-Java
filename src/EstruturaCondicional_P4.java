public class EstruturaCondicional_P4 {
    public static void main(String[] args) {
        
        //while (repete enquanto a condição for verdadeira)
        int count = 1;

        while (count <= 5) {
            System.out.println("Contador: " + count);
            count++;
        }

        //do while (executa pelo menos uma vez, mesmo que a condição seja falsa)
        int num = 6;
        do {
            System.out.println("Número atual: " + num);
            num++;
        } while (num <= 5);

        /*OBS:Se numero começar maior que o valor da condição (6 > 5), o loop só roda uma vez. 
        Isso é o comportamento padrão do do while: ele garante uma execução, mesmo com a condição falsa logo no início.
        */
    }
}
