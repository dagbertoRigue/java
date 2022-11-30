import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {
		System.out.println("Funções\n\n"
				+ "As funções representam um processamento que possui um significado :\n"
				+ "• Math.sqrt(double) \n"
				+ "• System.out.println(string) \n\n"
				+ "Principais vantagens: modularização, delegação e reaproveitamento \n\n"
				+ "Dados de entrada e saída :\n"
				+ "• Funções podem receber dados de entrada (parâmetros ou argumentos); \n"
				+ "• Funções podem ou não retornar uma saída; \n"
				+ "• Em orientação a objetos, funções em classes recebem o nome de \"métodos\". \n");
		System.out.println("-------------------------------------------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("DIgite três números :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int higher = max(a, b, c);
		
		showResult(higher);
		sc.close();
	}
	public static int max(int x, int y, int z) {
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		} 
		else if (y > z) {
			aux = y;
		} 
		else {
			aux = z;
		}
		return aux;
	}
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
		
	}

}
