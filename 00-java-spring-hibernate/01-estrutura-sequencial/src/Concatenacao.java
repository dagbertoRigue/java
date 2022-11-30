import java.util.Locale;

public class Concatenacao {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Para concatenar vários elementos em um mesmo comando de escrita :");
		double x = 10.123456789;
		System.out.println("Resultado = " + x + " metros");
		
		System.out.println();
		System.out.println("Existe um marcador para cada tipo de variável :");
		System.out.println("%f = ponto flutuante");
		System.out.println("%d = inteiro");
		System.out.println("%s = texto");
		System.out.println("%n = quebra de linha");
		System.out.println();
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.1f reais %n", nome, idade, renda);
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.printf("Exemplos %n%n");
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.0;
		double measure = 53.23456789;
		
		System.out.println("Products :");
		System.out.printf("%s, which price is $%.1f %n", product1, price1);
		System.out.printf("%s, which price is $%.1f %n%n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %c %n%n", age, code, gender);
		System.out.printf("Products :%n");
		System.out.printf("Measure with eight decimal places : %f %n", measure);
		System.out.printf("Rouded (three decimal places) : %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point : %.3f%n", measure);
	}

}
