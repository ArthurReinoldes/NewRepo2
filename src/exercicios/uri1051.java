import java.util.*;

public class uri1051 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double valor = scan.nextDouble();
		double total = 0, parcial = 0;

		if (valor > 4500.0) {
			parcial = valor - 4500.0;
			total = total + (parcial * 0.28);
			valor = valor - parcial;
		}
		if (valor > 3000.0) {
			parcial = valor - 3000.0;
			total = total + (parcial * 0.18);
			valor = valor - parcial;
		}
		if (valor > 2000) {
			parcial = valor - 2000;
			total = total + (parcial * 0.08);
			valor = valor - parcial;
		}

		if (total == 0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", total);
		}
	}
}
