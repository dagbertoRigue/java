import java.util.Locale;

public class ExpressoesAritmeticas {

	public static void main(String[] args) {
		System.out.println("Em programa��o, uma vari�vel � uma por��o de mem�ria (RAM) utilizada para armazenar \n"
				+ "dados durante a execu��o dos programas.");
		System.out.println("==========================================================================================");
		System.out.println();
		System.out.println("A declara��o de vari�veis tem a seguinte sintaxe : <tipo> <nome> = <valor inicial>;");
		
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Declarando uma vari�vel inteira : int x = 1247;");
		int x = 1247;
		System.out.print("x = ");
		System.out.println(x);
		
		System.out.println("Declarando uma vari�vel ponto flutuante: double y = 10.123456789;");
		double y = 10.123456789;
		System.out.print("y = ");
		System.out.println(y);
		System.out.print("Obs. Para limitar o n�mero de caracteres do double, use : '%.2f%n', nome da vari�vel : ");
		System.out.printf("%.2f%n", y);
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Para manter o double com o ponto e n�o alterar para v�rgula, utilize a lib Locale.");
		System.out.printf("%.2f%n", y);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", y);
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Express�es aritm�ticas.");
		System.out.println("Exemplo 1");
		int w, z;
		w = 5;
		z = 2 * w;
		System.out.println(w);
		System.out.println(z);
		
		System.out.println("Exemplo 2 - �rea do trap�zio");
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 *h;
		System.out.printf("�rea = %.2f %n", area);
	}

}
