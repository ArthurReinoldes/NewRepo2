import java.util.*;

public class uri1114 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int senha = scan.nextInt();

		while (senha != 2002) {
			System.out.println("SENHA INCORRETA");
			senha = scan.nextInt();
		}
		System.out.println("SENHA CORRETA");
	}

}
