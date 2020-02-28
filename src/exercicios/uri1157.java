import java.util.*;

public class uri1157 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		
		for(int y = 1; y <= x; y++) {
		
			if( x % y == 0) {
				System.out.println(y);
			}
		}

	}

}
