package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

/*
 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
 * uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
 * que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
 * para ser responsável pelos cálculos.
 * 
 * Teste de mesa : 
 * What is the dollar price? 3.10
 * How many dollars will be bought? 200.00
 * Amount to be paid in Reais = 657.20
 * */

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double amount = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		sc.close();
	}

}
