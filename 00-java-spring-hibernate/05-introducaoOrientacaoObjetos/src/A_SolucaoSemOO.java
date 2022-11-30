import java.util.Locale;
import java.util.Scanner;

public class A_SolucaoSemOO {

	public static void main(String[] args) {
		/*Resolução sem Orientação a Objetos para comparar as soluções*/
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("Exemplo sem Orientação a Objetos : \n "
				+ "Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas).\n"
				+ "Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a maior área. \n"
				+ "A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a seguinte (fórmula de Heron): \n"
				+ "area = √p(p-a)(p-b)(p-c)      \n"
				+ "onde p = (a+b+c)/2            \n\n");
		System.out.println("Teste de mesa : \n"
				+ "Enter the measures of triangle X :  \n"
				+ "3.00                                \n"
				+ "4.00                                \n"
				+ "5.00                                \n"
				+ "Enter the measures of triangle Y    \n"
				+ "7.50                                \n"
				+ "4.50                                \n"
				+ "4.02                                \n"
				+ "Triangle X area : 6.0000            \n"
				+ "Triangle Y area : 7.5638            \n"
				+ "Larger area : Y                     \n");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Enter the measures of triangle X : ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y : ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangle X area : %.4f%n", areaX);
		System.out.printf("Triangle Y area : %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area : X");
		}
		else {
			System.out.println("Larger area : Y");
		}
		
		sc.close();
	}

}
