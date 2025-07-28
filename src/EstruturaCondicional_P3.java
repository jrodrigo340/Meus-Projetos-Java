public class EstruturaCondicional_P3 {
    public static void main(String[] args) {
        
        //1.For Simples de 1 a 5:
        System.out.println("---Exemplo 01---");
        for (int i = 1; i <= 5; i++){
            System.out.println("Número: " + i);
        }
    
        //2. Contagrm Regressiva:
        System.out.println("---Exemplo 02---");
        for (int i = 5; i >=1; i--) {
            System.out.println("Contagem: " + i);
        }

        //3. Percorrendo um array:
        System.out.println("---Exemplo 03---");
        String[] names = {"Ana", "Bruno", "Carlos"};
        for (int i = 0; i < names.length; i++){
            System.out.println("Nome: " + names[i]);
        }
        
        //4. Usando for-each (mais simples para arrays)
        System.out.println("---Exemplo 04---");
        int[] numbers = {10, 20, 30, 40};
        for (int num : numbers){
            System.out.println("Número: " + num);
        }

        //5. For com incremento diferente
        System.out.println("---Exemplo 05---");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Par: " + i);
        }


    }
}
