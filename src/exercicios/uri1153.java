import java.util.*;

public class uri1153 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int fatorial = 1;
		
		for(int y = x; y > 0; y--) {
			fatorial = fatorial * y;
		}
		System.out.println(fatorial);
	}

}
