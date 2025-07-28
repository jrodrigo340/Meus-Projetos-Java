public class TiposPrimitivos {
	public static void main(String[] args) {
		// Tipos Inteiros
		byte exemploByte = 120; //-128 a 127
		short exemploShort = 32000; //-32.768 a 32.767
		int exemploInt = 1_000_000; // Valor padrão para inteiros
		long exemploLong = 1_000_000_000L; //Precisa de L no final
		
		//Tipos de ponto flutuante
		float exemploFloat = 3.14f; //Precisa de f no final
		double exemploDouble = 3.1415926535; // Mais preciso que float
		
		//Tipo caractere
		char exemploChar = 'A'; //Sempre com aspas simples
		
		//Tipo booleano
		boolean exemploBoolean = true; //true ou false
		
		//Imprimindo os valores
		System.out.println("Exemplos de Tipos Primitivos em Java:");
		System.out.println("byte: " + exemploByte);
        System.out.println("short: " + exemploShort);
        System.out.println("int: " + exemploInt);
        System.out.println("long: " + exemploLong);
        System.out.println("float: " + exemploFloat);
        System.out.println("double: " + exemploDouble);
        System.out.println("char: " + exemploChar);
        System.out.println("boolean: " + exemploBoolean);
	}
}
