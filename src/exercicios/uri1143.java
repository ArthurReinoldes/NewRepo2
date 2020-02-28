import java.util.*;

public class uri1143 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		
		for(int y=1; y <= x ; y++) {
			System.out.printf("%d %d %d\n", y, y*y, y*y*y);
		}

	}

}
