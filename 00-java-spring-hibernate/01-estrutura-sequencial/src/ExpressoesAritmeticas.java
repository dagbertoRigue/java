import java.util.Locale;

public class ExpressoesAritmeticas {

	public static void main(String[] args) {
		System.out.println("Em programação, uma variável é uma porção de memória (RAM) utilizada para armazenar \n"
				+ "dados durante a execução dos programas.");
		System.out.println("==========================================================================================");
		System.out.println();
		System.out.println("A declaração de variáveis tem a seguinte sintaxe : <tipo> <nome> = <valor inicial>;");
		
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Declarando uma variável inteira : int x = 1247;");
		int x = 1247;
		System.out.print("x = ");
		System.out.println(x);
		
		System.out.println("Declarando uma variável ponto flutuante: double y = 10.123456789;");
		double y = 10.123456789;
		System.out.print("y = ");
		System.out.println(y);
		System.out.print("Obs. Para limitar o número de caracteres do double, use : '%.2f%n', nome da variável : ");
		System.out.printf("%.2f%n", y);
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Para manter o double com o ponto e não alterar para vírgula, utilize a lib Locale.");
		System.out.printf("%.2f%n", y);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", y);
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Expressões aritméticas.");
		System.out.println("Exemplo 1");
		int w, z;
		w = 5;
		z = 2 * w;
		System.out.println(w);
		System.out.println(z);
		
		System.out.println("Exemplo 2 - Área do trapézio");
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 *h;
		System.out.printf("Área = %.2f %n", area);
	}

}
