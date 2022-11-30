import java.util.Locale;
import java.util.Scanner;

public class OperadoresAtribuicaoCumulativa {

	public static void main(String[] args) {
		System.out.println("Os operadores de atribuição cumulativa são muito usados em expressões matemáticas para escrever de forma mais curta uma operação.");
		System.out.println("    ------------------------------");
		System.out.println("	a += b;   |   a = a + b;");
		System.out.println("	a -= b;   |   a = a - b;");
		System.out.println("	a *= b;   |   a = a * b;");
		System.out.println("	a /= b;   |   a = a / b;");
		System.out.println("	a %= b;   |   a = a % b;");
		System.out.println("    -----------------------------");
		
		System.out.println("Exemplo : Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone. Cada minuto que exceder a\n"
				+ "franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.\n");
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite total de minutos consumidos :");
		int minutos = sc.nextInt();
		double conta = 50.0;
		
		if (minutos > 100) {
			/*conta = conta +(minutos - 100) * 2.0;*/
			conta += (minutos - 100) * 2.0;
		}
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		sc.close();
	}

}
