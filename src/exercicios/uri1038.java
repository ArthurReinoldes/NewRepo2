import java.util.*;

public class uri1038 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int codigo = scan.nextInt();
		int quantidade = scan.nextInt();
		double valor = 0, total;

		if (codigo == 1) {
			valor = 4.00;
		} else if (codigo == 2) {
			valor = 4.50;
		} else if (codigo == 3) {
			valor = 5.00;
		} else if (codigo == 4) {
			valor = 2.00;
		} else if (codigo == 5) {
			valor = 1.50;
		}

		total = valor * quantidade;
		
		System.out.printf("Total: R$ %.2f%n", total);

		scan.close();

	}

}
