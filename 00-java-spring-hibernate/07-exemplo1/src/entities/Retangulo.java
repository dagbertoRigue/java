package entities;

public class Retangulo {
	public double a;
	public double b;
	
	public double Area() {
		double area = a * b;
		return area;
	}
	
	public double Perimeter() {
		double perimeter = (a * 2) + (b * 2);
		return perimeter;
	}
	
	public double Diagonal() {
		double diagonal = Math.sqrt(a * a + b * b);
		return diagonal;
	}	
}
