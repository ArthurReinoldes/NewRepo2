package entities;

public class NotaFinal {

	public double Nota1;
	public double Nota2;
	public double Nota3;

	public void MediaFinal() {
		double NotaFinal = Nota1 + Nota2 + Nota3;
		System.out.printf("FINAL GRADE = %.2f %n", NotaFinal);
		if (NotaFinal >= 60.0) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60.0 - NotaFinal);
		}
	}
}
