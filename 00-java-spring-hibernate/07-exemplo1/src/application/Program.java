package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

/*
 * Fazer um programa para ler os valores da largura e altura de um retângulo. 
 * Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. 
 * Usar uma classe como mostrado no diagrama UML.
 *               __________________________________
 *              |            Rectangle             |
 *              |__________________________________|
 *              |-Width: double                    |
 *              |-Height: double                   |
 *              |__________________________________|
 *              |+Area(): double                   |
 *              |+Perimeter(): double              |
 *              |+Diagonal(): double               |
 *              |__________________________________|
 *
 *
 * Teste de mesa : 
 * Enter rectangle width and height:
 * 3.00
 * 4.00
 * AREA = 12.00
 * PERIMETER = 14.00
 * DIAGONAL = 5.00
 * 
 */

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo rectangle = new Retangulo();
		
		System.out.println("Enter rectangle width and height:");
		rectangle.a = sc.nextDouble();
		rectangle.b = sc.nextDouble();
		
		System.out.println("Informado largura : " + rectangle.a + " e altura : " + rectangle.b);
		System.out.println("Area = " + rectangle.Area()
		                             + "\n Perimeter = " + rectangle.Perimeter()
		                             + "\n Diagonal = " + rectangle.Diagonal());
		
		sc.close();
		
	}

}
