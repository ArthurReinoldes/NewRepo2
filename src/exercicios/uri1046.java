import java.util.*;

public class uri1046 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int duracao;
		
		if (b > a) {
			
			duracao = b - a;
		
		}else {
		
			duracao = (24 - a) + b;
			
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

	}

}
