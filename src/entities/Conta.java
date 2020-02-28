package entities;

import java.util.*;

public class Conta {
	
	private int Number;
	public String Holder;
	protected double Currency;

	Scanner scan = new Scanner(System.in);

	public Conta(int Number, String Holder) {
		this.Number = Number;
		this.Holder = Holder;

		System.out.println("There is any initial deposit? ");

		char Verify = scan.next().charAt(0);

		if (Verify == 'y') {
			System.out.println("informe o valor do depósito :");
			double currency = scan.nextDouble();
			this.Currency += currency;
			
		}
		System.out.printf("Número da conta : %d%n", this.Number);
		System.out.printf("Holder : %s%n", this.Holder);
		System.out.printf("Saldo : %.2f%n", this.Currency);

	}

	public String getHolder() {
		return Holder;
	}

	public void setHolder(String holder) {
		Holder = holder;
	}

	public double getCurrency() {
		return Currency;
	}

	public void Deposit(double currency) {
		Currency = currency;
	}

}
