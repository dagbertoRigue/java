package a_construtores;

import java.util.Locale;
import java.util.Scanner;

/*
 * Construtores
 *    
 * É uma operação especial da classe, que executa no momento da instanciação do objeto.
 *    
 * Usos comuns:
 *    Iniciar valores dos atributos;
 *    Permitir ou obrigar que o objeto receba dados / dependências no momento de sua instanciação (injeção de dependência)
 *   
 * Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão:
 *    Product p = new Product();
 * É possível especificar mais de um construtor na mesma classe (sobrecarga)
 * 
 * Melhorando o exemplo do repositório 06-introducaoOrientacaoObjetos2 :
 *  Criação do método construtor na classe Product
 *  Eliminação do construtor padrão (Product product = new Product();)
 *  Alteração das variáveis que recebem name, price e quantity para variáveis locais
 *  Adição do novo construtor após as variáveis locais.
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
		System.out.println("Quantity in stock : ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		
		System.out.println("Product data : " + product.toString());
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
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
