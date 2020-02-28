import java.util.*;

public class uri1044 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		if (a > b) {
			int temp = b;
			b = a;
			a = temp;
		}

		if (b % a == 0) {
			System.out.println("MULTIPLOS");
		} else {
			System.out.println("NÃO SÃO MULTIPLOS");
		}

	}

}
