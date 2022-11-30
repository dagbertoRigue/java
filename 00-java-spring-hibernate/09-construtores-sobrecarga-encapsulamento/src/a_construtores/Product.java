package a_construtores;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	/*Declarando o construtor da classe : */
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double TotalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;  //a palavra reservada "this" informa que o quantity a ser usado é o da atributo da classe e não o parâmetro da função addProduct.
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
				+ ", $" 
				+ String.format("%.2f", price)  
				+ ", " 
				+ quantity 
				+ " units, Total: $" 
				+ String.format("%.2f", TotalValueInStock());
	}

}
