import java.util.*;


public class uri1079 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int x = 0; x < n; x++) {
			
			double a = scan.nextDouble();
			double b = scan.nextDouble();
			double c = scan.nextDouble();
			
			double media = ((a * 2) + (b * 3) + (c * 5))/10;
			
			System.out.printf("%.1f%n", media);
		}

	}

}
