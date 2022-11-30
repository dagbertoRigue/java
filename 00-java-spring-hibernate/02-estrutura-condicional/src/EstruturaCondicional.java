import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("EXPRESSÕES COMPARATIVAS :");
		System.out.println("Utilizamos os operadores '>' (maior), '<' (menor), '>=' (maior ou igual), '<=' (menor ou igual), \n"
				+ "'==' (igual) e '!=' (diferente), quando precisamos fazer comparações. \n");
	
		int x = 5;
		boolean resposta = x > 0;
		System.out.println("A resposta para x > 0 = " + resposta + ", porque 5 é maior que 0. \n");
		
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("EXPRESSÕES LÓGICAS :");
		System.out.println("Utilizamos os operadores '&&' (E), '||' (OU) e '!' (NÃO), quando precisamos fazer verificações lógicas. \n");
		
		int y = 10;
		int z = 20;
		boolean a = y > 0 && z < 1;
		System.out.println("A resposta para y > 0 E z < 1 é " + a + ", porque apesar de y ser maior que 0, z não é menor que 1. \n");
		
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("Estrutura condicional : é uma estrutura de controle que permite definir que \n"
				+ "um certo bloco de comandos somente será executado dependendo de uma condição.");
		System.out.println("Exemplo 1");
		int b = 10;
		if(b < 0) {
			System.out.println("a é menor que 0");
		} else {
			System.out.println("a não é menor que 0");
		}
		
		System.out.println();
		System.out.println("Exemplo 2 - condição simples");
		
		Scanner sc = new Scanner(System.in);		
		int hora;
		System.out.println("Quantas horas ?");
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("Bom dia !");
		}
		else {
			System.out.println("Boa tarde !");
		}
		
		System.out.println();
		System.out.println("Exemplo 3 - condição composta");
		
		System.out.println("Quantas horas ?");
		hora = sc.nextInt();
		
		if(hora < 18) {
			if(hora < 12) {
				System.out.println("Bom dia !");
			}
			else {
				System.out.println("Boa tarde !");
			}
		}
		else {
			System.out.println("Boa noite !");
		}
		
		sc.close();
	}

}
