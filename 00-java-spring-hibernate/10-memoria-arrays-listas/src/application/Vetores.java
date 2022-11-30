package application;

import java.util.Locale;
import java.util.Scanner;

/*
 * Vetores - em programação, "vetor" é o nome dado a arranjos unidimensionais.
 * Arranjo (array) é uma estrutura de dados:
 *    Homogênea (dados do mesmo tipo);
 *    Ordenada (elementos acessados por meio de posições);
 *    Alocada de uma vez só, em um bloco contíguo de memória.
 * 
 * Vantagens:
 *    Acesso imediato aos elementos pela sua posição.
 * Desvantagens:
 *    Tamanho fixo;
 *    Dificuldade para se realizar inserções e deleções.
 * 
 * Exemplo 1 :
 *    Fazer um programa para ler um número inteiro N e a altura de N pessoas. 
 *    Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas.
 *    
 * */

public class Vetores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i=0; i < n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		sc.close();
	}

}
