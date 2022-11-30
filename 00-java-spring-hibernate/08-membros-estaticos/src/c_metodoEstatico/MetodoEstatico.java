package c_metodoEstatico;

import java.util.Locale;
import java.util.Scanner;

import c_util.Calculator2;

/*
 * Os valores dos cálculos não mudam para calculadoras diferentes, ou seja, são cálculos estáticos.
 * O valor de PI também é static.
 * 
 * Por causa disso, não é preciso instanciar a calculadora no método main.
 * */

public class MetodoEstatico {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter radius : ");
		double radius = sc.nextDouble();
		
		double c = Calculator2.circumference(radius);
		double v = Calculator2.volume(radius);

		System.out.printf("Circumference : %.2f%n", c);
		System.out.printf("Volume : %.2f%n", v);
		System.out.printf("PI value : %.2f%n", Calculator2.PI);
		
		sc.close();
	}

}
