package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

/*
 * 
 * Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque). 
 * Em seguida: 
 * Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
 * Realizar uma entrada no estoque e mostrar novamente os dados do produto
 * Realizar uma saída no estoque e mostrar novamente os dados do produto
 * 
 * Diagrama UML :__________________________________
 *              |              Product             |
 *              |__________________________________|
 *              |-Name: string                     |
 *              |-Price: double                    |
 *              |-Quantity: int                    |
 *              |__________________________________|
 *              |+TotalValueInStock(): double      |
 *              |+AddProduct(quantity:int):void    |
 *              |+RemoveProduct(quantity:int):void |
 *              |__________________________________|
 */

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data : ");
		System.out.println("Name : ");
		product.name = sc.nextLine();
		System.out.println("Price : ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock : ");
		product.quantity = sc.nextInt();		
		
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
