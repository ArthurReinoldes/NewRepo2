import java.util.*;

public class uri1072 {

	public static void main (String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int in = 0;
		int out = 0;
		
		for(int x = 0; x < n; x++) {
			int leitura = scan.nextInt();
			if(leitura >= 10 && leitura <= 20) {
				in += 1;
			}else {
				out += 1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
	}
}
