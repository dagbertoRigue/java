package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double TotalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;  //a palavra reservada "this" informa que o quantity a ser usado é o da atributo da classe e não o parâmetro da função addProduct.
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	/*
	 * Toda classe em Java é uma subclasse da classe Object
	 * Object possui os seguintes métodos:
	 * getClass- retorna o tipo do objeto
	 * equals - compara se o objeto é igual a outro
	 * hashCode - retorna um código hash do objeto
	 * toString - converte o objeto para string
	 * 
	 * Para tornar o método toString de acordo com o que queremos que seja impresso,
	 * podemos fazer uma classe para "sobreposição" da classe padrão.
	 * 
	 * */
	
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
