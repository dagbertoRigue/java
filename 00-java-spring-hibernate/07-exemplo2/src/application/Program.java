package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

/*
 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). 
 * Em seguida, mostrar os dados do funcionário (nome e salário líquido). 
 * Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada 
 * (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. 
 * Use a classe projetada abaixo:
 *               __________________________________________
 *              |            Employee                      |
 *              |__________________________________________|
 *              |-Name: String                             |
 *              |-GrossSalary: double                      |
 *              |-Tax: double                              |
 *              |__________________________________________|
 *              |+NetSalary(): double                      |
 *              |+IncreaseSalary(percentage: double): void |
 *              |+Diagonal(): double                       |
 *              |__________________________________________|
 *              
 * Teste de mesa : 
 * 
 * Name: Joao Silva
 * Gross salary: 6000.00 
 * Tax: 1000.00 
 * Employee: Joao Silva, $ 5000.00
 * Which percentage to increase salary? 10.0
 * Updated data: Joao Silva, $ 5600.00
 *              
 * */
public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Nome: ");
		emp.name = sc.nextLine();
		System.out.println("Salário Bruto: ");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Imposto: ");
		emp.tax = sc.nextDouble();
		
		System.out.println(emp.toString());
		
		System.out.println("Qual porcentagem para incrementar o salário ?");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println("Atualização de salário : " + emp);

		sc.close();
	}

}
