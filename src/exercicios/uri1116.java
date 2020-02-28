import java.util.*;

public class uri1116 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int x = 0; x < n; x++) {

			double a = scan.nextDouble();
			double b = scan.nextDouble();
			
			if (b == 0) {
				System.out.println("divisao impossivel");
			}else {
				System.out.printf("%.1f%n", a/b);
			}
			
		}
	}

}
