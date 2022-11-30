package a_metodosNaPropriaClasse;

import java.util.Locale;
import java.util.Scanner;

/*
 * Membros estáticos :
 * Também chamados membros de classe, em oposição a membros e instância.
 * São membros que fazem sentido independentemente de objetos. 
 * Não precisam de objeto para serem chamados. São chamados a partir do próprio nome da classe.
 * Aplicações comuns:
 *  Classes utilitárias (Math.sqrt(double)
 *  Declaração de constantes
 * Uma classe que possui somente membros estáticos, pode ser uma classe estática também. 
 * Esta classe não poderá ser instanciada.
 * 
 * 
 * Problema exemplo :
 *  Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto 
 *  seria o valor de uma circunferência e do volume de uma esfera para um raio 
 *  daquele valor. Informar também o valor de PI com duas casas decimais.
 *  
 *  Exemplo : 
 *   Enter radius: 3.0
 *   Circumference: 18.85
 *   Volume: 113.10
 *   PI value: 3.14
 *   
 *   Versão 1: métodos na própria classe do programa. 
 *     Nota1: dentro de um método estático você não pode chamar membros de instância da mesma classe.
 *     Nota2: todos os métodos chamados devem ser static, pois a classe main é static.
 *   Versão 2: classe Calculator com membros de instância.
 *     Nota1: não é necessário criar métodos static, porém é obrigatório instanciá-los no main.
 *   Versão 3: classe Calculator com método estático.
 *   
 * */

public class MembrosEstaticos {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter radius : ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		double v = volume(radius);

		System.out.printf("Circumference : %.2f%n", c);
		System.out.printf("Volume : %.2f%n", v);
		System.out.printf("PI value : %.2f%n", PI);
		
		sc.close();
	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
