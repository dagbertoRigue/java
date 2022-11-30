import java.util.Scanner;

public class ExemplosFor {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("Exemplo 1 : Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, "
				+ "inclusive X, se for o caso.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o limite superior para ver os ímpares de 1 até ele.");
		int x = sc.nextInt();		
		
		for(int i=1; i <= x; i++) {
			if(i % 2 != 0) {
				System.out.println("i = " + i);
			}
		}
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("Exemplo 2 : Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.\n"
				+ "Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando\n"
				+ "essas informações conforme exemplo (use a palavra \"in\" para dentro do intervalo, e \"out\" para fora do intervalo)..");
		
		System.out.println("Digite quantos números deseja testar dentro do intervalo [10,20] : ");
		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite um dos " + n + " números a serem testados");
			int y = sc.nextInt();
			if (y >= 10 && y <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
