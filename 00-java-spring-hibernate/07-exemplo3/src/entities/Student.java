package entities;

public class Student {
	public String name;
	public double nota1Trim;
	public double nota2Trim;
	public double nota3Trim;
	
	public double notaFinal() {
		return nota1Trim + nota2Trim + nota3Trim;
	}
	
	public double pontos() {
		if(notaFinal() < 60.0) {
			return 60 - notaFinal();
		}
		else {
			return 0.0;
		}
	}
	
	public String toString() {
		return name 
				+ "\n" + String.format("%.1f", nota1Trim)
				+ "\n" + String.format("%.1f", nota2Trim)
				+ "\n" + String.format("%.1f", nota3Trim)
				+ "\n Nota Final = " + notaFinal();
		
	}
}
