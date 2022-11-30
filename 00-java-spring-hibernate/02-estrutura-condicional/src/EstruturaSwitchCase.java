import java.util.Scanner;

public class EstruturaSwitchCase {

	public static void main(String[] args) {
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"Quando se tem várias opções de fluxo a serem tratadas com base no valor de uma variável, ao invés de várias\n"
						+ "estruturas if-else encadeadas, alguns preferem utilizar a estrutura switch-case.\n");
		System.out.println("Sintaxe :");
		System.out.println("swich(variável a receber) {");
		System.out.println("case 'valor1': - opção enumerada");
		System.out.println("	faz a função de acordo com o número;");
		System.out.println("	break; - encerra a função");
		System.out.println("repete o case, quantas forem as opções");
		System.out.println("default : - usado para uma função fpra das opções");
		System.out.println("	função para case fora das opções");
		System.out.println("	break; - encerra a função");
		System.out.println("} \n");

		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"Exemplo : Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana\n"
						+ "(sendo 1=domingo, 2=segunda, e assim por diante). Escrever na tela o dia da semana correspondente, conforme exemplos.");

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número para ver o dia da semana correspondente : ");
		int x = sc.nextInt();
		String dia;
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda-feira";
			break;
		case 3:
			dia = "terca-feira";
			break;
		case 4:
			dia = "quarta-feira";
			break;
		case 5:
			dia = "quinta-feira";
			break;
		case 6:
			dia = "sexta-feira";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor inválido";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}

}
