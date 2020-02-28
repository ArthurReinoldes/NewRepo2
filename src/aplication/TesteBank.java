package aplication;

import entities.Conta;
import java.util.*;

public class TesteBank {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.println("Conta :");
		int account = read.nextInt();
		System.out.println("Nome do Cliente :");
		String Holder = read.next();

		Conta cc = new Conta(account, Holder);

	}

}
