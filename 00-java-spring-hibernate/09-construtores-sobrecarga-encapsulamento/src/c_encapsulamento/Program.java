package c_encapsulamento;

import java.util.Locale;
import java.util.Scanner;

import b_sobrecarga.Product;

/*
 * Encapsulamento : é um princípio que consiste em esconder detalhes de implementação
 * de uma classe, expondo apenas operações seguras e que mantenham os objetos em um 
 * estado consistente.
 * 
 * Regra de ouro : 
 *    o objeto deve sempre estar em um estado consistente, 
 *    e a própria classe deve garantir isso.
 * 
 * Regra geral básica :
 *    Um objeto NÃO deve expor nenhum atributo (modificador de acesso private);
 *    Os atributos devem ser acessados por meio de métodos get e set.
 *    
 * Padrão JavaBeans: https://en.wikipedia.org/wiki/JavaBeans
 *    
 * */

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data : ");
		System.out.println("Name : ");
		String name = sc.nextLine();
		System.out.println("Price : ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);
		
		/*Testando os métodos de encapsulamento*/
		product.setName("Computer");
		System.out.println("Update name : " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Update price : " + product.getPrice());
		/*O atributo quantity não deve possuir o método set para esse exemplo.
		 * Isso porque a quantidade do produto em estoque poderá ser alterada somente
		 * pelos métodos de adição e remoção de itens do estoque, para proteger as 
		 * regras do negócio do sistema.
		 * */
		
		
		System.out.println("Product data : " + product.toString());
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();

	}

}
