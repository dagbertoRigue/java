import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitivaDoWhile {

	public static void main(String[] args) {
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("Do While - Menos utilizada, mas em alguns casos se encaixa melhor ao problema. \n");
		System.out.println("O bloco de comandos executa pelo menos uma vez, pois a condição é\n"
				+ "verificada no final.");		
		
		System.out.println("Sintaxe : \n do { \n"
				+ "comando 1 \n"
				+ "comando 2 \n"
				+ "} while (condição);");
		
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("Exemplo : Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em\n"
				+ "Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite \"s\", repetir o programa. \n");
		System.out.println("F = 9C + 32");
		System.out.println("    -");
		System.out.println("    5 \n");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char setup;
		
		do {
			System.out.println("Digite o valor em graus Ceusius para converter em graus Fahrenheit :");
			double celsius = sc.nextDouble();
			double farhenheit = 9.0 / 5.0 * celsius + 32.0;
			System.out.printf("%.1f graus Celsius é equivalente à %.1f graus Fahreinheit %n",celsius, farhenheit);
			System.out.println("Deseja repetir a operação (s/n) ? ");
			setup = sc.next().charAt(0);
		} while(setup != 'n');
		
		sc.close();
	}

}
