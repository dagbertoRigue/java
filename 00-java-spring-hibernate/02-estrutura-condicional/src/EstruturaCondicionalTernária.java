
public class EstruturaCondicionalTernária {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("Expressão condicional ternária é uma outra opção ao if-else quando se deseja decidir um VALOR com base em uma condição.");
		System.out.println("Sintaxe :");
		System.out.println("(condição) ? valor_se_verdadeiro : valor_se_falso");
		System.out.println();
		
		System.out.println("Exemplo com if-else:");
		double preco = 34.5;
		double desconto;
		if(preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
		System.out.println("Desconto : " + desconto);
		
		System.out.println("Exemplo com condicional ternária :");
		double price = 34.5;
		double discount = (price < 20) ? price * 0.1 : price * 0.05;

		System.out.println("Desconto : " + discount);
	}

}
