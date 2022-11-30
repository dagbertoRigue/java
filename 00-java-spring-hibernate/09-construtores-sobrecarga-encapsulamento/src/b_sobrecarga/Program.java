package b_sobrecarga;

import java.util.Locale;
import java.util.Scanner;

/*
 * Palavra "this" : é uma referência para o próprio objeto
 *    Usos comuns:
 *       Diferenciar atributos de variáveis locais;
 *       Passar o próprio objeto como argumento na chamada de um método ou construtor.
 *       
 * Sobrecarga : 
 *    É um recurso que uma classe possui de oferecer mais de uma operação 
 *    com o mesmo nome, porém com diferentes listas de parâmetros.
 *    
 * Proposta de melhoria :
 *    Vamos criar um construtor opcional, o qual recebe apenas nome e 
 *    preço do produto. A quantidade em estoque deste novo produto, por
 *    padrão, deverá então ser iniciada com o valor zero.
 * 
 * Nota: é possível também incluir um construtor padrão.
*/

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
