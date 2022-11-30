import java.util.Scanner;

public class EstruturaRepetitivaFor {

	public static void main(String[] args) {
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("For - estrutura repetitiva de controle que repete um bloco de comandos para um certo intervalo de valores.");
		System.out.println("Quando usar : quando se sabe previamente a quantidade de repetições, ou o intervalo de valores.\n");		
		
		System.out.println("Sintaxe : \n for (início; condição; incremento) { \n"
				+ "comando 1 \n"
				+ "comando 2 \n"
				+ "}");
		System.out.println("O início executa apenas uma vez. A condição, se verdadeira executa e volta. Se for falsa, pula fora. "
				+ "O incremento executa toda vez depois de voltar. \n");
		
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("Exemplo 1 : Implementando um contador progressivo. \n");
		
		for (int i=0; i<5; i++) {
			System.out.println("Valor de i : " + i);
		}

		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("Exemplo 2 : Implementando um contador regressivo. \n");
		
		for (int i=4; i>=0; i--) {
			System.out.println("Valor de i : " + i);
		}
		
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("Exemplo 3 : Fazer um programa que lê um valor inteiro N e depois N números inteiros. \n"
				+ "Ao final, mostra a soma dos N números lidos. \n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número \"N\" : ");
		int N = sc.nextInt();		
		int soma = 0;
		
		for(int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		System.out.println("Soma = " + soma);
		sc.close();
	}

}
