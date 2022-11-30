import java.util.Scanner;

public class EstruturaRepetitivaWhile {

	public static void main(String[] args) {
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("While - estrutura repetitiva de controle que repete um bloco de comandos enquanto uma condição for verdadeira.");
		System.out.println("Quando usar : quando não se sabe previamente a quantidade de repetições que será realizada.\n");
		
		System.out.println("Exemplo.");
		System.out.println("Adivinhe qual número encerra o programa :");
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		while(x != 0) {
			System.out.println("Tente novamente...");
			x = sc.nextInt();			
		}
		System.out.println("Você acertou !");
		
		sc.close();
	}

}
