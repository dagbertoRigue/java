package c_util;

/*
 * Os valores dos cálculos não mudam para calculadoras diferentes, ou seja, são cálculos estáticos.
 * O valor de PI também é static.
 * 
 * Por causa disso, não é preciso instanciar a calculadora no método main.
 * */

public class Calculator2 {
	
	public static final double PI = 3.14159;
		
		public static double circumference(double radius) {
			return 2.0 * PI * radius;
		}
		
		public static double volume(double radius) {
			return 4.0 * PI * radius * radius * radius / 3.0;
		}
}