import java.util.Scanner;

public class OperadoresBitwise {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("Operações Bitwise \n");
		System.out.println("Operadores bitwise são utilizados quando precisamos realizar operações em nível de bits com números inteiros, \n"
				+ "ou seja, trabalhar com sua representação binária. A operação é feira bit a bit, respeitando a tabela verdade.\n");
		
		System.out.println(" C1 | C2 | C1&C2        C1 | C2 | C1|C2         C1 | C2 | C1^C2 ");
		System.out.println("-----------------       ---------------         ----------------");
		System.out.println("  F |  F |   F           F |  F |   F            F |  F |   F   ");
		System.out.println("  F |  V |   F           F |  V |   V            F |  V |   V   ");
		System.out.println("  V |  F |   F           V |  F |   V            V |  F |   V   ");
		System.out.println("  V |  V |   V           V |  V |   V            V |  V |   F   \n");
		
		int n1 = 89;
		int n2 = 60;
		System.out.println("Exemplo :");
		System.out.println("0101 1001 (89)");
		System.out.println("0011 1100 (60)");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("O operador & ( Bitwise AND ) compara dois valores utilizando suas representações binárias, retornando um novo valor.");
		System.out.println("0101 1001 & 0011 1100 = 0001 1000 (" + (n1 & n2) + ")");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("O operador | ( Bitwise OR ) compara dois valores utilizando suas representações binárias, retornando um novo valor.");
		System.out.println("0101 1001 | 0011 1100 = 0111 1101 (" + (n1 | n2) + ")");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("O operador ^ ( Bitwise XOR ) compara dois valores utilizando suas representações binárias, retornando um novo valor."); 
		System.out.println("0101 1001 ^ 0011 1100 = 0110 0101 (" + (n1 ^ n2) + ")");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Exemplo de utilização : quando é preciso comparar um ip :");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ip para testar o sexto bit : ");
		int mask = 0b00100000; //como representamos um número binário. adicionando "0b" no início. Nesse exemplo, queremos verificar apenas o sexto bit
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false");
		}
		
		sc.close();
	}

}
